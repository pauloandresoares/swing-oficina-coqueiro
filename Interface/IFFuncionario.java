package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;


import dto.DadosFuncionarios;

public interface IFFuncionario {

	
	
	public void pesquisaFuncionario(DadosFuncionarios func);
	public void alterarFuncionario(DadosFuncionarios func);
	public void excluirFuncionario(DadosFuncionarios func);
	public void incluirFuncionario(DadosFuncionarios func);
	public void primeiro(DadosFuncionarios func);
	public void anterior(DadosFuncionarios func);
	public void proximo(DadosFuncionarios func);
	public void ultimo(DadosFuncionarios func);
	public Collection<DadosFuncionarios> findByAll(HashMap<String, String> map) throws SQLException;
	public void closeObjectDAO(Connection con, ResultSet rs,PreparedStatement stmt);
	
	
	
	
}
