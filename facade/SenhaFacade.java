package facade;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import daoJdbc.FactoryDAO;
import daoJdbc.FactoryDAO;
import dto.DadosSenha;
import Interface.IFSenha;




public class SenhaFacade {
	public String criarContato(DadosSenha senha) {
		String retorno = null;

		
		FactoryDAO.getInstance().createSenhaDAO().createSenhaDAO(senha);
			
			//FactoryCliente.getInstance().createContatoDAO().createContato(cliente);
		return retorno;

	}

	
	public void incluirUsuario(DadosSenha senha){
		FactoryDAO.getInstance().createSenhaDAO().incluirSenha(senha);
	}
	public void pegarUsuario(DadosSenha senha){
		FactoryDAO.getInstance().createSenhaDAO().PesquisarSenha(senha);
	}
	public void excluirUsuario(DadosSenha senha){
		FactoryDAO.getInstance().createSenhaDAO().excluirSenha(senha);
	}
	public void alterarUsuario(DadosSenha senha){
		FactoryDAO.getInstance().createSenhaDAO().AlteraSenha(senha);
		
	}


	
	
	

}
