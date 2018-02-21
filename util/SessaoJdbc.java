package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;






public class SessaoJdbc {

	public static Connection getConnection(){
		Connection retorno =null;
		Conexao cx = new Conexao();
				try{
			Class.forName(cx.getDriver());
			retorno = DriverManager.getConnection(cx.getUrl(),cx.getUser(),cx.getPass());
			
			
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();
			
			
		}catch(SQLException e){
			System.out.println("Exception sql - class SessaoJDBC");
			e.printStackTrace();
			
			
		}
		
		
		
		
		
	return retorno;	
	}
	
	
}
