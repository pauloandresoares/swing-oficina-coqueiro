package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import daoJdbc.FactoryDAO;
import dto.DadosConvenio;
import dto.DadosFornecedor;

public class ConvenioFacade {
	public String criarContato(DadosConvenio convenio) {
		String retorno = null;

		
		FactoryDAO.getInstance().createConvenioDAO().createConvenioDAO(convenio);
			
			//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
		return retorno;

	}
	public void incluir(DadosConvenio convenio)	{
		FactoryDAO.getInstance().createConvenioDAO().incluir(convenio);
	}
	public void excluir(DadosConvenio convenio)	{	
		FactoryDAO.getInstance().createConvenioDAO().excluir(convenio);
	} 
	public void alterar(DadosConvenio convenio)	{
		FactoryDAO.getInstance().createConvenioDAO().alterar(convenio);
	} 
	public void primeiro(DadosConvenio convenio){
		FactoryDAO.getInstance().createConvenioDAO().primeiro(convenio);
	} 
	public void ultimo(DadosConvenio convenio)	{
		FactoryDAO.getInstance().createConvenioDAO().ultimo(convenio);
	} 
	public void pesquisaCodigo(DadosConvenio convenio)	{
		FactoryDAO.getInstance().createConvenioDAO().pesquisaCodigo(convenio);
	} 
	public Collection<DadosConvenio> buscaLista(HashMap<String, String> map) throws SQLException {
		return FactoryDAO.getInstance().createConvenioDAO().findByAll(map);
	}
	public void pesquisaNome(DadosConvenio convenio){
		FactoryDAO.getInstance().createConvenioDAO().pesquisaNome(convenio);
		
	}
	
}
