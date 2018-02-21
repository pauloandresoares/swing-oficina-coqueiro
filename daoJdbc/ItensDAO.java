package daoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.SessaoJdbc;

import dto.DadosItem;
import Interface.IFItens;

public class ItensDAO implements IFItens{

	public void alterar(DadosItem item) {
		String sql = "UPDATE item SET codigo_peca=?, Quantidade=?, valor_unitario=?, iss=?, icms=?, ipi=?, numero_item=?, custo_total=?, valor_total=?, tipo=?, nome=? WHERE codigo_os=?";
		Connection con = null; 
		ResultSet rs =null;
		PreparedStatement stmt = null;
		int erro=0;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, item.getCodigoOS());
			stmt.setString(2, item.getQuantidade());
			stmt.setString(3, item.getValorUnitario());
			stmt.setString(4, item.getIss());
			stmt.setString(5, item.getIcms());
			stmt.setString(6, item.getIpi());
			stmt.setInt(7, item.getNumeroItem());
			stmt.setFloat(8, item.getCustoTotal());
			stmt.setFloat(9, item.getValorTotal());
			stmt.setString(10, item.getTipo());
			stmt.setString(11, item.getNome());
			stmt.setInt(12, item.getCodigoOS());
			
		
			
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			erro++;
		}finally{
			closeObjectDAO(con, rs, stmt);
			if(erro>=1){
				JOptionPane.showMessageDialog(null,"ERRO - O Item novo não pode ser alterado! o banco não deve esta conectado ");
							
			}else JOptionPane.showMessageDialog(null,"O Item foi alterado com sucesso ");
						
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

	public void createItensDAO(DadosItem item) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(DadosItem item) {
		String sql="DELETE FROM item where codigo_os = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int erro=0;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setInt(1, item.getCodigoOS());
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

	public void incluir(DadosItem item) {
		String sql = "insert into item( codigo_os, codigo_peca, Quantidade, valor_unitario, iss, icms, ipi, numero_item, custo_total, valor_total, tipo, nome)values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int erro=0;
		
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, item.getCodigoOS());
			stmt.setInt(2, item.getCodigoPeca());
			stmt.setString(3, item.getQuantidade());
			stmt.setString(4, item.getValorUnitario());
			stmt.setString(5, item.getIss());
			stmt.setString(6, item.getIcms());
			stmt.setString(7, item.getIpi());
			stmt.setInt(8, item.getNumeroItem());
			stmt.setFloat(9, item.getCustoTotal());
			stmt.setFloat(10, item.getCustoTotal());
			stmt.setString(11, item.getTipo());
			stmt.setString(12, item.getNome());
			
								
			stmt.executeUpdate();
					
			
		} catch (SQLException e) {

			e.printStackTrace();
			erro++;
		} finally {
			
			if(erro>=1){
				JOptionPane.showMessageDialog(null,"ERRO - O item novo não pode ser incluído! o banco não deve esta conectado ");
							
			}else JOptionPane.showMessageDialog(null,"O item foi incluído com sucesso ");
						
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void pesquisarCodigo(DadosItem item) {
		String sql ="SELECT codigo_os, codigo_peca, Quantidade, valor_unitario, iss, icms, ipi, numero_item, custo_total, valor_total, tipo, nome FROM item WHERE codigo_os = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int erro=0;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, item.getCodigoOS());
			
			rs = stmt.executeQuery();
			while(rs.next()){
				item.setCodigoOS(rs.getInt(1));
				item.setCodigoPeca(rs.getInt(2));
				item.setQuantidade(rs.getString(3));
				item.setValorUnitario(rs.getString(4));
				item.setIss(rs.getString(5));
				item.setIcms(rs.getString(6));
				item.setIpi(rs.getString(7));
				item.setNumeroItem(rs.getInt(8));
				item.setCustoTotal(rs.getFloat(9));
				item.setValorTotal(rs.getFloat(10));
				item.setTipo(rs.getString(11));
				item.setNome(rs.getString(12));
				
			}
			
			
		} catch (SQLException e) {
				e.printStackTrace();
			
		} finally {
			
						
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void pesquisarQuantidade(DadosItem item) {
		String sql ="select count(codigo_os) AS total from item where codigo_os = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, item.getCodigoOS());
											
			rs = stmt.executeQuery();
			while(rs.next()){
				item.setQuantidadeTotal(rs.getInt("total"));
				
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	
	
	
	}

	public void primeiro(DadosItem item) {
		String sql ="SELECT codigo_os, codigo_peca, Quantidade, valor_unitario, iss, icms, ipi, numero_item, custo_total, valor_total, tipo, nome FROM item ORDER BY numero_item asc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				item.setCodigoOS(rs.getInt(1));
				item.setCodigoPeca(rs.getInt(2));
				item.setQuantidade(rs.getString(3));
				item.setValorUnitario(rs.getString(4));
				item.setIss(rs.getString(5));
				item.setIcms(rs.getString(6));
				item.setIpi(rs.getString(7));
				item.setNumeroItem(rs.getInt(8));
				item.setCustoTotal(rs.getFloat(9));
				item.setValorTotal(rs.getFloat(10));
				item.setTipo(rs.getString(11));
				item.setNome(rs.getString(12));
	
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

	public void ultimo(DadosItem item) {
		String sql ="SELECT codigo_os, codigo_peca, Quantidade, valor_unitario, iss, icms, ipi, numero_item, custo_total, valor_total, tipo FROM item ORDER BY numero_item asc LIMIT 1";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			
											
			rs = stmt.executeQuery();
			while(rs.next()){
				item.setCodigoOS(rs.getInt(1));
				item.setCodigoPeca(rs.getInt(2));
				item.setQuantidade(rs.getString(3));
				item.setValorUnitario(rs.getString(4));
				item.setIss(rs.getString(5));
				item.setIcms(rs.getString(6));
				item.setIpi(rs.getString(7));
				item.setNumeroItem(rs.getInt(8));
				item.setCustoTotal(rs.getFloat(9));
				item.setValorTotal(rs.getFloat(10));
				item.setTipo(rs.getString(11));
				item.setNome(rs.getString(12));
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
	}

}
