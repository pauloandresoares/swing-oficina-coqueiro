package Interface;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;



import daoJdbc.ClienteDAO;
import dto.DadosCliente;





public interface IFCliente {
	
	
	public void pesquisaClienteCodigo(DadosCliente cliente);
	public void pesquisaClienteNome(DadosCliente cliente);
	public void pesquisaClienteJlist(DadosCliente cliente);
	public void primeiro(DadosCliente cliente);
	public void ultimo(DadosCliente cliente);
	public void incluir(DadosCliente cliente);
	public void alterar(DadosCliente cliente);
	public void excluir(DadosCliente cliente);
	public void pesquisaRegistro(DadosCliente cliente);
	public void createClienteDAO(DadosCliente cliente);
	public Collection<DadosCliente> findByParam(HashMap<String, String> map) throws SQLException;
	public Collection<DadosCliente> findByAll(HashMap<String, String> map) throws SQLException;

}
