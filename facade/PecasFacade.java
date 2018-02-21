package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import daoJdbc.FactoryDAO;

import dto.DadosCliente;
import dto.DadosPecas;

public class PecasFacade {
	
		public String criarContato(DadosPecas pecas) {
			String retorno = null;

			
			FactoryDAO.getInstance().createPecasDAO().createPecasDAO(pecas);
				
				//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
			return retorno;

		}

		
		public void incluir(DadosPecas pecas)
		{
			FactoryDAO.getInstance().createPecasDAO().incluir(pecas);
		}
		public void excluir(DadosPecas pecas){
			FactoryDAO.getInstance().createPecasDAO().excluir(pecas);
			
		}
		public void primeiro(DadosPecas pecas){
			FactoryDAO.getInstance().createPecasDAO().primeiro(pecas);
			
		}
		public void ultimo(DadosPecas pecas){
			FactoryDAO.getInstance().createPecasDAO().ultimo(pecas);
			
			
		}
		public void pesquisaNome(DadosPecas pecas){
			FactoryDAO.getInstance().createPecasDAO().pesquisaRegistro(pecas);
			
		}
		public void alterar(DadosPecas pecas){
			FactoryDAO.getInstance().createPecasDAO().alterar(pecas);
			
		}
		public Collection<DadosPecas > buscaLista(HashMap<String, String> map) throws SQLException {
			
			return FactoryDAO.getInstance().createPecasDAO().findByAll(map);
		}
		public void pegarEstoque(DadosPecas pecas){
			
			FactoryDAO.getInstance().createPecasDAO().pegarQuantidadeEstoque(pecas);
		}
		public void pegarCodigo(DadosPecas pecas){
			FactoryDAO.getInstance().createPecasDAO().pesquisaCodigo(pecas);
			
		}
		public void pegarPorNome(DadosPecas pecas){
			FactoryDAO.getInstance().createPecasDAO().pesquisaNome(pecas);
			
		}
			
		public void DeletarPorCodigo(DadosPecas pecas){
			
			FactoryDAO.getInstance().createPecasDAO().excluirNome(pecas);
		}
        public Collection<DadosPecas > pegarQuantidade(HashMap<String, String> map) throws SQLException {
			
			return FactoryDAO.getInstance().createPecasDAO().pegarQuantidade(map);
		}

	}


