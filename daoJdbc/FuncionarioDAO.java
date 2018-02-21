package daoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.JOptionPane;

import util.SessaoJdbc;

import dto.DadosCliente;
import dto.DadosFuncionarios;
import Interface.IFFuncionario;

public class FuncionarioDAO implements IFFuncionario{

	public void alterarFuncionario(DadosFuncionarios func) {
		String sql = "UPDATE funcionario SET funcionario_nome=?, funcionario_endereco=?, funcionario_tel=? WHERE funcionario_codigo=?";
		Connection con = null;
		ResultSet rs =null;
		PreparedStatement stmt = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, func.getFuncionarioNome());
			stmt.setString(2, func.getFuncionarioEndereco());
			stmt.setString(3, func.getFuncionarioTel());
			stmt.setInt(4, func.getFuncionarioCodigo());
			
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		
		// TODO Auto-generated method stub

	}
	public void createFuncionarioDAO(DadosFuncionarios func) {
		// TODO Auto-generated method stub
		
	}

	public void excluirFuncionario(DadosFuncionarios func) {
		String sql="DELETE FROM funcionario where funcionario_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setInt(1, func.getFuncionarioCodigo());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		// TODO Auto-generated method stub
		
		
	}

	
	
	public void anterior(DadosFuncionarios func) {
		// TODO Auto-generated method stub
		
	}

	

	public Collection<DadosFuncionarios> findByAll(HashMap<String, String> map) throws SQLException {
		String[] campos = {"funcionario_nome","funcionario_endereco", "funcionario_tel", "funcionario_codigo"};
		String campo = "";
		int valor =0;
		Set<String> keys = map.keySet();//pega todas as chaves 
		Iterator<String> i = keys.iterator();// recebe a interacao entre as chaves
		String loop = i.next();	
		for(String campoTemp : campos){
			//varialvel que recebe os valores do "campos"
			// está jogando para dentro da string  o valor do campo
			// esse for equivale 
			/*
			 * for(int i=0;i<campos.length;i++){
			 * ...
			 * }
			 */
			if(loop.equals(campoTemp)){
				campo = campoTemp;
			}
		}
		if(campo.equals("")) {
			throw new SQLException("Campo nao Existente");
		}
		String sql = "SELECT * FROM funcionario WHERE funcionario_codigo > ? ORDER BY funcionario_nome asc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosFuncionarios> list = new LinkedList<DadosFuncionarios>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo));
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosFuncionarios func = new DadosFuncionarios();
								
				func.setFuncionarioNome(rs.getString("funcionario_nome"));
				func.setFuncionarioCodigo(Integer.parseInt(rs.getString("funcionario_codigo")));
				func.setFuncionarioEndereco(rs.getString("funcionario_endereco"));
				func.setFuncionarioTel(rs.getString("funcionario_tel"));
				
				list.add(func);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (list.isEmpty())?null:list;
	}

	public void pesquisaFuncionario(DadosFuncionarios func) {
		String sql ="SELECT funcionario_nome, funcionario_endereco, funcionario_tel FROM funcionario WHERE funcionario_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,func.getFuncionarioCodigo());
			
								
			rs = stmt.executeQuery();
			while(rs.next()){
			func.setFuncionarioNome(rs.getString(1));
			func.setFuncionarioEndereco(rs.getString(2));
			func.setFuncionarioTel(rs.getString(3));
			}
			
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "Não fora encontrado nenhum registro");
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void primeiro(DadosFuncionarios func) {
		String sql ="SELECT funcionario_nome, funcionario_endereco, funcionario_tel, funcionario_codigo  FROM funcionario ORDER BY funcionario_codigo asc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				func.setFuncionarioNome(rs.getString(1));
				func.setFuncionarioEndereco(rs.getString(2));
				func.setFuncionarioTel(rs.getString(3));
				func.setFuncionarioCodigo(rs.getInt(4));
				
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void proximo(DadosFuncionarios func) {
		// TODO Auto-generated method stub
		
	}

	public void ultimo(DadosFuncionarios func) {
		String sql ="SELECT funcionario_nome, funcionario_endereco, funcionario_tel, funcionario_codigo  FROM funcionario ORDER BY funcionario_codigo desc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				func.setFuncionarioNome(rs.getString(1));
				func.setFuncionarioEndereco(rs.getString(2));
				func.setFuncionarioTel(rs.getString(3));
				func.setFuncionarioCodigo(rs.getInt(4));
				
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void incluirFuncionario(DadosFuncionarios func) {
		String sql = "insert into funcionario(funcionario_nome,funcionario_tel,funcionario_endereco)values(?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int erro=0;
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, func.getFuncionarioNome());
			stmt.setString(2, func.getFuncionarioTel());
			stmt.setString(3, func.getFuncionarioEndereco());
			
			
			stmt.executeUpdate();
			
						
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			erro++;
		} finally {
			
			if(erro>=1){
				JOptionPane.showMessageDialog(null,"ERRO - O registro novo não pode ser incluído! o banco não deve esta conectado ");
				
			
			}else JOptionPane.showMessageDialog(null,"O registro foi incluído com sucesso ");
			
			
			closeObjectDAO(con, rs, stmt);
		}
	}
		



public void closeObjectDAO(Connection con, ResultSet rs,
		PreparedStatement stmt) {
	try {
		if (con != null)
			con.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}


}	
	