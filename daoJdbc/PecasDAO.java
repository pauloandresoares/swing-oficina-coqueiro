package daoJdbc;

import java.sql.Connection;
import java.sql.Date;
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


import dto.DadosEstoque;
import dto.DadosPecas;
import Interface.IFPecas;

public class PecasDAO implements IFPecas{

	public void alterar(DadosPecas pecas) {
		
			String sql = "UPDATE pecas SET peca_preco_venda =?, peca_nome=?, peca_modelo=?, peca_discricao=?, peca_cl_fiscal=?, peca_sit_tributario=?, peca_aliq_ipi=?, peca_aliq_icms=?, peca_data_estoque=?, peca_marca=?, peca_local=?, peca_preco_aquisicao=?, peca_porcentagem_icms_compra=?, peca_icms_compra=?, peca_porcentagem_ipi_compra=?, peca_ipi_compra=?, peca_frete_porcentagem_compra=?, peca_frete_compra=?, peca_seguro_porcentagem_compra=?, peca_seguro_compra=?, peca_preco_custo=?, peca_porcentagem_icms_venda=?, peca_icms_venda=?, peca_porcentagem_ipi_venda=?, peca_ipi_venda=?, peca_frete_porcentagem_venda=?, peca_frete_venda=?, peca_seguro_porcentagem_venda=?, peca_seguro_venda=?, peca_estoque=?, quantidade=? WHERE peca_codigo=?";
			Connection con = null; 
			ResultSet rs =null;
			PreparedStatement stmt = null;
			
			
					
			try{
				con = SessaoJdbc.getConnection();
				stmt = con.prepareStatement(sql);
				stmt.setFloat(1, pecas.getPecaPrecoVenda());
				stmt.setString(2, pecas.getPecaNome());
				stmt.setString(3, pecas.getPecaModelo());
				stmt.setString(4, pecas.getPecaDiscricao());
				stmt.setString(5, pecas.getPecaClFiscal());
				stmt.setString(6, pecas.getPecaSitTributario());
				stmt.setString(7, pecas.getPecaAliqIpi());
				stmt.setString(8, pecas.getPecaAliqIcms() );
				stmt.setDate (9,  pecas.getPecaDataEstoque());
				stmt.setString(10, pecas.getPecaMarca());
				stmt.setString(11, pecas.getPecaLocal());
				stmt.setFloat(12, pecas.getPecaPrecoAquisicao());
				stmt.setFloat(13, pecas.getPecaPorcentagemIcmsCompra());
				stmt.setFloat(14, pecas.getPecaIcmsCompra());
				stmt.setFloat(15, pecas.getPecaPorcentagemIpiCompra());
				stmt.setFloat(16, pecas.getPecaIpiCompra());
				stmt.setFloat(17, pecas.getPecaFretePorcentagemCompra());
				stmt.setFloat(18, pecas.getPecaFreteCompra());
				stmt.setFloat(19, pecas.getPecaSeguroPorcentagemCompra());
				stmt.setFloat(20, pecas.getPecaSeguroCompra());
				stmt.setFloat(21, pecas.getPecaPrecoCusto());
				stmt.setFloat(22, pecas.getPecaPorcentagemIcmsVenda());
				stmt.setFloat(23, pecas.getPecaIcmsVenda());
				stmt.setFloat(24, pecas.getPecaPorcentagemIpiVenda());
				stmt.setFloat(25, pecas.getPecaIpiVenda());
				stmt.setFloat(26, pecas.getPecaFretePorcentagemVenda());
				stmt.setFloat(27, pecas.getPecaFreteVenda());
				stmt.setFloat(28, pecas.getPecaSeguroPorcentagemVenda());
				stmt.setFloat(29, pecas.getPecaSeguroVenda());
				stmt.setInt(30, pecas.getPecaEstoque());
				stmt.setInt(31, pecas.getPecaQuantidade());
				stmt.setInt(32, pecas.getPecaCodigo());
				
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

	public void createPecasDAO(DadosPecas pecas) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(DadosPecas pecas) {
		String sql="DELETE FROM pecas where peca_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setInt(1, pecas.getPecaCodigo());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		// TODO Auto-generated method stub
		
		
	}

	public Collection<DadosPecas> findByAll(HashMap<String, String> map) throws SQLException {
		
		String[] campos = {"peca_preco_venda", "peca_nome", "peca_modelo", "peca_discricao", "peca_cl_fiscal", "peca_sit_tributario", "peca_aliq_ipi", "peca_aliq_icms", "peca_data_estoque", "peca_marca", "peca_local", "peca_preco_aquisicao", "peca_porcentagem_icms_compra", "peca_icms_compra", "peca_porcentagem_ipi_compra", "peca_ipi_compra", "peca_frete_porcentagem_compra", "peca_frete_compra", "peca_seguro_porcentagem_compra", "peca_seguro_compra", "peca_preco_custo", "peca_porcentagem_icms_venda", "peca_icms_venda", "peca_porcentagem_ipi_venda", "peca_ipi_venda", "peca_frete_porcentagem_venda", "peca_frete_venda", "peca_seguro_porcentagem_venda", "peca_seguro_venda", "peca_estoque","quantidade"};
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
		String sql = "SELECT * FROM pecas WHERE peca_nome <> ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosPecas> list = new LinkedList<DadosPecas>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo)+"%");
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosPecas pecas = new DadosPecas();
											
				pecas.setPecaPrecoVenda(rs.getFloat("peca_preco_venda"));
				pecas.setPecaNome(rs.getString("peca_nome"));
				pecas.setPecaModelo(rs.getString("peca_modelo"));
				pecas.setPecaDiscricao(rs.getString("peca_discricao"));
				pecas.setPecaClFiscal(rs.getString("peca_cl_fiscal"));
				pecas.setPecaSitTributario(rs.getString("peca_sit_tributario"));
				pecas.setPecaAliqIpi(rs.getString("peca_aliq_ipi"));
				pecas.setPecaAliqIcms(rs.getString("peca_aliq_icms"));
				pecas.setPecaDataEstoque(rs.getDate("peca_data_estoque"));
				pecas.setPecaMarca(rs.getString("peca_marca"));
				pecas.setPecaLocal(rs.getString("peca_local"));
				pecas.setPecaPrecoAquisicao(rs.getFloat("peca_preco_aquisicao"));
				pecas.setPecaPorcentagemIcmsCompra(rs.getFloat("peca_porcentagem_icms_compra"));
				pecas.setPecaIcmsCompra(rs.getFloat("peca_icms_compra"));
				pecas.setPecaPorcentagemIpiCompra(rs.getFloat("peca_porcentagem_ipi_compra"));
				pecas.setPecaIpiCompra(rs.getFloat("peca_ipi_compra"));
				pecas.setPecaFretePorcentagemCompra(rs.getFloat("peca_frete_porcentagem_compra"));
				pecas.setPecaFreteCompra(rs.getFloat("peca_frete_compra"));
				pecas.setPecaSeguroPorcentagemCompra(rs.getFloat( "peca_seguro_porcentagem_compra"));
				pecas.setPecaSeguroCompra(rs.getFloat("peca_seguro_compra"));
				pecas.setPecaPrecoCusto(rs.getFloat("peca_preco_custo"));
				pecas.setPecaPorcentagemIcmsVenda(rs.getFloat("peca_porcentagem_icms_venda"));
				pecas.setPecaIcmsVenda(rs.getFloat("peca_icms_venda"));
				pecas.setPecaPorcentagemIpiVenda(rs.getFloat("peca_porcentagem_ipi_venda"));
				pecas.setPecaIpiVenda(rs.getFloat("peca_ipi_venda"));
				pecas.setPecaFretePorcentagemVenda(rs.getFloat("peca_frete_porcentagem_venda"));
				pecas.setPecaFreteVenda(rs.getFloat("peca_frete_venda"));
				pecas.setPecaSeguroPorcentagemVenda(rs.getFloat("peca_seguro_porcentagem_venda"));
				pecas.setPecaSeguroVenda(rs.getFloat("peca_seguro_venda"));
				pecas.setPecaEstoque(rs.getInt("peca_estoque"));
				pecas.setPecaCodigo(rs.getInt("peca_codigo"));
				pecas.setPecaQuantidade(rs.getInt("Quantidade"));
				
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

	public void incluir(DadosPecas pecas) {
				
		String sql = "insert into pecas(peca_preco_venda, peca_nome, peca_modelo, peca_discricao, peca_cl_fiscal, peca_sit_tributario, peca_aliq_ipi, peca_aliq_icms, peca_data_estoque, peca_marca, peca_local, peca_preco_aquisicao, peca_porcentagem_icms_compra, peca_icms_compra, peca_porcentagem_ipi_compra, peca_ipi_compra, peca_frete_porcentagem_compra, peca_frete_compra, peca_seguro_porcentagem_compra, peca_seguro_compra, peca_preco_custo, peca_porcentagem_icms_venda, peca_icms_venda, peca_porcentagem_ipi_venda, peca_ipi_venda, peca_frete_porcentagem_venda, peca_frete_venda, peca_seguro_porcentagem_venda, peca_seguro_venda, peca_estoque, quantidade)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int erro=0;
		
		try {
			
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setFloat(1, pecas.getPecaPrecoVenda());
			stmt.setString(2, pecas.getPecaNome());
			stmt.setString(3, pecas.getPecaModelo());
			stmt.setString(4, pecas.getPecaDiscricao());
			stmt.setString(5, pecas.getPecaClFiscal());
			stmt.setString(6, pecas.getPecaSitTributario());
			stmt.setString(7, pecas.getPecaAliqIpi());
			stmt.setString(8, pecas.getPecaAliqIcms() );
			stmt.setDate (9,  pecas.getPecaDataEstoque());
			stmt.setString(10, pecas.getPecaMarca());
			stmt.setString(11, pecas.getPecaLocal());
			stmt.setFloat(12, pecas.getPecaPrecoAquisicao());
			stmt.setFloat(13, pecas.getPecaPorcentagemIcmsCompra());
			stmt.setFloat(14, pecas.getPecaIcmsCompra());
			stmt.setFloat(15, pecas.getPecaPorcentagemIpiCompra());
			stmt.setFloat(16, pecas.getPecaIpiCompra());
			stmt.setFloat(17, pecas.getPecaFretePorcentagemCompra());
			stmt.setFloat(18, pecas.getPecaFreteCompra());
			stmt.setFloat(19, pecas.getPecaSeguroPorcentagemCompra());
			stmt.setFloat(20, pecas.getPecaSeguroCompra());
			stmt.setFloat(21, pecas.getPecaPrecoCusto());
			stmt.setFloat(22, pecas.getPecaPorcentagemIcmsVenda());
			stmt.setFloat(23, pecas.getPecaIcmsVenda());
			stmt.setFloat(24, pecas.getPecaPorcentagemIpiVenda());
			stmt.setFloat(25, pecas.getPecaIpiVenda());
			stmt.setFloat(26, pecas.getPecaFretePorcentagemVenda());
			stmt.setFloat(27, pecas.getPecaFreteVenda());
			stmt.setFloat(28, pecas.getPecaSeguroPorcentagemVenda());
			stmt.setFloat(29, pecas.getPecaSeguroVenda());
			stmt.setInt(30, pecas.getPecaEstoque());
			stmt.setInt(31, pecas.getPecaQuantidade());
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

	public void pesquisaRegistro(DadosPecas pecas) {
    
    String sql ="SELECT peca_preco_venda, peca_nome, peca_modelo, peca_discricao, peca_cl_fiscal, peca_sit_tributario, peca_aliq_ipi, peca_aliq_icms, peca_data_estoque, peca_marca, peca_local, peca_preco_aquisicao, peca_porcentagem_icms_compra, peca_icms_compra, peca_porcentagem_ipi_compra, peca_ipi_compra, peca_frete_porcentagem_compra, peca_frete_compra, peca_seguro_porcentagem_compra, peca_seguro_compra, peca_preco_custo, peca_porcentagem_icms_venda, peca_icms_venda, peca_porcentagem_ipi_venda, peca_ipi_venda, peca_frete_porcentagem_venda, peca_frete_venda, peca_seguro_porcentagem_venda, peca_seguro_venda, peca_estoque, peca_codigo FROM pecas WHERE peca_nome = ?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, pecas.getPecaNome());
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				pecas.setPecaPrecoVenda(rs.getFloat(1));
				pecas.setPecaNome(rs.getString(2));
				pecas.setPecaModelo(rs.getString(3));
				pecas.setPecaDiscricao(rs.getString(4));
				pecas.setPecaClFiscal(rs.getString(5));
				pecas.setPecaSitTributario(rs.getString(6));
				pecas.setPecaAliqIpi(rs.getString(7));
				pecas.setPecaAliqIcms(rs.getString(8));
				pecas.setPecaDataEstoque(rs.getDate(9));
				pecas.setPecaMarca(rs.getString(10));
				pecas.setPecaLocal(rs.getString(11));
				pecas.setPecaPrecoAquisicao(rs.getFloat(12));
				pecas.setPecaPorcentagemIcmsCompra(rs.getFloat(13));
				pecas.setPecaIcmsCompra(rs.getFloat(14));
				pecas.setPecaPorcentagemIpiCompra(rs.getFloat(15));
				pecas.setPecaIpiCompra(rs.getFloat(16));
				pecas.setPecaFretePorcentagemCompra(rs.getFloat(17));
				pecas.setPecaFreteCompra(rs.getFloat(18));
				pecas.setPecaSeguroPorcentagemCompra(rs.getFloat(19));
				pecas.setPecaSeguroCompra(rs.getFloat(20));
				pecas.setPecaPrecoCusto(rs.getFloat(21));
				pecas.setPecaPorcentagemIcmsVenda(rs.getFloat(22));
				pecas.setPecaIcmsVenda(rs.getFloat(23));
				pecas.setPecaPorcentagemIpiVenda(rs.getFloat(24));
				pecas.setPecaIpiVenda(rs.getFloat(25));
				pecas.setPecaFretePorcentagemVenda(rs.getFloat(26));
				pecas.setPecaFreteVenda(rs.getFloat(27));
				pecas.setPecaSeguroPorcentagemVenda(rs.getFloat(28));
				pecas.setPecaSeguroVenda(rs.getFloat(29));
				pecas.setPecaEstoque(rs.getInt(30));
				pecas.setPecaCodigo(rs.getInt(31));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void primeiro(DadosPecas pecas) {
		String sql ="SELECT peca_preco_venda, peca_nome, peca_modelo, peca_discricao, peca_cl_fiscal, peca_sit_tributario, peca_aliq_ipi, peca_aliq_icms, peca_data_estoque, peca_marca, peca_local, peca_preco_aquisicao, peca_porcentagem_icms_compra, peca_icms_compra, peca_porcentagem_ipi_compra, peca_ipi_compra, peca_frete_porcentagem_compra, peca_frete_compra, peca_seguro_porcentagem_compra, peca_seguro_compra, peca_preco_custo, peca_porcentagem_icms_venda, peca_icms_venda, peca_porcentagem_ipi_venda, peca_ipi_venda, peca_frete_porcentagem_venda, peca_frete_venda, peca_seguro_porcentagem_venda, peca_seguro_venda, peca_estoque, peca_codigo, Quantidade FROM pecas ORDER BY peca_codigo asc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				pecas.setPecaPrecoVenda(rs.getFloat(1));
				pecas.setPecaNome(rs.getString(2));
				pecas.setPecaModelo(rs.getString(3));
				pecas.setPecaDiscricao(rs.getString(4));
				pecas.setPecaClFiscal(rs.getString(5));
				pecas.setPecaSitTributario(rs.getString(6));
				pecas.setPecaAliqIpi(rs.getString(7));
				pecas.setPecaAliqIcms(rs.getString(8));
				pecas.setPecaDataEstoque(rs.getDate(9));
				pecas.setPecaMarca(rs.getString(10));
				pecas.setPecaLocal(rs.getString(11));
				pecas.setPecaPrecoAquisicao(rs.getFloat(12));
				pecas.setPecaPorcentagemIcmsCompra(rs.getFloat(13));
				pecas.setPecaIcmsCompra(rs.getFloat(14));
				pecas.setPecaPorcentagemIpiCompra(rs.getFloat(15));
				pecas.setPecaIpiCompra(rs.getFloat(16));
				pecas.setPecaFretePorcentagemCompra(rs.getFloat(17));
				pecas.setPecaFreteCompra(rs.getFloat(18));
				pecas.setPecaSeguroPorcentagemCompra(rs.getFloat(19));
				pecas.setPecaSeguroCompra(rs.getFloat(20));
				pecas.setPecaPrecoCusto(rs.getFloat(21));
				pecas.setPecaPorcentagemIcmsVenda(rs.getFloat(22));
				pecas.setPecaIcmsVenda(rs.getFloat(23));
				pecas.setPecaPorcentagemIpiVenda(rs.getFloat(24));
				pecas.setPecaIpiVenda(rs.getFloat(25));
				pecas.setPecaFretePorcentagemVenda(rs.getFloat(26));
				pecas.setPecaFreteVenda(rs.getFloat(27));
				pecas.setPecaSeguroPorcentagemVenda(rs.getFloat(28));
				pecas.setPecaSeguroVenda(rs.getFloat(29));
				pecas.setPecaEstoque(rs.getInt(30));
				pecas.setPecaCodigo(rs.getInt(31));
				pecas.setPecaQuantidade(rs.getInt(32));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void ultimo(DadosPecas pecas) {
		String sql ="SELECT peca_preco_venda, peca_nome, peca_modelo, peca_discricao, peca_cl_fiscal, peca_sit_tributario, peca_aliq_ipi, peca_aliq_icms, peca_data_estoque, peca_marca, peca_local, peca_preco_aquisicao, peca_porcentagem_icms_compra, peca_icms_compra, peca_porcentagem_ipi_compra, peca_ipi_compra, peca_frete_porcentagem_compra, peca_frete_compra, peca_seguro_porcentagem_compra, peca_seguro_compra, peca_preco_custo, peca_porcentagem_icms_venda, peca_icms_venda, peca_porcentagem_ipi_venda, peca_ipi_venda, peca_frete_porcentagem_venda, peca_frete_venda, peca_seguro_porcentagem_venda, peca_seguro_venda, peca_estoque, peca_codigo, Quantidade FROM pecas ORDER BY peca_codigo desc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				pecas.setPecaPrecoVenda(rs.getFloat(1));
				pecas.setPecaNome(rs.getString(2));
				pecas.setPecaModelo(rs.getString(3));
				pecas.setPecaDiscricao(rs.getString(4));
				pecas.setPecaClFiscal(rs.getString(5));
				pecas.setPecaSitTributario(rs.getString(6));
				pecas.setPecaAliqIpi(rs.getString(7));
				pecas.setPecaAliqIcms(rs.getString(8));
				pecas.setPecaDataEstoque(rs.getDate(9));
				pecas.setPecaMarca(rs.getString(10));
				pecas.setPecaLocal(rs.getString(11));
				pecas.setPecaPrecoAquisicao(rs.getFloat(12));
				pecas.setPecaPorcentagemIcmsCompra(rs.getFloat(13));
				pecas.setPecaIcmsCompra(rs.getFloat(14));
				pecas.setPecaPorcentagemIpiCompra(rs.getFloat(15));
				pecas.setPecaIpiCompra(rs.getFloat(16));
				pecas.setPecaFretePorcentagemCompra(rs.getFloat(17));
				pecas.setPecaFreteCompra(rs.getFloat(18));
				pecas.setPecaSeguroPorcentagemCompra(rs.getFloat(19));
				pecas.setPecaSeguroCompra(rs.getFloat(20));
				pecas.setPecaPrecoCusto(rs.getFloat(21));
				pecas.setPecaPorcentagemIcmsVenda(rs.getFloat(22));
				pecas.setPecaIcmsVenda(rs.getFloat(23));
				pecas.setPecaPorcentagemIpiVenda(rs.getFloat(24));
				pecas.setPecaIpiVenda(rs.getFloat(25));
				pecas.setPecaFretePorcentagemVenda(rs.getFloat(26));
				pecas.setPecaFreteVenda(rs.getFloat(27));
				pecas.setPecaSeguroPorcentagemVenda(rs.getFloat(28));
				pecas.setPecaSeguroVenda(rs.getFloat(29));
				pecas.setPecaEstoque(rs.getInt(30));
				pecas.setPecaCodigo(rs.getInt(31));
				pecas.setPecaQuantidade(rs.getInt(32));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}
	
	public void pegarQuantidadeEstoque(DadosPecas pecas) {
		String sql ="select count(estoque_nome_peca) AS total from estoque where estoque_nome_peca = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, pecas.getPecaNome());
											
			rs = stmt.executeQuery();
			while(rs.next()){
				pecas.setPecaTotalEstoque((rs.getInt("total")));
				
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	
	
	
	}
	
	public void pesquisaCodigo(DadosPecas pecas){
		String sql ="SELECT peca_preco_venda, peca_nome, peca_modelo, peca_discricao, peca_cl_fiscal, peca_sit_tributario, peca_aliq_ipi, peca_aliq_icms, peca_data_estoque, peca_marca, peca_local, peca_preco_aquisicao, peca_porcentagem_icms_compra, peca_icms_compra, peca_porcentagem_ipi_compra, peca_ipi_compra, peca_frete_porcentagem_compra, peca_frete_compra, peca_seguro_porcentagem_compra, peca_seguro_compra, peca_preco_custo, peca_porcentagem_icms_venda, peca_icms_venda, peca_porcentagem_ipi_venda, peca_ipi_venda, peca_frete_porcentagem_venda, peca_frete_venda, peca_seguro_porcentagem_venda, peca_seguro_venda, peca_estoque, peca_codigo, Quantidade FROM pecas WHERE peca_codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, pecas.getPecaCodigo());
											
			rs = stmt.executeQuery();
			while(rs.next()){
				pecas.setPecaPrecoVenda(rs.getFloat(1));
				pecas.setPecaNome(rs.getString(2));
				pecas.setPecaModelo(rs.getString(3));
				pecas.setPecaDiscricao(rs.getString(4));
				pecas.setPecaClFiscal(rs.getString(5));
				pecas.setPecaSitTributario(rs.getString(6));
				pecas.setPecaAliqIpi(rs.getString(7));
				pecas.setPecaAliqIcms(rs.getString(8));
				pecas.setPecaDataEstoque(rs.getDate(9));
				pecas.setPecaMarca(rs.getString(10));
				pecas.setPecaLocal(rs.getString(11));
				pecas.setPecaPrecoAquisicao(rs.getFloat(12));
				pecas.setPecaPorcentagemIcmsCompra(rs.getFloat(13));
				pecas.setPecaIcmsCompra(rs.getFloat(14));
				pecas.setPecaPorcentagemIpiCompra(rs.getFloat(15));
				pecas.setPecaIpiCompra(rs.getFloat(16));
				pecas.setPecaFretePorcentagemCompra(rs.getFloat(17));
				pecas.setPecaFreteCompra(rs.getFloat(18));
				pecas.setPecaSeguroPorcentagemCompra(rs.getFloat(19));
				pecas.setPecaSeguroCompra(rs.getFloat(20));
				pecas.setPecaPrecoCusto(rs.getFloat(21));
				pecas.setPecaPorcentagemIcmsVenda(rs.getFloat(22));
				pecas.setPecaIcmsVenda(rs.getFloat(23));
				pecas.setPecaPorcentagemIpiVenda(rs.getFloat(24));
				pecas.setPecaIpiVenda(rs.getFloat(25));
				pecas.setPecaFretePorcentagemVenda(rs.getFloat(26));
				pecas.setPecaFreteVenda(rs.getFloat(27));
				pecas.setPecaSeguroPorcentagemVenda(rs.getFloat(28));
				pecas.setPecaSeguroVenda(rs.getFloat(29));
				pecas.setPecaEstoque(rs.getInt(30));
				pecas.setPecaCodigo(rs.getInt(31));
				pecas.setPecaQuantidade(rs.getInt(32));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}
	
	public void excluirNome(DadosPecas pecas) {
		String sql="DELETE FROM pecas where peca_nome = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setString(1, pecas.getPecaNome());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		// TODO Auto-generated method stub
		
		
	}
	
	public void pesquisaNome(DadosPecas pecas){
		String sql ="SELECT peca_preco_venda, peca_nome, peca_modelo, peca_discricao, peca_cl_fiscal, peca_sit_tributario, peca_aliq_ipi, peca_aliq_icms, peca_data_estoque, peca_marca, peca_local, peca_preco_aquisicao, peca_porcentagem_icms_compra, peca_icms_compra, peca_porcentagem_ipi_compra, peca_ipi_compra, peca_frete_porcentagem_compra, peca_frete_compra, peca_seguro_porcentagem_compra, peca_seguro_compra, peca_preco_custo, peca_porcentagem_icms_venda, peca_icms_venda, peca_porcentagem_ipi_venda, peca_ipi_venda, peca_frete_porcentagem_venda, peca_frete_venda, peca_seguro_porcentagem_venda, peca_seguro_venda, peca_estoque, peca_codigo FROM pecas WHERE peca_nome = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, pecas.getPecaNome());
											
			rs = stmt.executeQuery();
			while(rs.next()){
				pecas.setPecaPrecoVenda(rs.getFloat(1));
				pecas.setPecaNome(rs.getString(2));
				pecas.setPecaModelo(rs.getString(3));
				pecas.setPecaDiscricao(rs.getString(4));
				pecas.setPecaClFiscal(rs.getString(5));
				pecas.setPecaSitTributario(rs.getString(6));
				pecas.setPecaAliqIpi(rs.getString(7));
				pecas.setPecaAliqIcms(rs.getString(8));
				pecas.setPecaDataEstoque(rs.getDate(9));
				pecas.setPecaMarca(rs.getString(10));
				pecas.setPecaLocal(rs.getString(11));
				pecas.setPecaPrecoAquisicao(rs.getFloat(12));
				pecas.setPecaPorcentagemIcmsCompra(rs.getFloat(13));
				pecas.setPecaIcmsCompra(rs.getFloat(14));
				pecas.setPecaPorcentagemIpiCompra(rs.getFloat(15));
				pecas.setPecaIpiCompra(rs.getFloat(16));
				pecas.setPecaFretePorcentagemCompra(rs.getFloat(17));
				pecas.setPecaFreteCompra(rs.getFloat(18));
				pecas.setPecaSeguroPorcentagemCompra(rs.getFloat(19));
				pecas.setPecaSeguroCompra(rs.getFloat(20));
				pecas.setPecaPrecoCusto(rs.getFloat(21));
				pecas.setPecaPorcentagemIcmsVenda(rs.getFloat(22));
				pecas.setPecaIcmsVenda(rs.getFloat(23));
				pecas.setPecaPorcentagemIpiVenda(rs.getFloat(24));
				pecas.setPecaIpiVenda(rs.getFloat(25));
				pecas.setPecaFretePorcentagemVenda(rs.getFloat(26));
				pecas.setPecaFreteVenda(rs.getFloat(27));
				pecas.setPecaSeguroPorcentagemVenda(rs.getFloat(28));
				pecas.setPecaSeguroVenda(rs.getFloat(29));
				pecas.setPecaEstoque(rs.getInt(30));
				pecas.setPecaCodigo(rs.getInt(31));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public Collection<DadosPecas> pegarQuantidade(HashMap<String, String> map) throws SQLException {

		String[] campos = {"peca_preco_venda", "peca_nome", "peca_modelo", "peca_discricao", "peca_cl_fiscal", "peca_sit_tributario", "peca_aliq_ipi", "peca_aliq_icms", "peca_data_estoque", "peca_marca", "peca_local", "peca_preco_aquisicao", "peca_porcentagem_icms_compra", "peca_icms_compra", "peca_porcentagem_ipi_compra", "peca_ipi_compra", "peca_frete_porcentagem_compra", "peca_frete_compra", "peca_seguro_porcentagem_compra", "peca_seguro_compra", "peca_preco_custo", "peca_porcentagem_icms_venda", "peca_icms_venda", "peca_porcentagem_ipi_venda", "peca_ipi_venda", "peca_frete_porcentagem_venda", "peca_frete_venda", "peca_seguro_porcentagem_venda", "peca_seguro_venda", "peca_estoque","quantidade"};
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
		String sql = "SELECT * FROM pecas WHERE peca_nome == ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosPecas> list = new LinkedList<DadosPecas>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo)+"%");
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosPecas pecas = new DadosPecas();
											
				pecas.setPecaPrecoVenda(rs.getFloat("peca_preco_venda"));
				pecas.setPecaNome(rs.getString("peca_nome"));
				pecas.setPecaModelo(rs.getString("peca_modelo"));
				pecas.setPecaDiscricao(rs.getString("peca_discricao"));
				pecas.setPecaClFiscal(rs.getString("peca_cl_fiscal"));
				pecas.setPecaSitTributario(rs.getString("peca_sit_tributario"));
				pecas.setPecaAliqIpi(rs.getString("peca_aliq_ipi"));
				pecas.setPecaAliqIcms(rs.getString("peca_aliq_icms"));
				pecas.setPecaDataEstoque(rs.getDate("peca_data_estoque"));
				pecas.setPecaMarca(rs.getString("peca_marca"));
				pecas.setPecaLocal(rs.getString("peca_local"));
				pecas.setPecaPrecoAquisicao(rs.getFloat("peca_preco_aquisicao"));
				pecas.setPecaPorcentagemIcmsCompra(rs.getFloat("peca_porcentagem_icms_compra"));
				pecas.setPecaIcmsCompra(rs.getFloat("peca_icms_compra"));
				pecas.setPecaPorcentagemIpiCompra(rs.getFloat("peca_porcentagem_ipi_compra"));
				pecas.setPecaIpiCompra(rs.getFloat("peca_ipi_compra"));
				pecas.setPecaFretePorcentagemCompra(rs.getFloat("peca_frete_porcentagem_compra"));
				pecas.setPecaFreteCompra(rs.getFloat("peca_frete_compra"));
				pecas.setPecaSeguroPorcentagemCompra(rs.getFloat( "peca_seguro_porcentagem_compra"));
				pecas.setPecaSeguroCompra(rs.getFloat("peca_seguro_compra"));
				pecas.setPecaPrecoCusto(rs.getFloat("peca_preco_custo"));
				pecas.setPecaPorcentagemIcmsVenda(rs.getFloat("peca_porcentagem_icms_venda"));
				pecas.setPecaIcmsVenda(rs.getFloat("peca_icms_venda"));
				pecas.setPecaPorcentagemIpiVenda(rs.getFloat("peca_porcentagem_ipi_venda"));
				pecas.setPecaIpiVenda(rs.getFloat("peca_ipi_venda"));
				pecas.setPecaFretePorcentagemVenda(rs.getFloat("peca_frete_porcentagem_venda"));
				pecas.setPecaFreteVenda(rs.getFloat("peca_frete_venda"));
				pecas.setPecaSeguroPorcentagemVenda(rs.getFloat("peca_seguro_porcentagem_venda"));
				pecas.setPecaSeguroVenda(rs.getFloat("peca_seguro_venda"));
				pecas.setPecaEstoque(rs.getInt("peca_estoque"));
				pecas.setPecaCodigo(rs.getInt("peca_codigo"));
				pecas.setPecaQuantidade(rs.getInt("Quantidade"));
				
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
}
