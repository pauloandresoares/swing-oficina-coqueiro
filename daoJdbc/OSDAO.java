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
import dto.DadosOrdemDeServico;
import Interface.IFOS;

public class OSDAO implements IFOS {

	public void alterar(DadosOrdemDeServico os) {
		String sql = "UPDATE os SET orcamento=?, cotacao=?, tipoDeOS=?, prisma=?, numero_de_serie=?, placa=?, chassis=?, convenio=?, cliente=?, Veiculo=?, km=?, tecnico=?, queixas=?, abertura=?, fechamento=?, iss=?, icms=?, ipi=?, custo_mao_de_obra=?, custo_pecas=?, horas=?, custo_total=?, valor_mao_de_obra=?, valor_pecas=?, material_de_consulmo=?, desconto=?, valor_total=?, numero_de_parcelas=?, primeira=?, valor_das_parcelas=?, forma_de_pagamento=?, ressalvas=? WHERE codigo=?";
		Connection con = null; 
		ResultSet rs =null;
		PreparedStatement stmt = null;
		int erro=0;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, os.getOrcamento());
			stmt.setString(2, os.getCotacao());
			stmt.setString(3, os.getTipoDeOS());
			stmt.setString(4, os.getPrisma());
			stmt.setString(5, os.getNumeroDeSerie());
			stmt.setString(6, os.getPlaca());
			stmt.setString(7, os.getChassis());
			stmt.setString(8, os.getConvenio());
			stmt.setString(9, os.getCliente());
			stmt.setString(10, os.getVeiculo());
			stmt.setString(11, os.getKm());
			stmt.setString(12, os.getTecnico());
			stmt.setString(13, os.getQueixas());
			stmt.setDate(14, os.getAbertura());
			stmt.setDate(15, os.getFechamento());
			stmt.setString(16, os.getIss());
			stmt.setString(17, os.getIcms());
			stmt.setString(18, os.getIpi());
			stmt.setString(19, os.getCustoMaoDeObra());
			stmt.setString(20, os.getCustoPecas());
			stmt.setString(21, os.getHoras());
			stmt.setFloat(22, os.getCustoTotal());
			stmt.setString(23, os.getValorMaoDeObra());
			stmt.setString(24, os.getValorPecas());
			stmt.setString(25, os.getMaterialDeConsulmo());
			stmt.setString(26, os.getDesconto());
			stmt.setFloat(27, os.getValorTotal());
			stmt.setString(28, os.getNumeroDeParcelas());
			stmt.setString(29, os.getPrimeira());
			stmt.setString(30, os.getValorDasParcelas());
			stmt.setString(31, os.getFormaDePagamento());
			stmt.setString(32, os.getRessalvas());
			stmt.setInt(33, os.getCodigo());
			
			
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			erro++;
		}finally{
			closeObjectDAO(con, rs, stmt);
			if(erro>=1){
				JOptionPane.showMessageDialog(null,"ERRO - O registro novo não pode ser alterado! o banco não deve esta conectado ");
							
			}else JOptionPane.showMessageDialog(null,"O registro foi alterado com sucesso ");
						
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

	public void createOSDAO(DadosOrdemDeServico os) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(DadosOrdemDeServico os) {
		String sql="DELETE FROM os where codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int erro=0;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setInt(1, os.getCodigo());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			erro++;
		}finally{
			closeObjectDAO(con, rs, stmt);
			if(erro>=1){
				JOptionPane.showMessageDialog(null,"ERRO - O registro novo não pode ser excluido! o banco não deve esta conectado ");
							
			}else JOptionPane.showMessageDialog(null,"O registro foi excluido com sucesso ");
						
			closeObjectDAO(con, rs, stmt);
		}
		// TODO Auto-generated method stub
		
		
	}

	public Collection<DadosOrdemDeServico> findByParam(HashMap<String, String> map) throws SQLException {
		String[] campos = {"codigo", "orcamento", "cotacao", "tipoDeOS", "prisma", "numero_de_serie", "placa", "chassis","convenio", "cliente", "Veiculo", "km", "tecnico", "queixas", "abertura", "fechamento", "iss", "icms", "ipi", "custo_mao_de_obra", "custo_pecas", "horas", "custo_total", "valor_mao_de_obra","valor_pecas", "material_de_consulmo", "desconto", "valor_total","numero_de_parcelas", "primeira", "valor_das_parcelas","forma_de_pagamento", "ressalvas"};
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
		String sql = "SELECT orcamento, cotacao, tipoDeOS, prisma, numero_de_serie, placa, chassis, convenio, cliente, Veiculo, km, tecnico, queixas, abertura, fechamento, iss, icms, ipi, custo_mao_de_obra, custo_pecas, horas, custo_total, valor_mao_de_obra, valor_pecas, material_de_consulmo, desconto, valor_total, numero_de_parcelas, primeira, valor_das_parcelas, forma_de_pagamento, ressalvas, codigo FROM os WHERE codigo > ? ORDER BY codigo asc";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosOrdemDeServico> list = new LinkedList<DadosOrdemDeServico>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo));
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosOrdemDeServico os = new DadosOrdemDeServico();
				
				os.setOrcamento(rs.getInt(1));
				os.setCotacao(rs.getString(2));
				os.setTipoDeOS(rs.getString(3));
				os.setPrisma(rs.getString(4));
				os.setNumeroDeSerie(rs.getString(5));
				os.setPlaca(rs.getString(6));
				os.setChassis(rs.getString(7));
				os.setConvenio(rs.getString(8));
				os.setCliente(rs.getString(9));
				os.setVeiculo(rs.getString(10));
				os.setKm(rs.getString(11));
				os.setTecnico(rs.getString(12));
				os.setQueixas(rs.getString(13));
				os.setAbertura(rs.getDate(14));
				os.setFechamento(rs.getDate(15));
				os.setIss(rs.getString(16));
				os.setIcms(rs.getString(17));
				os.setIpi(rs.getString(18));
				os.setCustoMaoDeObra(rs.getString(19));
				os.setCustoPecas(rs.getString(20));
			    os.setHoras(rs.getString(21));
				os.setCustoTotal(rs.getFloat(22));
				os.setValorMaoDeObra(rs.getString(23));
				os.setValorPecas(rs.getString(24));
				os.setMaterialDeConsulmo(rs.getString(25));
				os.setDesconto(rs.getString(26));
				os.setValorTotal(rs.getFloat(27));
				os.setNumeroDeParcelas(rs.getString(28));
				os.setPrimeira(rs.getString(29));
			    os.setValorDasParcelas(rs.getString(30));
				os.setFormaDePagamento(rs.getString(31));
				os.setRessalvas(rs.getString(32));
				os.setCodigo(rs.getInt(33));
				
				
				list.add(os);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (list.isEmpty())?null:list;
	}

	public void incluir(DadosOrdemDeServico os) {
		String sql = "insert into os(orcamento, cotacao, tipoDeOS, prisma, numero_de_serie, placa, chassis, convenio, cliente, Veiculo, km, tecnico, queixas, abertura, fechamento, iss, icms, ipi, custo_mao_de_obra, custo_pecas, horas, custo_total, valor_mao_de_obra, valor_pecas, material_de_consulmo, desconto, valor_total, numero_de_parcelas, primeira, valor_das_parcelas, forma_de_pagamento, ressalvas)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int erro=0;
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, os.getOrcamento());
			stmt.setString(2, os.getCotacao());
			stmt.setString(3, os.getTipoDeOS());
			stmt.setString(4, os.getPrisma());
			stmt.setString(5, os.getNumeroDeSerie());
			stmt.setString(6, os.getPlaca());
			stmt.setString(7, os.getChassis());
			stmt.setString(8, os.getConvenio());
			stmt.setString(9, os.getCliente());
			stmt.setString(10, os.getVeiculo());
			stmt.setString(11, os.getKm());
			stmt.setString(12, os.getTecnico());
			stmt.setString(13, os.getQueixas());
			stmt.setDate(14, os.getAbertura());
			stmt.setDate(15, os.getFechamento());
			stmt.setString(16, os.getIss());
			stmt.setString(17, os.getIcms());
			stmt.setString(18, os.getIpi());
			stmt.setString(19, os.getCustoMaoDeObra());
			stmt.setString(20, os.getCustoPecas());
			stmt.setString(21, os.getHoras());
			stmt.setFloat(22, os.getCustoTotal());
			stmt.setString(23, os.getValorMaoDeObra());
			stmt.setString(24, os.getValorPecas());
			stmt.setString(25, os.getMaterialDeConsulmo());
			stmt.setString(26, os.getDesconto());
			stmt.setFloat(27, os.getValorTotal());
			stmt.setString(28, os.getNumeroDeParcelas());
			stmt.setString(29, os.getPrimeira());
			stmt.setString(30, os.getValorDasParcelas());
			stmt.setString(31, os.getFormaDePagamento());
			stmt.setString(32, os.getRessalvas());
								
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

	public void pesquisaCodigo(DadosOrdemDeServico os) {
		String sql ="SELECT orcamento, cotacao, tipoDeOS, prisma, numero_de_serie, placa, chassis, convenio, cliente, Veiculo, km, tecnico, queixas, abertura, fechamento, iss, icms, ipi, custo_mao_de_obra, custo_pecas, horas, custo_total, valor_mao_de_obra, valor_pecas, material_de_consulmo, desconto, valor_total, numero_de_parcelas, primeira, valor_das_parcelas, forma_de_pagamento, ressalvas, codigo FROM os WHERE codigo = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int erro=0;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,os.getCodigo());
			
			rs = stmt.executeQuery();
			while(rs.next()){
				os.setOrcamento(rs.getInt(1));
				os.setCotacao(rs.getString(2));
				os.setTipoDeOS(rs.getString(3));
				os.setPrisma(rs.getString(4));
				os.setNumeroDeSerie(rs.getString(5));
				os.setPlaca(rs.getString(6));
				os.setChassis(rs.getString(7));
				os.setConvenio(rs.getString(8));
				os.setCliente(rs.getString(9));
				os.setVeiculo(rs.getString(10));
				os.setKm(rs.getString(11));
				os.setTecnico(rs.getString(12));
				os.setQueixas(rs.getString(13));
				os.setAbertura(rs.getDate(14));
				os.setFechamento(rs.getDate(15));
				os.setIss(rs.getString(16));
				os.setIcms(rs.getString(17));
				os.setIpi(rs.getString(18));
				os.setCustoMaoDeObra(rs.getString(19));
				os.setCustoPecas(rs.getString(20));
			    os.setHoras(rs.getString(21));
				os.setCustoTotal(rs.getFloat(22));
				os.setValorMaoDeObra(rs.getString(23));
				os.setValorPecas(rs.getString(24));
				os.setMaterialDeConsulmo(rs.getString(25));
				os.setDesconto(rs.getString(26));
				os.setValorTotal(rs.getFloat(27));
				os.setNumeroDeParcelas(rs.getString(28));
				os.setPrimeira(rs.getString(29));
			    os.setValorDasParcelas(rs.getString(30));
				os.setFormaDePagamento(rs.getString(31));
				os.setRessalvas(rs.getString(32));
				os.setCodigo(rs.getInt(33));
			}
			
			
		} catch (SQLException e) {
				e.printStackTrace();
			
		} finally {
			closeObjectDAO(con, rs, stmt);
			
		}
	}

	public void primeiro(DadosOrdemDeServico os) {
		String sql ="SELECT orcamento, cotacao, tipoDeOS, prisma, numero_de_serie, placa, chassis, convenio, cliente, Veiculo, km, tecnico, queixas, abertura, fechamento, iss, icms, ipi, custo_mao_de_obra, custo_pecas, horas, custo_total, valor_mao_de_obra, valor_pecas, material_de_consulmo, desconto, valor_total, numero_de_parcelas, primeira, valor_das_parcelas, forma_de_pagamento, ressalvas, codigo FROM os ORDER BY codigo asc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,os.getCodigo());
			
			rs = stmt.executeQuery();
			while(rs.next()){
				os.setOrcamento(rs.getInt(1));
				os.setCotacao(rs.getString(2));
				os.setTipoDeOS(rs.getString(3));
				os.setPrisma(rs.getString(4));
				os.setNumeroDeSerie(rs.getString(5));
				os.setPlaca(rs.getString(6));
				os.setChassis(rs.getString(7));
				os.setConvenio(rs.getString(8));
				os.setCliente(rs.getString(9));
				os.setVeiculo(rs.getString(10));
				os.setKm(rs.getString(11));
				os.setTecnico(rs.getString(12));
				os.setQueixas(rs.getString(13));
				os.setAbertura(rs.getDate(14));
				os.setFechamento(rs.getDate(15));
				os.setIss(rs.getString(16));
				os.setIcms(rs.getString(17));
				os.setIpi(rs.getString(18));
				os.setCustoMaoDeObra(rs.getString(19));
				os.setCustoPecas(rs.getString(20));
			    os.setHoras(rs.getString(21));
				os.setCustoTotal(rs.getFloat(22));
				os.setValorMaoDeObra(rs.getString(23));
				os.setValorPecas(rs.getString(24));
				os.setMaterialDeConsulmo(rs.getString(25));
				os.setDesconto(rs.getString(26));
				os.setValorTotal(rs.getFloat(27));
				os.setNumeroDeParcelas(rs.getString(28));
				os.setPrimeira(rs.getString(29));
			    os.setValorDasParcelas(rs.getString(30));
				os.setFormaDePagamento(rs.getString(31));
				os.setRessalvas(rs.getString(32));
				os.setCodigo(rs.getInt(33));
			}
			
			
		} catch (SQLException e) {
				e.printStackTrace();
			
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void ultimo(DadosOrdemDeServico os) {
		String sql ="SELECT orcamento, cotacao, tipoDeOS, prisma, numero_de_serie, placa, chassis, convenio, cliente, Veiculo, km, tecnico, queixas, abertura, fechamento, iss, icms, ipi, custo_mao_de_obra, custo_pecas, horas, custo_total, valor_mao_de_obra, valor_pecas, material_de_consulmo, desconto, valor_total, numero_de_parcelas, primeira, valor_das_parcelas, forma_de_pagamento, ressalvas, codigo FROM os ORDER BY codigo desc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
			
			rs = stmt.executeQuery();
			while(rs.next()){
				os.setOrcamento(rs.getInt(1));
				os.setCotacao(rs.getString(2));
				os.setTipoDeOS(rs.getString(3));
				os.setPrisma(rs.getString(4));
				os.setNumeroDeSerie(rs.getString(5));
				os.setPlaca(rs.getString(6));
				os.setChassis(rs.getString(7));
				os.setConvenio(rs.getString(8));
				os.setCliente(rs.getString(9));
				os.setVeiculo(rs.getString(10));
				os.setKm(rs.getString(11));
				os.setTecnico(rs.getString(12));
				os.setQueixas(rs.getString(13));
				os.setAbertura(rs.getDate(14));
				os.setFechamento(rs.getDate(15));
				os.setIss(rs.getString(16));
				os.setIcms(rs.getString(17));
				os.setIpi(rs.getString(18));
				os.setCustoMaoDeObra(rs.getString(19));
				os.setCustoPecas(rs.getString(20));
			    os.setHoras(rs.getString(21));
				os.setCustoTotal(rs.getFloat(22));
				os.setValorMaoDeObra(rs.getString(23));
				os.setValorPecas(rs.getString(24));
				os.setMaterialDeConsulmo(rs.getString(25));
				os.setDesconto(rs.getString(26));
				os.setValorTotal(rs.getFloat(27));
				os.setNumeroDeParcelas(rs.getString(28));
				os.setPrimeira(rs.getString(29));
			    os.setValorDasParcelas(rs.getString(30));
				os.setFormaDePagamento(rs.getString(31));
				os.setRessalvas(rs.getString(32));
				os.setCodigo(rs.getInt(33));
			}
			
			
		} catch (SQLException e) {
				e.printStackTrace();
			
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public Collection<DadosOrdemDeServico> findByData(HashMap<String, String> map) throws SQLException {
		String[] campos = {"codigo", "orcamento", "cotacao", "tipoDeOS", "prisma", "numero_de_serie", "placa", "chassis","convenio", "cliente", "Veiculo", "km", "tecnico", "queixas", "abertura", "fechamento", "iss", "icms", "ipi", "custo_mao_de_obra", "custo_pecas", "horas", "custo_total", "valor_mao_de_obra","valor_pecas", "material_de_consulmo", "desconto", "valor_total","numero_de_parcelas", "primeira", "valor_das_parcelas","forma_de_pagamento", "ressalvas"};
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
		String sql = "SELECT orcamento, cotacao, tipoDeOS, prisma, numero_de_serie, placa, chassis, convenio, cliente, Veiculo, km, tecnico, queixas, abertura, fechamento, iss, icms, ipi, custo_mao_de_obra, custo_pecas, horas, custo_total, valor_mao_de_obra, valor_pecas, material_de_consulmo, desconto, valor_total, numero_de_parcelas, primeira, valor_das_parcelas, forma_de_pagamento, ressalvas, codigo FROM os where fechamento >=? and fechamento <=?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosOrdemDeServico> list = new LinkedList<DadosOrdemDeServico>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo));
			stmt.setString(2, map.get(campo));
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosOrdemDeServico os = new DadosOrdemDeServico();
				
				os.setOrcamento(rs.getInt(1));
				os.setCotacao(rs.getString(2));
				os.setTipoDeOS(rs.getString(3));
				os.setPrisma(rs.getString(4));
				os.setNumeroDeSerie(rs.getString(5));
				os.setPlaca(rs.getString(6));
				os.setChassis(rs.getString(7));
				os.setConvenio(rs.getString(8));
				os.setCliente(rs.getString(9));
				os.setVeiculo(rs.getString(10));
				os.setKm(rs.getString(11));
				os.setTecnico(rs.getString(12));
				os.setQueixas(rs.getString(13));
				os.setAbertura(rs.getDate(14));
				os.setFechamento(rs.getDate(15));
				os.setIss(rs.getString(16));
				os.setIcms(rs.getString(17));
				os.setIpi(rs.getString(18));
				os.setCustoMaoDeObra(rs.getString(19));
				os.setCustoPecas(rs.getString(20));
			    os.setHoras(rs.getString(21));
				os.setCustoTotal(rs.getFloat(22));
				os.setValorMaoDeObra(rs.getString(23));
				os.setValorPecas(rs.getString(24));
				os.setMaterialDeConsulmo(rs.getString(25));
				os.setDesconto(rs.getString(26));
				os.setValorTotal(rs.getFloat(27));
				os.setNumeroDeParcelas(rs.getString(28));
				os.setPrimeira(rs.getString(29));
			    os.setValorDasParcelas(rs.getString(30));
				os.setFormaDePagamento(rs.getString(31));
				os.setRessalvas(rs.getString(32));
				os.setCodigo(rs.getInt(33));
				
				
				list.add(os);
			}
			
			//map2.put("email","String qualquer") pegando a string do map passado
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		return (list.isEmpty())?null:list;
	}
	

	public Collection<DadosOrdemDeServico> findByNome(HashMap<String, String> map) throws SQLException {
		String[] campos = {"codigo", "orcamento", "cotacao", "tipoDeOS", "prisma", "numero_de_serie", "placa", "chassis","convenio", "cliente", "Veiculo", "km", "tecnico", "queixas", "abertura", "fechamento", "iss", "icms", "ipi", "custo_mao_de_obra", "custo_pecas", "horas", "custo_total", "valor_mao_de_obra","valor_pecas", "material_de_consulmo", "desconto", "valor_total","numero_de_parcelas", "primeira", "valor_das_parcelas","forma_de_pagamento", "ressalvas"};
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
		String sql = "SELECT orcamento, cotacao, tipoDeOS, prisma, numero_de_serie, placa, chassis, convenio, cliente, Veiculo, km, tecnico, queixas, abertura, fechamento, iss, icms, ipi, custo_mao_de_obra, custo_pecas, horas, custo_total, valor_mao_de_obra, valor_pecas, material_de_consulmo, desconto, valor_total, numero_de_parcelas, primeira, valor_das_parcelas, forma_de_pagamento, ressalvas, codigo FROM os where cliente like ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Collection<DadosOrdemDeServico> list = new LinkedList<DadosOrdemDeServico>();
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, map.get(campo)+"%");
			
			rs =  stmt.executeQuery();
			while(rs.next()){
				DadosOrdemDeServico os = new DadosOrdemDeServico();
				
				os.setOrcamento(rs.getInt(1));
				os.setCotacao(rs.getString(2));
				os.setTipoDeOS(rs.getString(3));
				os.setPrisma(rs.getString(4));
				os.setNumeroDeSerie(rs.getString(5));
				os.setPlaca(rs.getString(6));
				os.setChassis(rs.getString(7));
				os.setConvenio(rs.getString(8));
				os.setCliente(rs.getString(9));
				os.setVeiculo(rs.getString(10));
				os.setKm(rs.getString(11));
				os.setTecnico(rs.getString(12));
				os.setQueixas(rs.getString(13));
				os.setAbertura(rs.getDate(14));
				os.setFechamento(rs.getDate(15));
				os.setIss(rs.getString(16));
				os.setIcms(rs.getString(17));
				os.setIpi(rs.getString(18));
				os.setCustoMaoDeObra(rs.getString(19));
				os.setCustoPecas(rs.getString(20));
			    os.setHoras(rs.getString(21));
				os.setCustoTotal(rs.getFloat(22));
				os.setValorMaoDeObra(rs.getString(23));
				os.setValorPecas(rs.getString(24));
				os.setMaterialDeConsulmo(rs.getString(25));
				os.setDesconto(rs.getString(26));
				os.setValorTotal(rs.getFloat(27));
				os.setNumeroDeParcelas(rs.getString(28));
				os.setPrimeira(rs.getString(29));
			    os.setValorDasParcelas(rs.getString(30));
				os.setFormaDePagamento(rs.getString(31));
				os.setRessalvas(rs.getString(32));
				os.setCodigo(rs.getInt(33));
				
				
				list.add(os);
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
