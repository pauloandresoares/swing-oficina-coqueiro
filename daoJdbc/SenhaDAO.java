package daoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.SessaoJdbc;

import dto.DadosSenha;
import Interface.IFSenha;

public class SenhaDAO implements IFSenha{

	public void AlteraSenha(DadosSenha senha) {
		
		String sql = "UPDATE senha SET usuario_nome = ?, usuario_cpf =?, usuario_rg =?, usuario_senha =? WHERE usuario_usuario=?";
		Connection con = null;
		ResultSet rs =null;
		PreparedStatement stmt = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, senha.getSenhaNome());
			stmt.setString(2, senha.getSenhaCPF());
			stmt.setString(3, senha.getSenhaRG());
			stmt.setString(4, senha.getSenhaSenha());
			stmt.setString(5, senha.getSenhaUsuario());
			
			
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		
		
		
	}
	
	/** 
	 * Metodo para pesquisar usuário
	 * 
	 * */
	
	public void PesquisarSenha(DadosSenha senha) {
		String sql ="SELECT usuario_senha, usuario_usuario, usuario_rg, usuario_cpf, usuario_nome FROM senha WHERE usuario_usuario = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,senha.getSenhaUsuario());
			
								
			rs = stmt.executeQuery();
			while(rs.next()){
			senha.setSenhaSenha(rs.getString(1));
			senha.setSenhaUsuario(rs.getString(2));
			senha.setSenhaRG(rs.getString(3));
			senha.setSenhaCPF(rs.getString(4));
			senha.setSenhaNome(rs.getString(5));
			
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeObjectDAO(con, rs, stmt);
		}
		
	}

	public void excluirSenha(DadosSenha senha) {
		String sql="DELETE FROM senha where usuario_usuario = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);	
			stmt.setString(1, senha.getSenhaUsuario());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeObjectDAO(con, rs, stmt);
		}
		
	}
	
	/** 
	 * Metodo para incluir novgo usuário
	 * 
	 * */

	public void incluirSenha(DadosSenha senha) {
		String sql = "insert into senha(usuario_senha,usuario_nome,usuario_rg,usuario_cpf,usuario_usuario)values(?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int erro=0;
		try {
			con = SessaoJdbc.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, senha.getSenhaSenha());
			stmt.setString(2, senha.getSenhaNome());
			stmt.setString(3, senha.getSenhaRG());
			stmt.setString(4, senha.getSenhaCPF());
			stmt.setString(5, senha.getSenhaUsuario());
			
			
			stmt.executeUpdate();
			
						
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			erro++;
		} finally {
			
			if(erro>=1){
				JOptionPane.showMessageDialog(null,"ERRO - O registro novo não pode ser incluído! o banco não deve esta conectado ou o nome do usuario já deve existir! ");
				
			
			}else{ JOptionPane.showMessageDialog(null,"Registro incluído com sucesso ");
			
			
			closeObjectDAO(con, rs, stmt);
		}
	}
	}
				
	
			public void closeObjectDAO(Connection con, ResultSet rs,PreparedStatement stmt) {
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

			public void createSenhaDAO(DadosSenha senha) {
				// TODO Auto-generated method stub
				
			}
}
