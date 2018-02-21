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


import dto.DadosDescricaoDePecas;
import Interface.IFDiscricao;

public class DiscricaoDAO implements IFDiscricao{

	public void alterar(DadosDescricaoDePecas pecas) {
		String sql = "UPDATE discricao SET discricao_marca = ?, discricao_discricao=?, discricao_modelo=?, discricao_minima=?, discricao_maxima=? WHERE discricao_nome = ?";
		Connection con = null; 
		ResultSet rs =null;
		PreparedStatement stmt = null;
		int resultado = 0;
		
				
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, pecas.getDadosDiscricaoDePecasMarca());
			stmt.setString(2, pecas.getDadosDiscricaoDePecasDescricao());
			stmt.setString(3, pecas.getDadosDiscricaoDePecasModelo());
			stmt.setInt(4, pecas.getDadosDiscricaoDePecasMinima());
			stmt.setInt(5, pecas.getDadosDiscricaoDePecasMaxima());
			stmt.setString(6, pecas.getDadosDiscricaoDePecasNome());
			
			
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			resultado++;
		}finally{
			if (resultado>0){
				JOptionPane.showMessageDialog(null, "O registro não pode ser atualizado!");
				
			}else{
				JOptionPane.showMessageDialog(null, "O registro atualizado com sucesso!");
				
			}			
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void excluir(DadosDescricaoDePecas pecas) {
		String sql="DELETE FROM discricao where discricao_nome = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int resultado = 0;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setString(1, pecas.getDadosDiscricaoDePecasNome());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			resultado++;
		}finally{
			if (resultado>0){
				JOptionPane.showMessageDialog(null, "O registro não pode ser excluido!");
				
			}else{
				JOptionPane.showMessageDialog(null, "O registro excluido com sucesso!");
				
			}
			closeObjectDAO(con, rs, stmt);
		}
		// TODO Auto-generated method stub
		
		
	}

	public Collection<DadosDescricaoDePecas> findByAll(HashMap<String, String> map) throws SQLException {
		String[] campos = {"discricao_nome","discricao_modelo","discricao_marca","discricao_discricao","discricao_minima","discricao_maxima"};
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
		String sql = "SELECT * FROM discricao WHERE discricao_nome <> ? ORDER BY discricao_nome asc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosDescricaoDePecas> list = new LinkedList<DadosDescricaoDePecas>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo));
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
				
				pecas.setDadosDiscricaoDePecasNome(rs.getString("discricao_nome"));
				pecas.setDadosDiscricaoDePecasDescricao(rs.getString("discricao_discricao"));
				pecas.setDadosDiscricaoDePecasMarca(rs.getString("discricao_marca"));
				pecas.setDadosDiscricaoDePecasModelo(rs.getString("discricao_modelo"));
				pecas.setDadosDiscricaoDePecasMinima(rs.getInt("discricao_minima"));
				pecas.setDadosDiscricaoDePecasMaxima(rs.getInt("discricao_maxima"));
				
				
				
				list.add(pecas);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (list.isEmpty())?null:list;
	}

	public void incluir(DadosDescricaoDePecas pecas) {
		String sql = "insert into discricao(discricao_nome, discricao_modelo, discricao_discricao, discricao_marca, discricao_minima, discricao_maxima)values(?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int erro=0;
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, pecas.getDadosDiscricaoDePecasNome());
			stmt.setString(2, pecas.getDadosDiscricaoDePecasModelo());
			stmt.setString(3, pecas.getDadosDiscricaoDePecasDescricao());
			stmt.setString(4, pecas.getDadosDiscricaoDePecasMarca());
			stmt.setInt(5, pecas.getDadosDiscricaoDePecasMinima());
			stmt.setInt(6, pecas.getDadosDiscricaoDePecasMaxima());
			
						
			stmt.executeUpdate();
					
			
		} catch (SQLException e) {

			e.printStackTrace();
			erro++;
		} finally {
			
			if(erro>=1){
				JOptionPane.showMessageDialog(null,"ERRO - O registro novo não pode ser incluído! o banco não deve esta conectado ou o nome da peça já deve existir");
				
			
			}else JOptionPane.showMessageDialog(null,"O registro foi incluído com sucesso ");
			
			
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt) {
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
	
	
	
	public void createDiscricaoDAO(DadosDescricaoDePecas pecas) {
		// TODO Auto-generated method stub
		
	}

	public void consultar(DadosDescricaoDePecas pecas) {
		String sql ="SELECT discricao_nome, discricao_marca, discricao_modelo, discricao_discricao, discricao_minima, discricao_maxima FROM discricao WHERE discricao_nome = ? ";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, pecas.getDadosDiscricaoDePecasNome());
			
			
								
			rs = stmt.executeQuery();
			while(rs.next()){
						
			pecas.setDadosDiscricaoDePecasNome(rs.getString(1));
			pecas.setDadosDiscricaoDePecasMarca(rs.getString(2));
			pecas.setDadosDiscricaoDePecasModelo(rs.getString(3));
			pecas.setDadosDiscricaoDePecasDescricao(rs.getString(4));
			pecas.setDadosDiscricaoDePecasMinima(rs.getInt(5));
			pecas.setDadosDiscricaoDePecasMaxima(rs.getInt(6));
			}
			
			
		} catch (SQLException e) {
				e.printStackTrace();
			
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}
	
	
	
	
	
	
}
