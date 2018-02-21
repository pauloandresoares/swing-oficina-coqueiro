package dto;

public class DadosCliente {
	//Dados da tabela cliente
	private int clienteCodigo;
	private String clienteNome;
	private int clientePessoa;
	private String clienteCpfCgc;
	private String clienteEndereco;
	private String clienteBairro;
	private String clienteTelFax;
	private String clienteObservacoes;
	private String clienteCidade;
	private int clienteTipo;
	private String clienteCep;
	private int clienteUf;
	private String clienteDataDeNascimento;
	private String clienteIe;
	private String clienteContato;
	private String [] clienteSelecaoConsulta;
	
	
	
	
	
	public String[] getClienteSelecaoConsulta() {
		
		return clienteSelecaoConsulta;
	}
	public void setClienteSelecaoConsulta(String[] clienteSelecaoConsulta) {
		this.clienteSelecaoConsulta = clienteSelecaoConsulta;
	}
	/**
	 * @return the clienteBairro
	 * @hibernate.property
	 */
	public String getClienteBairro() {
		return clienteBairro;
	}
	/**
	 * @param clienteBairro the clienteBairro to set
	 */
	public void setClienteBairro(String clienteBairro) {
		this.clienteBairro = clienteBairro;
	}
	/**
	 * @return the clienteCep
	 * @hibernate.property
	 * 
	 */
	public String getClienteCep() {
		return clienteCep;
	}
	/**
	 * @param clienteCep the clienteCep to set
	 */
	public void setClienteCep(String clienteCep) {
		this.clienteCep = clienteCep;
	}
	/**
	 * @return the clienteCidade
	 * @hibernate.property
	 */
	public String getClienteCidade() {
		return clienteCidade;
	}
	/**
	 * @param clienteCidade the clienteCidade to set
	 */
	public void setClienteCidade(String clienteCidade) {
		this.clienteCidade = clienteCidade;
	}
	/**
	 * @return the clienteCodigo
	 * @hibernat.id generator-class="increment"
	 */
	public int getClienteCodigo() {
		return clienteCodigo;
	}
	/**
	 * @param clienteCodigo the clienteCodigo to set
	 */
	public void setClienteCodigo(int clienteCodigo) {
		this.clienteCodigo = clienteCodigo;
	}
	/**
	 * @return the clienteCpfCgc
	 * @hibernate.property not-null="true"
	 */
	public String getClienteCpfCgc() {
		return clienteCpfCgc;
	}
	/**
	 * @param clienteCpfCgc the clienteCpfCgc to set
	 */
	public void setClienteCpfCgc(String clienteCpfCgc) {
		this.clienteCpfCgc = clienteCpfCgc;
	}
	/**
	 * @return the clienteDataDeNascimento
	 * @hibernate.property
	 */
	public String getClienteDataDeNascimento() {
		return clienteDataDeNascimento;
	}
	/**
	 * @param clienteDataDeNascimento the clienteDataDeNascimento to set
	 */
	public void setClienteDataDeNascimento(String clienteDataDeNascimento) {
		this.clienteDataDeNascimento = clienteDataDeNascimento;
	}
	/**
	 * @return the clienteEndereco
	 * @hibernate.property
	 */
	public String getClienteEndereco() {
		return clienteEndereco;
	}
	/**
	 * @param clienteEndereco the clienteEndereco to set
	 */
	public void setClienteEndereco(String clienteEndereco) {
		this.clienteEndereco = clienteEndereco;
	}
	/**
	 * @return the clienteIe
	 * @hibernate.property not-null="true"
	 */
	public String getClienteIe() {
		return clienteIe;
	}
	/**
	 * @param clienteIe the clienteIe to set
	 */
	public void setClienteIe(String clienteIe) {
		this.clienteIe = clienteIe;
	}
	/**
	 * @return the clienteNome
	 * @hibernate.property not-null="true"
	 */
	public String getClienteNome() {
		return clienteNome;
	}
	/**
	 * @param clienteNome the clienteNome to set
	 */
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	/**
	 * @return the clienteObservacoes
	 * @hibernate.property
	 */
	public String getClienteObservacoes() {
		return clienteObservacoes;
	}
	/**
	 * @param clienteObservacoes the clienteObservacoes to set
	 */
	public void setClienteObservacoes(String clienteObservacoes) {
		this.clienteObservacoes = clienteObservacoes;
	}
	/**
	 * @return the clientePessoa
	 * @hibernate.property not-null="true"
	 */
	public int getClientePessoa() {
		return clientePessoa;
	}
	/**
	 * @param clientePessoa the clientePessoa to set
	 */
	public void setClientePessoa(int clientePessoa) {
		this.clientePessoa = clientePessoa;
	}
	/**
	 * @return the clienteTelFax
	 * @hibernate.property not-null="true"
	 */
	public String getClienteTelFax() {
		return clienteTelFax;
	}
	/**
	 * @param clienteTelFax the clienteTelFax to set
	 */
	public void setClienteTelFax(String clienteTelFax) {
		this.clienteTelFax = clienteTelFax;
	}
	/**
	 * @return the clienteTipo
	 * @hibernate.property
	 */
	public int getClienteTipo() {
		return clienteTipo;
	}
	/**
	 * @param clienteTipo the clienteTipo to set
	 */
	public void setClienteTipo(int clienteTipo) {
		this.clienteTipo = clienteTipo;
	}
	/**
	 * @return the clienteUf
	 * @hibernate.property
	 */
	public int getClienteUf() {
		return clienteUf;
	}
	/**
	 * @param clienteUf the clienteUf to set
	 */
	public void setClienteUf(int clienteUf) {
		this.clienteUf = clienteUf;
	}
	public String getClienteContato() {
		return clienteContato;
	}
	public void setClienteContato(String clienteContato) {
		this.clienteContato = clienteContato;
	}
	
	
}
