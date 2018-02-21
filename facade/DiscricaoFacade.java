package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import daoJdbc.FactoryDAO;

import dto.DadosCliente;
import dto.DadosDescricaoDePecas;


public class DiscricaoFacade {
	public String criarContato(DadosDescricaoDePecas pecas) {
		String retorno = null;

		
		FactoryDAO.getInstance().createDiscricaoDAO().createDiscricaoDAO(pecas);
			
			//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
		return retorno;

	}
	
	public void incluir(DadosDescricaoDePecas pecas){
		FactoryDAO.getInstance().createDiscricaoDAO().incluir(pecas);
	}
	public void excluir(DadosDescricaoDePecas pecas){
		FactoryDAO.getInstance().createDiscricaoDAO().excluir(pecas);
	}
	public void atualizar(DadosDescricaoDePecas pecas){
		FactoryDAO.getInstance().createDiscricaoDAO().alterar(pecas);
	}
	public Collection<DadosDescricaoDePecas> buscaTudo(HashMap<String, String> map) throws SQLException {
		return FactoryDAO.getInstance().createDiscricaoDAO().findByAll(map);
	}
	public void pesquisaSimples(DadosDescricaoDePecas pecas){
		FactoryDAO.getInstance().createDiscricaoDAO().consultar(pecas);
	}
}
