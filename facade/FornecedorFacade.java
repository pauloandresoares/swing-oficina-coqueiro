package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import businessObject.ClienteBO;

import daoJdbc.FactoryDAO;


import dto.DadosFornecedor;

public class FornecedorFacade {
	public String criarContato(DadosFornecedor fornecedor) {
		String retorno = null;

		
		FactoryDAO.getInstance().createFornecedorDAO().createFornecedorDAO(fornecedor);
			
			//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
		return retorno;

	}

	
	public void incluirFornecedor(DadosFornecedor fornecedor)
	{
		FactoryDAO.getInstance().createFornecedorDAO().incluir(fornecedor);
	}
	public void excluirFornecedor(DadosFornecedor fornecedor)
	{
		FactoryDAO.getInstance().createFornecedorDAO().excluir(fornecedor);
	}
	

	public void pesquisaCodigo(DadosFornecedor fornecedor){
		FactoryDAO.getInstance().createFornecedorDAO().pesquisaFornecedorCodigo(fornecedor);
	}
	public void pesquisaNome(DadosFornecedor fornecedor){
		FactoryDAO.getInstance().createFornecedorDAO().pesquisaFornecedorNome(fornecedor);
	}
	
	public void pesquisaNomeJlist(DadosFornecedor fornecedor){
		FactoryDAO.getInstance().createFornecedorDAO().pesquisaFornecedorJlist(fornecedor);
	}
	public void atualizarFornecedor(DadosFornecedor fornecedor){
		FactoryDAO.getInstance().createFornecedorDAO().alterar(fornecedor);
	}
	public Collection<DadosFornecedor> buscaPorParametroNome(HashMap<String, String> map) throws SQLException {
		return FactoryDAO.getInstance().createFornecedorDAO().findByParam(map);
	}
	public void primeiro(DadosFornecedor fornecedor){
		FactoryDAO.getInstance().createFornecedorDAO().primeiro(fornecedor);
	}
	public void ultimo(DadosFornecedor fornecedor){
		FactoryDAO.getInstance().createFornecedorDAO().ultimo(fornecedor);
	}
	public void pesquisaComum(DadosFornecedor fornecedor){
		FactoryDAO.getInstance().createFornecedorDAO().pesquisaRegistro(fornecedor);
	}
	

}
