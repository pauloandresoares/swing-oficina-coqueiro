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
import dto.DadosFornecedor;
import dto.DadosFuncionarios;
import Interface.IFCliente;

public class ClienteDAO implements IFCliente {

	public void alterar(DadosCliente cliente) {
		String sql = "UPDATE cliente SET cliente_nome = ?, cliente_contato =?,  cliente_cpfcgc =?, cliente_telfax =?, cliente_endereco=?, cliente_bairro=?,  cliente_observacoes=?, cliente_cep=?, cliente_uf=?,  cliente_ie=?, cliente_pessoa=?, cliente_tipo=?, cliente_nasc=?, cliente_cidade=? WHERE cliente_codigo=?";
		Connection con = null; 
		ResultSet rs =null;
		PreparedStatement stmt = null;
		
		
				
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getClienteNome());
			stmt.setString(2, cliente.getClienteContato());
			stmt.setString(3, cliente.getClienteCpfCgc());
			stmt.setString(4, cliente.getClienteTelFax());
			stmt.setString(5, cliente.getClienteEndereco());
			stmt.setString(6, cliente.getClienteBairro());
			stmt.setString(7, cliente.getClienteObservacoes());
			stmt.setString(8, cliente.getClienteCep());
			stmt.setInt(9, cliente.getClienteUf());
			stmt.setString(10, cliente.getClienteIe());
			stmt.setInt(11, cliente.getClientePessoa());
			stmt.setInt(12, cliente.getClienteTipo());
			stmt.setString(13, cliente.getClienteDataDeNascimento());
			stmt.setString(14, cliente.getClienteCidade());
			stmt.setInt(15, cliente.getClienteCodigo());
			
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		
		// TODO Auto-generated method stub

	}

	public void createClienteDAO(DadosCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(DadosCliente cliente) {
		String sql="DELETE FROM cliente where cliente_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setInt(1, cliente.getClienteCodigo());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		// TODO Auto-generated method stub
		
		
	}

	public Collection<DadosCliente> findByAll(HashMap<String, String> map) throws SQLException {
		String[] campos = {"cliente_nome", "cliente_contato",  "cliente_cpfcgc", "cliente_telfax", "cliente_endereco", "cliente_bairro",  "cliente_observacoes", "cliente_cep", "cliente_uf",  "cliente_ie", "cliente_pessoa", "cliente_tipo", "cliente_nasc", "cliente_cidade", "cliente_codigo"};
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
		String sql = "SELECT * FROM cliente WHERE cliente_codigo > ? ORDER BY cliente_nome asc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosCliente> list = new LinkedList<DadosCliente>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo));
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosCliente cliente = new DadosCliente();
				
				cliente.setClienteNome(rs.getString("cliente_nome"));
				cliente.setClienteContato(rs.getString("cliente_contato"));
				cliente.setClienteCpfCgc(rs.getString("cliente_cpfcgc"));
				cliente.setClienteTelFax(rs.getString("cliente_telfax"));
				cliente.setClienteEndereco(rs.getString("cliente_endereco"));
				cliente.setClienteBairro(rs.getString("cliente_bairro"));
				cliente.setClienteObservacoes(rs.getString("cliente_observacoes"));
				cliente.setClienteCep(rs.getString("cliente_cep"));
				cliente.setClienteUf(rs.getInt("cliente_uf"));
				cliente.setClienteIe(rs.getString("cliente_ie"));
				cliente.setClientePessoa(rs.getInt("cliente_pessoa"));
				cliente.setClienteTipo(rs.getInt("cliente_tipo"));
				cliente.setClienteDataDeNascimento(rs.getString( "cliente_nasc"));
				cliente.setClienteCidade(rs.getString("cliente_cidade"));
				cliente.setClienteCodigo(rs.getInt("cliente_codigo"));
				
				
				list.add(cliente);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (list.isEmpty())?null:list;
	}

	public Collection<DadosCliente> findByParam(HashMap<String, String> map) throws SQLException {
		String[] campos = {"cliente_nome", "cliente_contato",  "cliente_cpfcgc", "cliente_telfax", "cliente_endereco", "cliente_bairro",  "cliente_observacoes", "cliente_cep", "cliente_uf",  "cliente_ie", "cliente_pessoa", "cliente_tipo", "cliente_nasc", "cliente_cidade", "cliente_codigo"};
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
		String sql = "SELECT * FROM cliente WHERE " +campo+ " like ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosCliente> list = new LinkedList<DadosCliente>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo)+"%");
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosCliente cliente = new DadosCliente();
				
				cliente.setClienteNome(rs.getString("cliente_nome"));
				cliente.setClienteContato(rs.getString("cliente_contato"));
				cliente.setClienteCpfCgc(rs.getString("cliente_cpfcgc"));
				cliente.setClienteTelFax(rs.getString("cliente_telfax"));
				cliente.setClienteEndereco(rs.getString("cliente_endereco"));
				cliente.setClienteBairro(rs.getString("cliente_bairro"));
				cliente.setClienteObservacoes(rs.getString("cliente_observacoes"));
				cliente.setClienteCep(rs.getString("cliente_cep"));
				cliente.setClienteUf(rs.getInt("cliente_uf"));
				cliente.setClienteIe(rs.getString("cliente_ie"));
				cliente.setClientePessoa(rs.getInt("cliente_pessoa"));
				cliente.setClienteTipo(rs.getInt("cliente_tipo"));
				cliente.setClienteDataDeNascimento(rs.getString( "cliente_nasc"));
				cliente.setClienteCidade(rs.getString("cliente_cidade"));
				cliente.setClienteCodigo(rs.getInt("cliente_codigo"));
				
				
				list.add(cliente);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (list.isEmpty())?null:list;
	}

	public void incluir(DadosCliente cliente) {
		String sql = "insert into cliente(cliente_nome, cliente_contato,  cliente_cpfcgc, cliente_telfax, cliente_endereco, cliente_bairro,  cliente_observacoes, cliente_cep, cliente_uf,  cliente_ie, cliente_pessoa, cliente_tipo, cliente_nasc, cliente_cidade)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int erro=0;
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getClienteNome());
			stmt.setString(2, cliente.getClienteContato());
			stmt.setString(3, cliente.getClienteCpfCgc());
			stmt.setString(4, cliente.getClienteTelFax());
			stmt.setString(5, cliente.getClienteEndereco());
			stmt.setString(6, cliente.getClienteBairro());
			stmt.setString(7, cliente.getClienteObservacoes());
			stmt.setString(8, cliente.getClienteCep());
			stmt.setInt(9, cliente.getClienteUf());
			stmt.setString(10, cliente.getClienteIe());
			stmt.setInt(11, cliente.getClientePessoa());
			stmt.setInt(12, cliente.getClienteTipo());
			stmt.setString(13, cliente.getClienteDataDeNascimento());
			stmt.setString(14, cliente.getClienteCidade());
			
			
			
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

	public void pesquisaClienteCodigo(DadosCliente cliente) {
		String sql ="SELECT cliente_nome FROM cliente WHERE cliente_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, cliente.getClienteCodigo());
			
								
			rs = stmt.executeQuery();
			while(rs.next()){
			cliente.setClienteNome(rs.getString(1));
			}
			
			
		} catch (SQLException e) {
				e.printStackTrace();
			
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void pesquisaClienteJlist(DadosCliente cliente) {
    String sql ="SELECT cliente_nome, cliente_contato,  cliente_cpfcgc, cliente_telfax, cliente_endereco, cliente_bairro,  cliente_observacoes, cliente_cep, cliente_uf,  cliente_ie, cliente_pessoa, cliente_tipo, cliente_nasc, cliente_cidade, cliente_codigo FROM cliente WHERE cliente_nome = ?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,cliente.getClienteNome());
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				
				cliente.setClienteNome(rs.getString(1));
				cliente.setClienteContato(rs.getString(2));
				cliente.setClienteCpfCgc(rs.getString(3));
				cliente.setClienteTelFax(rs.getString(4));
				cliente.setClienteEndereco(rs.getString(5));
				cliente.setClienteBairro(rs.getString(6));
				cliente.setClienteObservacoes(rs.getString(7));
				cliente.setClienteCep(rs.getString(8));
				cliente.setClienteUf(rs.getInt(9));
				cliente.setClienteIe(rs.getString(10));
				cliente.setClientePessoa(rs.getInt(11));
				cliente.setClienteTipo(rs.getInt(12));
				cliente.setClienteDataDeNascimento(rs.getString(13));
				cliente.setClienteCidade(rs.getString(14));
				cliente.setClienteCodigo(rs.getInt(15));
		
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void pesquisaClienteNome(DadosCliente cliente) {
		String sql ="SELECT cliente_nome FROM cliente WHERE cliente_nome like '%?%'";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,cliente.getClienteNome());
			
								
			rs = stmt.executeQuery();
			while(rs.next()){
				cliente.setClienteNome(rs.getString(1));
			}
			
		} catch (SQLException e) {

			
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void pesquisaRegistro(DadosCliente cliente) {
    String sql ="SELECT cliente_nome, cliente_contato,  cliente_cpfcgc, cliente_telfax, cliente_endereco, cliente_bairro,  cliente_observacoes, cliente_cep, cliente_uf,  cliente_ie, cliente_pessoa, cliente_tipo, cliente_nasc, cliente_cidade, cliente_codigo FROM cliente WHERE cliente_codigo = ?";
		
		
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setInt(1,cliente.getClienteCodigo());
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				cliente.setClienteNome(rs.getString(1));
				cliente.setClienteContato(rs.getString(2));
				cliente.setClienteCpfCgc(rs.getString(3));
				cliente.setClienteTelFax(rs.getString(4));
				cliente.setClienteEndereco(rs.getString(5));
				cliente.setClienteBairro(rs.getString(6));
				cliente.setClienteObservacoes(rs.getString(7));
				cliente.setClienteCep(rs.getString(8));
				cliente.setClienteUf(rs.getInt(9));
				cliente.setClienteIe(rs.getString(10));
				cliente.setClientePessoa(rs.getInt(11));
				cliente.setClienteTipo(rs.getInt(12));
				cliente.setClienteDataDeNascimento(rs.getString(13));
				cliente.setClienteCidade(rs.getString(14));
				cliente.setClienteCodigo(rs.getInt(15));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void primeiro(DadosCliente cliente) {
		String sql ="SELECT cliente_nome, cliente_contato, cliente_cpfcgc, cliente_telfax, cliente_endereco, cliente_bairro,  cliente_observacoes, cliente_cep, cliente_uf,  cliente_ie, cliente_pessoa, cliente_tipo, cliente_nasc, cliente_cidade, cliente_codigo FROM cliente ORDER BY cliente_codigo asc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				cliente.setClienteNome(rs.getString(1));
				cliente.setClienteContato(rs.getString(2));
				cliente.setClienteCpfCgc(rs.getString(3));
				cliente.setClienteTelFax(rs.getString(4));
				cliente.setClienteEndereco(rs.getString(5));
				cliente.setClienteBairro(rs.getString(6));
				cliente.setClienteObservacoes(rs.getString(7));
				cliente.setClienteCep(rs.getString(8));
				cliente.setClienteUf(rs.getInt(9));
				cliente.setClienteIe(rs.getString(10));
				cliente.setClientePessoa(rs.getInt(11));
				cliente.setClienteTipo(rs.getInt(12));
				cliente.setClienteDataDeNascimento(rs.getString(13));
				cliente.setClienteCidade(rs.getString(14));
				cliente.setClienteCodigo(rs.getInt(15));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}
	

	public void ultimo(DadosCliente cliente) {
		String sql ="SELECT cliente_nome, cliente_contato,  cliente_cpfcgc, cliente_telfax, cliente_endereco, cliente_bairro,  cliente_observacoes, cliente_cep, cliente_uf,  cliente_ie, cliente_pessoa, cliente_tipo, cliente_nasc, cliente_cidade, cliente_codigo FROM cliente ORDER BY cliente_codigo desc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				cliente.setClienteNome(rs.getString(1));
				cliente.setClienteContato(rs.getString(2));
				cliente.setClienteCpfCgc(rs.getString(3));
				cliente.setClienteTelFax(rs.getString(4));
				cliente.setClienteEndereco(rs.getString(5));
				cliente.setClienteBairro(rs.getString(6));
				cliente.setClienteObservacoes(rs.getString(7));
				cliente.setClienteCep(rs.getString(8));
				cliente.setClienteUf(rs.getInt(9));
				cliente.setClienteIe(rs.getString(10));
				cliente.setClientePessoa(rs.getInt(11));
				cliente.setClienteTipo(rs.getInt(12));
				cliente.setClienteDataDeNascimento(rs.getString(13));
				cliente.setClienteCidade(rs.getString(14));
				cliente.setClienteCodigo(rs.getInt(15));
	
			}
			
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

}
