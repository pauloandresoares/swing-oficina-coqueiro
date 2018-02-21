package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import daoJdbc.FactoryDAO;

import dto.DadosCliente;
import dto.DadosEstoque;
import dto.DadosPecas;

public class EstoqueFacade {
	public String criarContato(DadosEstoque estoque) {
		String retorno = null;

		
		FactoryDAO.getInstance().createEstoqueDAO().createEstoqueDAO(estoque);
			
			//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
		return retorno;

	}

	
	public void incluir(DadosEstoque estoque)
	{
		FactoryDAO.getInstance().createEstoqueDAO().incluir(estoque);
	}
	public void Alterar(DadosEstoque estoque){
		FactoryDAO.getInstance().createEstoqueDAO().alterar(estoque);
		
	}
	public void excluir(DadosEstoque estoque){
	
		FactoryDAO.getInstance().createEstoqueDAO().excluir(estoque);
	}
	public Collection<DadosEstoque> buscaTudo(HashMap<String, String> map) throws SQLException {
		return FactoryDAO.getInstance().createEstoqueDAO().findByAll(map);
	}
	public void pesquisaNome(DadosEstoque estoque){
		FactoryDAO.getInstance().createEstoqueDAO().pesquisarNome(estoque);
		
			
	}
	public Collection<DadosEstoque> pegarQuantidade(HashMap<String, String> map) throws SQLException {
		return FactoryDAO.getInstance().createEstoqueDAO().pegarQuantidade(map);
	}
}
