package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;



import dto.DadosEstoque;




public interface IFEstoque {
	public void incluir(DadosEstoque estoque);
	public void alterar(DadosEstoque estoque);
	public void excluir(DadosEstoque estoque);
	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt);
	public void createEstoqueDAO(DadosEstoque estoque);
	public Collection<DadosEstoque> findByAll(HashMap<String, String> map) throws SQLException;
	public Collection<DadosEstoque> pegarQuantidade(HashMap<String, String> map) throws SQLException;
	public void pesquisarNome(DadosEstoque estoque);
}
