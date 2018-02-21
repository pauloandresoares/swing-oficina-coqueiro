package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.JOptionPane;

import daoJdbc.ClienteDAO;
import daoJdbc.FactoryDAO;

import dto.DadosCliente;




import businessObject.ClienteBO;




public class ClienteFacade {
	public String criarContato(DadosCliente cliente) {
		String retorno = null;

		if (!ClienteBO.isCamposPrenchidos(cliente))
			retorno = "Os campos Obrigatorios devem ser preenchidos";
		
		else
			FactoryDAO.getInstance().createClienteDAO().createClienteDAO(cliente);
			
			//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
		return retorno;

	}

	
	public void incluirContato(DadosCliente cliente)
	{
		FactoryDAO.getInstance().createClienteDAO().incluir(cliente);
	}
	public void excluirContato(DadosCliente cliente)
	{
		FactoryDAO.getInstance().createClienteDAO().excluir(cliente);
	}
	

	public void pesquisaCodigo(DadosCliente cliente){
		FactoryDAO.getInstance().createClienteDAO().pesquisaClienteCodigo(cliente);
	}
	public void pesquisaNome(DadosCliente cliente){
		FactoryDAO.getInstance().createClienteDAO().pesquisaClienteNome(cliente);
	}
	
	public void pesquisaNomeJlist(DadosCliente cliente){
		FactoryDAO.getInstance().createClienteDAO().pesquisaClienteJlist(cliente);
	}
	public void atualizarContato(DadosCliente cliente){
		FactoryDAO.getInstance().createClienteDAO().alterar(cliente);
	}
	public Collection<DadosCliente> buscaPorParametroNome(HashMap<String, String> map) throws SQLException {
		return FactoryDAO.getInstance().createClienteDAO().findByParam(map);
	}
	public void primeiro(DadosCliente cliente){
		FactoryDAO.getInstance().createClienteDAO().primeiro(cliente);
	}
	public void ultimo(DadosCliente cliente){
		FactoryDAO.getInstance().createClienteDAO().ultimo(cliente);
	}
	public void pesquisaComum(DadosCliente cliente){
		FactoryDAO.getInstance().createClienteDAO().pesquisaRegistro(cliente);
	}
	public Collection<DadosCliente> buscaTudoCliente(HashMap<String, String> map) throws SQLException {
		return FactoryDAO.getInstance().createClienteDAO().findByAll(map);
	}

}
