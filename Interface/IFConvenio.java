package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;



import dto.DadosConvenio;



public interface IFConvenio {
	
	
	
	public void primeiro(DadosConvenio convenio);
	public void ultimo(DadosConvenio convenio);
	public void incluir(DadosConvenio convenio);
	public void alterar(DadosConvenio convenio);
	public void excluir(DadosConvenio convenio);
	public void pesquisaCodigo(DadosConvenio convenio);
	public void pesquisaNome(DadosConvenio convenio);
	public void createConvenioDAO(DadosConvenio convenio);
	public Collection<DadosConvenio> findByAll(HashMap<String, String> map) throws SQLException;
	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt);
}
