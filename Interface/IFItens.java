package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.DadosItem;


public interface IFItens {
	public void incluir(DadosItem item);
	public void alterar(DadosItem item);
	public void excluir(DadosItem item);
	public void pesquisarCodigo(DadosItem item);
	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt);
	public void createItensDAO(DadosItem item);
	public void pesquisarQuantidade(DadosItem item);
	public void primeiro(DadosItem item);
	public void ultimo(DadosItem item);
}
