package daoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import util.SessaoJdbc;

import dto.DadosOrcamento;
import Interface.IFOrcamento;

public class OrcamentoDAO implements IFOrcamento {

	public void alterar(DadosOrcamento orcamento) {
	}

	public void closeObjectDAO(Connection con, ResultSet rs, PreparedStatement stmt) {
		// TODO Auto-generated method stub
		
	}

	public void createOrcamentoDAO(DadosOrcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(DadosOrcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	public Collection<DadosOrcamento> findByParam(HashMap<String, String> map) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void incluir(DadosOrcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	public void pesquisaCodigo(DadosOrcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	public void primeiro(DadosOrcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	public void ultimo(DadosOrcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

}
