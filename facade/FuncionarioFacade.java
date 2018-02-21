package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import daoJdbc.FactoryDAO;
import dto.DadosCliente;
import dto.DadosFuncionarios;



public class FuncionarioFacade {
	public String criarContato(DadosFuncionarios func) {
		String retorno = null;

		
		FactoryDAO.getInstance().createFuncionarioDAO();
			
			//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
		return retorno;

	}

	
	public void incluirFuncionario(DadosFuncionarios func)
	{
		FactoryDAO.getInstance().createFuncionarioDAO().incluirFuncionario(func);
	}
	public void alterarFuncionario(DadosFuncionarios func)
	{
		FactoryDAO.getInstance().createFuncionarioDAO().alterarFuncionario(func);
	}
	
	
	public void excluirFuncionario(DadosFuncionarios func)
	{
		FactoryDAO.getInstance().createFuncionarioDAO().excluirFuncionario(func);
	}
	

	public void pesquisaCodigo(DadosFuncionarios func){
		FactoryDAO.getInstance().createFuncionarioDAO().pesquisaFuncionario(func);
	
	
	}
	public Collection<DadosFuncionarios> buscaTudoFuncionario(HashMap<String, String> map) throws SQLException {
		return FactoryDAO.getInstance().createFuncionarioDAO().findByAll(map);
	}
	public void ultimo(DadosFuncionarios func){
		FactoryDAO.getInstance().createFuncionarioDAO().ultimo(func);
	
	
	}
	public void primeiro(DadosFuncionarios func){
		FactoryDAO.getInstance().createFuncionarioDAO().primeiro(func);
	
	
	}
}

