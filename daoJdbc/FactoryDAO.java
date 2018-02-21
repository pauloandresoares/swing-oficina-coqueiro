package daoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.SessaoJdbc;

import Interface.IFCliente;
import Interface.IFConvenio;
import Interface.IFDiscricao;
import Interface.IFEstoque;
import Interface.IFFornecedor;
import Interface.IFFuncionario;
import Interface.IFItens;
import Interface.IFOS;
import Interface.IFPecas;
import Interface.IFSenha;


public class FactoryDAO {
		
		private static final IFPecas PecasDAO = null;
		private static FactoryDAO instance;
		
		public static FactoryDAO getInstance(){
			if(instance == null){
				instance = new FactoryDAO();
			}
			createTables();
			return instance;
		}
		
		public static void createTables(){
			String sql = 	
				"CREATE DATABASE coqueiros;"+	
				
			"CREATE TABLE cliente("+ 
			
			  "cliente_codigo serial NOT NULL,"+
			  "cliente_nome varchar(75) NOT NULL,"+
			  "cliente_cpfcgc varchar(15),"+
			  "cliente_endereco text,"+
			  "cliente_bairro varchar(20),"+
			  "cliente_telfax varchar(40),"+
			  "cliente_observacoes text,"+
			  "cliente_cidade varchar(20),"+
			  "cliente_cep varchar(15),"+
			  "cliente_nasc varchar(10),"+
			  "cliente_ie varchar(20),"+
			  "cliente_contato varchar(15),"+
			  "cliente_tipo int4,"+
			  "cliente_uf int4,"+
			  "cliente_pessoa int4,"+
			  "CONSTRAINT cliente_pkey PRIMARY KEY (cliente_codigo)	)"+
			"WITHOUT OIDS;"+
			"ALTER TABLE cliente OWNER TO postgres;";

			
			
			
			Connection conn = null;
			PreparedStatement stmt = null;
			try{
				conn = SessaoJdbc.getConnection(); 
				stmt = conn.prepareStatement(sql);
				//stmt.execute();
			}catch(SQLException e){
				
			}
		}
		
		public IFCliente createClienteDAO(){
			
			return new ClienteDAO();
		}
		public IFFornecedor createFornecedorDAO() {
			return new FornecedorDAO();

		}
		public IFSenha createSenhaDAO() {
			return new SenhaDAO();

		}
		public IFFuncionario createFuncionarioDAO(){
			
			return new FuncionarioDAO();
		}
		public IFDiscricao createDiscricaoDAO(){
			
			return new DiscricaoDAO();
		}
		public IFPecas createPecasDAO(){
			
			return new PecasDAO();
		}
		public IFEstoque createEstoqueDAO(){
			
			return new EstoqueDAO();
		}
		public IFConvenio createConvenioDAO(){
			
			return new ConvenioDAO();
		}
		public IFOS createOSDAO(){
			
			return new OSDAO();
		}
		public IFItens createItensDAO(){
			
			return new ItensDAO();
			
		}
		
		
		
	}
