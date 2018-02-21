package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import daoJdbc.FactoryDAO;
import dto.DadosFornecedor;
import dto.DadosItem;

public class ItensFacade {
	public String criarContato(DadosItem item) {
		String retorno = null;

		
		FactoryDAO.getInstance().createItensDAO().createItensDAO(item);
			
			//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
		return retorno;

	}

	
	public void incluir(DadosItem item)
	{
		FactoryDAO.getInstance().createItensDAO().incluir(item);
	}
	public void excluir(DadosItem item)
	{
		FactoryDAO.getInstance().createItensDAO().excluir(item);
	}
	

	public void pesquisaCodigo(DadosItem item){
		FactoryDAO.getInstance().createItensDAO().pesquisarCodigo(item);
		
	}
	
	
	
	public void atualizar(DadosFornecedor fornecedor){
		FactoryDAO.getInstance().createFornecedorDAO().alterar(fornecedor);
	}
	public Collection<DadosFornecedor> buscaPorParametroNome(HashMap<String, String> map) throws SQLException {
		return FactoryDAO.getInstance().createFornecedorDAO().findByParam(map);
	}
	public void primeiro(DadosItem item){
		FactoryDAO.getInstance().createItensDAO().primeiro(item);
	}
	public void ultimo(DadosItem item){
		FactoryDAO.getInstance().createItensDAO().ultimo(item);
	}
	

}


