package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;


import dto.DadosFornecedor;

public interface IFFornecedor {
	public void pesquisaFornecedorCodigo(DadosFornecedor fornecedor);
	public void pesquisaFornecedorNome(DadosFornecedor fornecedor);
	public void pesquisaFornecedorJlist(DadosFornecedor fornecedor);
	public void primeiro(DadosFornecedor fornecedor);
	public void ultimo(DadosFornecedor fornecedor);
	public void incluir(DadosFornecedor fornecedor);
	public void alterar(DadosFornecedor fornecedor);
	public void excluir(DadosFornecedor fornecedor);
	public void pesquisaRegistro(DadosFornecedor fornecedor);
	public void createFornecedorDAO(DadosFornecedor fornecedor);
	public Collection<DadosFornecedor> findByParam(HashMap<String, String> map) throws SQLException;
	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt);

}
