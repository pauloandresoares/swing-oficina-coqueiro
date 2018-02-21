package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import dto.DadosOrcamento;



public interface IFOrcamento {
	
	public void incluir(DadosOrcamento orcamento);
	public void alterar(DadosOrcamento orcamento);
	public void excluir(DadosOrcamento orcamento);
	public void primeiro(DadosOrcamento orcamento);
	public void ultimo(DadosOrcamento orcamento);
	public void pesquisaCodigo(DadosOrcamento orcamento);
	public void createOrcamentoDAO(DadosOrcamento orcamento);
	public Collection<DadosOrcamento> findByParam(HashMap<String, String> map) throws SQLException;
	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt);
	
	
}
