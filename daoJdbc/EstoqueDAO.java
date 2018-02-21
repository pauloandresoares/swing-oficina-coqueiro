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

import dto.DadosCliente;
import dto.DadosEstoque;

import util.SessaoJdbc;

import Interface.IFEstoque;

public class EstoqueDAO implements IFEstoque{

	public void alterar(DadosEstoque estoque) {
				
		String sql = "UPDATE estoque SET estoque_data_estoque=?, estoque_preco_venda=?, estoque_nome_peca=?, estoque_marca=?, estoque_modelo=?, quantidade=? WHERE estoque_codigo=?";
		Connection con = null; 
		ResultSet rs =null;
		PreparedStatement stmt = null;
		
		
				
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setDate(1, estoque.getEstoqueDataEntrada());
			stmt.setFloat(2, estoque.getEstoquePreco());
			stmt.setString(3, estoque.getEstoquePeca());
			stmt.setString(4, estoque.getEstoqueMarca());
			stmt.setString(5, estoque.getEstoqueModelo());
			stmt.setInt(6, estoque.getEstoqueCodigoDaAquisicao());
			stmt.setInt(7, estoque.getEstoqueQuantidade());
			
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		
		// TODO Auto-generated method stub

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

	public void createEstoqueDAO(DadosEstoque estoque) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(DadosEstoque estoque) {
		String sql="DELETE FROM estoque where estoque_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setInt(1, estoque.getEstoqueCodigoDaAquisicao());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		// TODO Auto-generated method stub
	}

	public void incluir(DadosEstoque estoque) {
		String sql = "insert into estoque(estoque_data_estoque, estoque_preco_venda, estoque_nome_peca, estoque_marca, estoque_modelo, estoque_codigo, quantidade)values(?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		
		ResultSet rs = null;
		
		try {
			
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setDate(1, estoque.getEstoqueDataEntrada());
			stmt.setFloat(2, estoque.getEstoquePreco());
			stmt.setString(3, estoque.getEstoquePeca());
			stmt.setString(4, estoque.getEstoqueMarca());
			stmt.setString(5, estoque.getEstoqueModelo());
			stmt.setInt(6, estoque.getEstoqueCodigoDaAquisicao());
			stmt.setInt(7, estoque.getEstoqueQuantidade());
			
			
			stmt.executeUpdate();
			
						
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			
			closeObjectDAO(con, rs, stmt);
		}
	}

	public Collection<DadosEstoque> findByAll(HashMap<String, String> map) throws SQLException {
		String[] campos = {"estoque_data_estoque", "estoque_preco_venda", "estoque_nome_peca", "estoque_marca", "estoque_modelo", "estoque_codigo"};
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
		String sql = "SELECT distinct(estoque_nome_peca) FROM estoque WHERE estoque_codigo > ? ORDER BY estoque_nome_peca asc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosEstoque> list = new LinkedList<DadosEstoque>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo));
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosEstoque estoque= new DadosEstoque();
				
				estoque.setEstoquePeca(rs.getString("estoque_nome_peca"));
				
				
				
				list.add(estoque);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (list.isEmpty())?null:list;
	}
	
	public void pesquisarNome(DadosEstoque estoque){
		 String sql ="SELECT estoque_codigo, estoque_data_estoque, estoque_marca, estoque_modelo, estoque_preco_venda, estoque_minima, estoque_maxima FROM estoque WHERE estoque_nome_peca = ? ORDER BY estoque_codigo asc LIMIT 1";
						
			
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				con = SessaoJdbc.getConnection();
				stmt = con.prepareStatement(sql);
				stmt.setString(1, estoque.getEstoquePeca());
				
												
				rs = stmt.executeQuery();
				while(rs.next()){
					estoque.setEstoqueCodigoDaAquisicao(rs.getInt("estoque_codigo"));
					estoque.setEstoqueDataEntrada(rs.getDate("estoque_data_estoque"));
					estoque.setEstoqueMarca(rs.getString("estoque_marca"));
					estoque.setEstoqueModelo(rs.getString("estoque_modelo"));
					estoque.setEstoquePreco(rs.getFloat("estoque_preco_venda"));
					estoque.setEstoqueMinima(rs.getInt("estoque_minima"));
					estoque.setEstoqueMaxima(rs.getInt("estoque_maxima"));
							
				}
				
			} catch (SQLException e) {

				e.printStackTrace();
			} finally {
				closeObjectDAO(con, rs, stmt);
			}
		}

	public Collection<DadosEstoque> pegarQuantidade(HashMap<String, String> map) throws SQLException {
		String[] campos = {"estoque_data_estoque", "estoque_preco_venda", "estoque_nome_peca", "estoque_marca", "estoque_modelo", "estoque_codigo","Quantidade"};
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
		String sql = "SELECT quantidade FROM estoque WHERE estoque_nome_peca == ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosEstoque> lista = new LinkedList<DadosEstoque>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo));
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosEstoque estoque= new DadosEstoque();
								
				estoque.setEstoqueQuantidade(rs.getInt(1));
				
				
				lista.add(estoque);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (lista.isEmpty())?null:lista;
	}
	

	
	

}
