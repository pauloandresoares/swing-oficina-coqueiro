package Interface;

import dto.DadosSenha;

public interface IFSenha {
	public void incluirSenha(DadosSenha senha);
	public void excluirSenha(DadosSenha senha);
	public void AlteraSenha(DadosSenha senha);
	public void PesquisarSenha(DadosSenha senha);
	public void createSenhaDAO(DadosSenha senha);
	
	

}
