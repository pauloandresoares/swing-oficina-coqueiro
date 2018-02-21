package util;

import java.io.InputStream;
import java.util.Properties;




public class Conexao {
	
	public String user;
	public String url;
	public String pass;
	public String driver;
	public String configuracao;
	
	public Conexao(){
		conectar(); 
	}
	
	/**
	 * @retorna configuracao
	 */
	
	public String getConfiguracao() {
		return configuracao;
	}


	/**
	 * @retorna pass 
	 */
	public String getPass() {
		return pass;
	}


	/**
	 * @retorna url
	 */
	public String getUrl() {
		return url;
	}


	/**
	 * @retorna user
	 */
	public String getUser() {
		return user;
	}

	
	
	
	
	public void conectar(){
		try{
		Properties pop = new Properties();
		InputStream is = Conexao.class.getResourceAsStream("/configuracaopostgresql.properties");
		pop.load(is);
		user = pop.getProperty("jdbc.user");
		pass = pop.getProperty("jdbc.password");
		url = pop.getProperty("jdbc.url");
		driver = pop.getProperty("jdbc.driver");
		configuracao = pop.getProperty("jdbc.configuracaoberal");
		
		}catch(Exception e){
			System.out.println("Exception - class util.Conexao");
			e.printStackTrace();
		}
	
		
	}
	/**
	 * @retorna driver
	 */
	public String getDriver() {
		return driver;
	}
	
	

	
}
