package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;


import dto.DadosPecas;

public interface IFPecas {
	public void primeiro(DadosPecas pecas);
	public void ultimo(DadosPecas pecas);
	public void incluir(DadosPecas pecas);
	public void alterar(DadosPecas pecas);
	public void excluir(DadosPecas pecas);
	public void pesquisaNome(DadosPecas pecas);
	public void excluirNome(DadosPecas pecas);
	public void pesquisaCodigo(DadosPecas pecas);
	public void pesquisaRegistro(DadosPecas pecas);
	public void createPecasDAO(DadosPecas pecas);
	public Collection<DadosPecas> findByAll(HashMap<String, String> map) throws SQLException;
	public Collection<DadosPecas> pegarQuantidade(HashMap<String, String> map) throws SQLException;
	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt);
	public void pegarQuantidadeEstoque(DadosPecas pecas);
	
	
	
	
	
	
	
}
