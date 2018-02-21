package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import daoJdbc.FactoryDAO;
import dto.DadosConvenio;
import dto.DadosOrdemDeServico;

public class OSFacade {
	
		public String criarContato(DadosOrdemDeServico os) {
			String retorno = null;

			
			FactoryDAO.getInstance().createOSDAO().createOSDAO(os);
				
				//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
			return retorno;

		}
		public void incluir(DadosOrdemDeServico os)	{
			FactoryDAO.getInstance().createOSDAO().incluir(os);
		}
		public void excluir(DadosOrdemDeServico os)	{	
			FactoryDAO.getInstance().createOSDAO().excluir(os);
		} 
		public void alterar(DadosOrdemDeServico os)	{
			FactoryDAO.getInstance().createOSDAO().alterar(os);
		} 
		public void primeiro(DadosOrdemDeServico os){
			FactoryDAO.getInstance().createOSDAO().primeiro(os);
		} 
		public void ultimo(DadosOrdemDeServico os)	{
			FactoryDAO.getInstance().createOSDAO().ultimo(os);
		} 
		public void pesquisaCodigo(DadosOrdemDeServico os)	{
			FactoryDAO.getInstance().createOSDAO().pesquisaCodigo(os);
		} 
		public Collection<DadosOrdemDeServico> buscaLista(HashMap<String, String> map) throws SQLException {
			return FactoryDAO.getInstance().createOSDAO().findByParam(map);
		}
		public Collection<DadosOrdemDeServico> buscaData(HashMap<String, String> map) throws SQLException {
			return FactoryDAO.getInstance().createOSDAO().findByData(map);
		}
		public Collection<DadosOrdemDeServico> buscaNome(HashMap<String, String> map) throws SQLException {
			return FactoryDAO.getInstance().createOSDAO().findByNome(map);
		}
				
	}

