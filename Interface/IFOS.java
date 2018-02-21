package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;


import dto.DadosOrdemDeServico;

public interface IFOS {
	
	public void incluir(DadosOrdemDeServico os);
	public void alterar(DadosOrdemDeServico os);
	public void excluir(DadosOrdemDeServico os);
	public void primeiro(DadosOrdemDeServico os);
	public void ultimo(DadosOrdemDeServico os);
	public void pesquisaCodigo(DadosOrdemDeServico os);
	public void createOSDAO(DadosOrdemDeServico os);
	public Collection<DadosOrdemDeServico> findByParam(HashMap<String, String> map) throws SQLException;
	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt);
	public Collection<DadosOrdemDeServico> findByNome(HashMap<String, String> map) throws SQLException;
	public Collection<DadosOrdemDeServico> findByData(HashMap<String, String> map) throws SQLException;

}
