package Interface;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;


import dto.DadosDescricaoDePecas;

public interface IFDiscricao {
	public void incluir(DadosDescricaoDePecas pecas);
	public void alterar(DadosDescricaoDePecas pecas);
	public void excluir(DadosDescricaoDePecas pecas);
	public Collection<DadosDescricaoDePecas> findByAll(HashMap<String, String> map) throws SQLException;
	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt);
	public void createDiscricaoDAO(DadosDescricaoDePecas pecas);
	public void consultar(DadosDescricaoDePecas pecas);
}
