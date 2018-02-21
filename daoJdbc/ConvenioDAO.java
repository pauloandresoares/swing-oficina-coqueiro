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
import dto.DadosConvenio;
import Interface.IFConvenio;

public class ConvenioDAO implements IFConvenio{

	public void alterar(DadosConvenio convenio) {
		
		
		String sql = "UPDATE convenio SET convenio_nome=?, convenio_contatos=?, convenio_fone=?, convenio_endereco=?, convenio_cidade=? , convenio_cep=?, convenio_uf =?, convenio_email=? ,convenio_produtos =?, convenio_normas_aceitacao=? ,	convenio_termos_garantia=?  WHERE convenio_codigo=?";
		Connection con = null; 
		ResultSet rs =null;
		PreparedStatement stmt = null;
		
		
				
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, convenio.getConvenioNome());
			stmt.setString(2, convenio.getConvenioContatos());
			stmt.setString(3, convenio.getConvenioFone());
			stmt.setString(4, convenio.getConvenioEndereco());
			stmt.setString(5, convenio.getConvenioCidade());
			stmt.setString(6, convenio.getConvenioCep());
			stmt.setInt(7, convenio.getConvenioUF());
			stmt.setString(8, convenio.getConvenioEmail());
			stmt.setString(9, convenio.getConvenioProdutos());
			stmt.setString(10, convenio.getConvenioNormasaceitacao());
			stmt.setString(11, convenio.getConveniotermosGarantia());
			stmt.setInt(12, convenio.getConvenioCodigo());
			
			
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

	public void excluir(DadosConvenio convenio) {
		String sql="DELETE FROM convenio where convenio_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setInt(1, convenio.getConvenioCodigo());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		// TODO Auto-generated method stub
		
		
	}

	public Collection<DadosConvenio> findByAll(HashMap<String, String> map) throws SQLException {
		String[] campos = {"convenio_codigo","convenio_nome" ,"convenio_contatos" ,"convenio_fone" ,"convenio_endereco" ,"convenio_cidade" , "convenio_cep",	"convenio_uf" ,	"convenio_email" ,"convenio_produtos" ,"convenio_normas_aceitacao" , "convenio_termos_garantia" };
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
		String sql = "SELECT * FROM convenio WHERE convenio_codigo > ? ORDER BY convenio_nome asc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosConvenio> list = new LinkedList<DadosConvenio>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo));
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosConvenio convenio = new DadosConvenio();
								
				convenio.setConvenioCodigo(rs.getInt("convenio_codigo"));
				convenio.setConvenioNome(rs.getString("convenio_nome"));
				convenio.setConvenioContatos(rs.getString("convenio_contatos"));
				convenio.setConvenioFone(rs.getString("convenio_fone"));
				convenio.setConvenioEndereco(rs.getString("convenio_endereco"));
				convenio.setConvenioCidade(rs.getString("convenio_cidade"));
				convenio.setConvenioCep(rs.getString("convenio_cep"));
				convenio.setConvenioUF(rs.getInt("convenio_uf"));
				convenio.setConvenioEmail(rs.getString("convenio_email"));
				convenio.setConvenioProdutos(rs.getString("convenio_produtos"));
				convenio.setConvenioNormasaceitacao(rs.getString("convenio_normas_aceitacao"));
				convenio.setConveniotermosGarantia(rs.getString("convenio_termos_garantia"));
							
				list.add(convenio);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (list.isEmpty())?null:list;
	}

	public void incluir(DadosConvenio convenio) {
		String sql = "insert into convenio(convenio_nome, convenio_contatos, convenio_fone, convenio_endereco, convenio_cidade, convenio_cep, convenio_uf , convenio_email,convenio_produtos, convenio_normas_aceitacao, convenio_termos_garantia )values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int erro=0;
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, convenio.getConvenioNome());
			stmt.setString(2, convenio.getConvenioContatos());
			stmt.setString(3, convenio.getConvenioFone());
			stmt.setString(4, convenio.getConvenioEndereco());
			stmt.setString(5, convenio.getConvenioCidade());
			stmt.setString(6, convenio.getConvenioCep());
			stmt.setInt(7, convenio.getConvenioUF());
			stmt.setString(8, convenio.getConvenioEmail());
			stmt.setString(9, convenio.getConvenioProdutos());
			stmt.setString(10, convenio.getConvenioNormasaceitacao());
			stmt.setString(11, convenio.getConveniotermosGarantia());
			
			
			
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

	public void pesquisaCodigo(DadosConvenio convenio) {
    String sql ="SELECT convenio_codigo, convenio_nome, convenio_contatos, convenio_fone, convenio_endereco, convenio_cidade, convenio_cep, convenio_uf , convenio_email,convenio_produtos, convenio_normas_aceitacao, convenio_termos_garantia FROM convenio WHERE convenio_codigo = ?";
		
		
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, convenio.getConvenioCodigo());
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				
				convenio.setConvenioCodigo(rs.getInt(1));
				convenio.setConvenioNome(rs.getString(2));
				convenio.setConvenioContatos(rs.getString(3));
				convenio.setConvenioFone(rs.getString(4));
				convenio.setConvenioEndereco(rs.getString(5));
				convenio.setConvenioCidade(rs.getString(6));
				convenio.setConvenioCep(rs.getString(7));
				convenio.setConvenioUF(rs.getInt(8));
				convenio.setConvenioEmail(rs.getString(9));
				convenio.setConvenioProdutos(rs.getString(10));
				convenio.setConvenioNormasaceitacao(rs.getString(11));
				convenio.setConveniotermosGarantia(rs.getString(12));
		
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void primeiro(DadosConvenio convenio) {
		String sql ="SELECT convenio_codigo, convenio_nome, convenio_contatos, convenio_fone, convenio_endereco, convenio_cidade, convenio_cep, convenio_uf , convenio_email,convenio_produtos, convenio_normas_aceitacao, convenio_termos_garantia FROM convenio ORDER BY convenio_codigo asc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
										
			rs = stmt.executeQuery();
			while(rs.next()){
				convenio.setConvenioCodigo(rs.getInt(1));
				convenio.setConvenioNome(rs.getString(2));
				convenio.setConvenioContatos(rs.getString(3));
				convenio.setConvenioFone(rs.getString(4));
				convenio.setConvenioEndereco(rs.getString(5));
				convenio.setConvenioCidade(rs.getString(6));
				convenio.setConvenioCep(rs.getString(7));
				convenio.setConvenioUF(rs.getInt(8));
				convenio.setConvenioEmail(rs.getString(9));
				convenio.setConvenioProdutos(rs.getString(10));
				convenio.setConvenioNormasaceitacao(rs.getString(11));
				convenio.setConveniotermosGarantia(rs.getString(12));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void ultimo(DadosConvenio convenio) {
		String sql ="SELECT convenio_codigo, convenio_nome, convenio_contatos, convenio_fone, convenio_endereco, convenio_cidade, convenio_cep, convenio_uf , convenio_email,convenio_produtos, convenio_normas_aceitacao, convenio_termos_garantia FROM convenio ORDER BY convenio_codigo desc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
										
			rs = stmt.executeQuery();
			while(rs.next()){
				convenio.setConvenioCodigo(rs.getInt(1));
				convenio.setConvenioNome(rs.getString(2));
				convenio.setConvenioContatos(rs.getString(3));
				convenio.setConvenioFone(rs.getString(4));
				convenio.setConvenioEndereco(rs.getString(5));
				convenio.setConvenioCidade(rs.getString(6));
				convenio.setConvenioCep(rs.getString(7));
				convenio.setConvenioUF(rs.getInt(8));
				convenio.setConvenioEmail(rs.getString(9));
				convenio.setConvenioProdutos(rs.getString(10));
				convenio.setConvenioNormasaceitacao(rs.getString(11));
				convenio.setConveniotermosGarantia(rs.getString(12));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void createConvenioDAO(DadosConvenio convenio) {
		// TODO Auto-generated method stub
		
	}

	public void pesquisaNome(DadosConvenio convenio) {
		 String sql ="SELECT convenio_codigo, convenio_nome, convenio_contatos, convenio_fone, convenio_endereco, convenio_cidade, convenio_cep, convenio_uf , convenio_email,convenio_produtos, convenio_normas_aceitacao, convenio_termos_garantia FROM convenio WHERE convenio_nome = ?";
			
			
			
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				con = SessaoJdbc.getConnection();
				stmt = con.prepareStatement(sql);
				stmt.setString(1, convenio.getConvenioNome());
				
												
				rs = stmt.executeQuery();
				while(rs.next()){
					
					convenio.setConvenioCodigo(rs.getInt(1));
					convenio.setConvenioNome(rs.getString(2));
					convenio.setConvenioContatos(rs.getString(3));
					convenio.setConvenioFone(rs.getString(4));
					convenio.setConvenioEndereco(rs.getString(5));
					convenio.setConvenioCidade(rs.getString(6));
					convenio.setConvenioCep(rs.getString(7));
					convenio.setConvenioUF(rs.getInt(8));
					convenio.setConvenioEmail(rs.getString(9));
					convenio.setConvenioProdutos(rs.getString(10));
					convenio.setConvenioNormasaceitacao(rs.getString(11));
					convenio.setConveniotermosGarantia(rs.getString(12));
			
		
				}
				
			} catch (SQLException e) {

				e.printStackTrace();
			} finally {
				closeObjectDAO(con, rs, stmt);
			}
		}

}
