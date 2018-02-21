package businessObject;

import daoJdbc.ClienteDAO;
import dto.DadosCliente;

public class ClienteBO {
	
	public static boolean isCamposPrenchidos(DadosCliente cliente)
	{
		boolean retorno = true;
		if(cliente.getClienteNome() == null || cliente.getClienteNome().trim().equals(""))
			retorno =  false;
		
		if(cliente.getClienteCpfCgc()== null || cliente.getClienteCpfCgc().trim().equals(""))
			retorno =  false;
		
		if(cliente.getClienteTelFax()== null || cliente.getClienteTelFax().trim().equals(""))
			retorno =  false;

		return retorno;
		
				
	}

	
	
	
	
	
}
