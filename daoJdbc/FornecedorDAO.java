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

import util.SessaoJdbc;


import dto.DadosFornecedor;
import Interface.IFFornecedor;

public class FornecedorDAO implements IFFornecedor{

	public void alterar(DadosFornecedor fornecedor) {
		String sql = "UPDATE fornecedor SET fornecedor_nome = ?, fornecedor_contato =?,  fornecedor_cgccpf =?, fornecedor_telfax =?, fornecedor_endereco=?, fornecedor_bairro=?,  fornecedor_cidade=?,  fornecedor_cep =?, fornecedor_uf=?,  fornecedor_ie=?, fornecedor_email=? WHERE fornecedor_codigo=?";
		Connection con = null; 
		ResultSet rs =null;
		PreparedStatement stmt = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, fornecedor.getFornecedorNome());
			stmt.setString(2, fornecedor.getFornecedorContato());
			stmt.setString(3, fornecedor.getFornecedorCGCCPF());
			stmt.setString(4,fornecedor.getFornecedorTELFAX());
			stmt.setString(5,fornecedor.getFornecedorEndereco());
			stmt.setString(6,fornecedor.getFornecedorBairro());
			stmt.setString(7,fornecedor.getFornecedorCidade());
			stmt.setString(8,fornecedor.getFornecedorCep());
			stmt.setInt(9,fornecedor.getFornecedorUF());
			stmt.setString(10,fornecedor.getFornecedorIE());
			stmt.setString(11,fornecedor.getFornecedorEmail());
			stmt.setInt(12, fornecedor.getFornecedorCodigo());
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		
		// TODO Auto-generated method stub

	}

	
	

	public void excluir(DadosFornecedor fornecedor) {
		String sql="DELETE FROM fornecedor where fornecedor_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setInt(1, fornecedor.getFornecedorCodigo());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		// TODO Auto-generated method stub
		
		
	}

	

	
		
	public void pesquisaFornecedorCodigo(DadosFornecedor fornecedor){
		String sql ="SELECT fornecedor_nome FROM fornecedor WHERE fornecedor_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, fornecedor.getFornecedorCodigo());
			
								
			rs = stmt.executeQuery();
			while(rs.next()){
			fornecedor.setFornecedorNome(rs.getString(1));
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}
	public void pesquisaFornecedorNome(DadosFornecedor fornecedor){
		String sql ="SELECT fornecedor_nome FROM fornecedor WHERE fornecedor_nome like '%?%'";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,fornecedor.getFornecedorNome());
			
								
			rs = stmt.executeQuery();
			while(rs.next()){
			fornecedor.setFornecedorNome(rs.getString(1));
			}
			
		} catch (SQLException e) {

			
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}
		
		
	
		
		
	

	public void incluir(DadosFornecedor fornecedor) {
		String sql = "insert into fornecedor(fornecedor_nome, fornecedor_contato, fornecedor_cgccpf, fornecedor_telfax, fornecedor_endereco, fornecedor_bairro,  fornecedor_cidade,  fornecedor_cep, fornecedor_uf,  fornecedor_ie, fornecedor_email)values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
					
			stmt.setString(1, fornecedor.getFornecedorNome());
			stmt.setString(2, fornecedor.getFornecedorContato());
			stmt.setString(3, fornecedor.getFornecedorCGCCPF());
			stmt.setString(4,fornecedor.getFornecedorTELFAX());
			stmt.setString(5,fornecedor.getFornecedorEndereco());
			stmt.setString(6,fornecedor.getFornecedorBairro());
			stmt.setString(7,fornecedor.getFornecedorCidade());
			stmt.setString(8,fornecedor.getFornecedorCep());
			stmt.setInt(9,fornecedor.getFornecedorUF());
			stmt.setString(10,fornecedor.getFornecedorIE());
			stmt.setString(11,fornecedor.getFornecedorEmail());
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
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
	

	




	public void pesquisaFornecedorJlist(DadosFornecedor fornecedor) {
		String sql ="SELECT fornecedor_nome, fornecedor_contato, fornecedor_cgccpf, fornecedor_telfax, fornecedor_endereco, fornecedor_bairro, fornecedor_cidade, fornecedor_cep, fornecedor_uf,  fornecedor_ie, fornecedor_email, fornecedor_codigo FROM fornecedor WHERE fornecedor_nome = ?";
		
		
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,fornecedor.getFornecedorNome());
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
			
			
			fornecedor.setFornecedorNome(rs.getString(1));
			fornecedor.setFornecedorContato(rs.getString(2));
			fornecedor.setFornecedorCGCCPF(rs.getString(3));
			fornecedor.setFornecedorTELFAX(rs.getString(4));
			fornecedor.setFornecedorEndereco(rs.getString(5));
			fornecedor.setFornecedorBairro(rs.getString(6));
			fornecedor.setFornecedorCidade(rs.getString(7));
			fornecedor.setFornecedorCep(rs.getString(8));
			fornecedor.setFornecedorUF(rs.getInt(9));
			fornecedor.setFornecedorIE(rs.getString(10));
			fornecedor.setFornecedorEmail(rs.getString(11));
			fornecedor.setFornecedorCodigo(rs.getInt(12));
		
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}
	
	public Collection<DadosFornecedor> findByParam(HashMap<String, String> map) throws SQLException {
		String[] campos = {"fornecedor_nome", "fornecedor_contato", "fornecedor_cgccpf", "fornecedor_telfax", "fornecedor_endereco", "fornecedor_bairro",  "fornecedor_cidade",  "fornecedor_cep", "fornecedor_uf",  "fornecedor_ie", "fornecedor_email", "fornecedor_codigo"};
		String campo = "";
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
		String sql = "SELECT * FROM fornecedor WHERE " +campo+ " like ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosFornecedor> list = new LinkedList<DadosFornecedor>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo)+"%");
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosFornecedor fornecedor = new DadosFornecedor();
				
				
				fornecedor.setFornecedorNome(rs.getString("fornecedor_nome"));
				fornecedor.setFornecedorContato(rs.getString("fornecedor_contato"));
				fornecedor.setFornecedorCGCCPF(rs.getString("fornecedor_cgccpf"));
				fornecedor.setFornecedorTELFAX(rs.getString("fornecedor_telfax"));
				fornecedor.setFornecedorEndereco(rs.getString("fornecedor_endereco"));
				fornecedor.setFornecedorBairro(rs.getString("fornecedor_bairro"));
				fornecedor.setFornecedorCidade(rs.getString("fornecedor_cidade"));
				fornecedor.setFornecedorCep(rs.getString("fornecedor_cep"));
				fornecedor.setFornecedorUF(rs.getInt("fornecedor_uf"));
				fornecedor.setFornecedorIE(rs.getString("fornecedor_ie"));
				fornecedor.setFornecedorEmail(rs.getString("fornecedor_email"));
				fornecedor.setFornecedorCodigo(rs.getInt("fornecedor_codigo"));
				
				
				list.add(fornecedor);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (list.isEmpty())?null:list;
	}




	public void primeiro(DadosFornecedor fornecedor) {
		String sql = "SELECT fornecedor_nome, fornecedor_contato, fornecedor_cgccpf, fornecedor_telfax, fornecedor_endereco, fornecedor_bairro,  fornecedor_cidade,  fornecedor_cep, fornecedor_uf,  fornecedor_ie, fornecedor_email, fornecedor_codigo FROM fornecedor ORDER BY fornecedor_codigo asc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				fornecedor.setFornecedorNome(rs.getString(1));
				fornecedor.setFornecedorContato(rs.getString(2));
				fornecedor.setFornecedorCGCCPF(rs.getString(3));
				fornecedor.setFornecedorTELFAX(rs.getString(4));
				fornecedor.setFornecedorEndereco(rs.getString(5));
				fornecedor.setFornecedorBairro(rs.getString(6));
				fornecedor.setFornecedorCidade(rs.getString(7));
				fornecedor.setFornecedorCep(rs.getString(8));
				fornecedor.setFornecedorUF(rs.getInt(9));
				fornecedor.setFornecedorIE(rs.getString(10));
				fornecedor.setFornecedorEmail(rs.getString(11));
				fornecedor.setFornecedorCodigo(rs.getInt(12));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}




	public void ultimo(DadosFornecedor fornecedor) {
		String sql ="SELECT fornecedor_nome, fornecedor_contato, fornecedor_cgccpf, fornecedor_telfax, fornecedor_endereco, fornecedor_bairro,  fornecedor_cidade,  fornecedor_cep, fornecedor_uf,  fornecedor_ie, fornecedor_email, fornecedor_codigo FROM fornecedor ORDER BY fornecedor_codigo desc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				fornecedor.setFornecedorNome(rs.getString(1));
				fornecedor.setFornecedorContato(rs.getString(2));
				fornecedor.setFornecedorCGCCPF(rs.getString(3));
				fornecedor.setFornecedorTELFAX(rs.getString(4));
				fornecedor.setFornecedorEndereco(rs.getString(5));
				fornecedor.setFornecedorBairro(rs.getString(6));
				fornecedor.setFornecedorCidade(rs.getString(7));
				fornecedor.setFornecedorCep(rs.getString(8));
				fornecedor.setFornecedorUF(rs.getInt(9));
				fornecedor.setFornecedorIE(rs.getString(10));
				fornecedor.setFornecedorEmail(rs.getString(11));
				fornecedor.setFornecedorCodigo(rs.getInt(12));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}




		public void pesquisaRegistro(DadosFornecedor fornecedor) {
		String sql ="SELECT fornecedor_nome, fornecedor_contato, fornecedor_cgccpf, fornecedor_telfax, fornecedor_endereco, fornecedor_bairro,  fornecedor_cidade,  fornecedor_cep, fornecedor_uf,  fornecedor_ie, fornecedor_email, fornecedor_codigo FROM fornecedor WHERE fornecedor_codigo = ?";
		
		
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setInt(1,fornecedor.getFornecedorCodigo());
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				fornecedor.setFornecedorNome(rs.getString(1));
				fornecedor.setFornecedorContato(rs.getString(2));
				fornecedor.setFornecedorCGCCPF(rs.getString(3));
				fornecedor.setFornecedorTELFAX(rs.getString(4));
				fornecedor.setFornecedorEndereco(rs.getString(5));
				fornecedor.setFornecedorBairro(rs.getString(6));
				fornecedor.setFornecedorCidade(rs.getString(7));
				fornecedor.setFornecedorCep(rs.getString(8));
				fornecedor.setFornecedorUF(rs.getInt(9));
				fornecedor.setFornecedorIE(rs.getString(10));
				fornecedor.setFornecedorEmail(rs.getString(11));
				fornecedor.setFornecedorCodigo(rs.getInt(12));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}




		public void createFornecedorDAO(DadosFornecedor fornecedor) {
			// TODO Auto-generated method stub
			
		}




	
	
}
