package dto;

import java.sql.Date;

public class DadosPecas {
	private int pecaCodigo;
	
	private String pecaNome;
	private String pecaModelo;
	private String pecaDiscricao;
	private String pecaClFiscal;
	private String pecaSitTributario;
	private String pecaAliqIpi;
	private String pecaAliqIcms;
	private Date pecaDataEstoque;
	private int pecaEstoque;
	private String pecaMarca;
	private String pecaLocal;
	private Float pecaPrecoAquisicao;
	private Float pecaPorcentagemIcmsCompra;
	private Float pecaIcmsCompra;
	private Float pecaPorcentagemIpiCompra;
	private Float pecaIpiCompra;
	private Float pecaFretePorcentagemCompra;
	private Float pecaFreteCompra;
	private Float pecaSeguroPorcentagemCompra;
	private Float pecaSeguroCompra;
	private Float pecaPrecoCusto;
	private Float pecaPorcentagemIcmsVenda;
	private Float pecaIcmsVenda;
	private Float pecaPorcentagemIpiVenda;
	private Float pecaIpiVenda;
	private Float pecaFretePorcentagemVenda;
	private Float pecaFreteVenda;
	private Float pecaSeguroPorcentagemVenda;
	private Float pecaSeguroVenda;
	private Float pecaPrecoVenda;
	private int pecaTotalEstoque;
	private int pecaQuantidade;
	
	/**
	 * @return the pecaQuantidade
	 */
	public int getPecaQuantidade() {
		return pecaQuantidade;
	}
	/**
	 * @param pecaQuantidade the pecaQuantidade to set
	 */
	public void setPecaQuantidade(int pecaQuantidade) {
		this.pecaQuantidade = pecaQuantidade;
	}
	/**
	 * @return the pecaTotalEstoque
	 */
	public int getPecaTotalEstoque() {
		return pecaTotalEstoque;
	}
	/**
	 * @param pecaTotalEstoque the pecaTotalEstoque to set
	 */
	public void setPecaTotalEstoque(int pecaTotalEstoque) {
		this.pecaTotalEstoque = pecaTotalEstoque;
	}
	/**
	 * @return the pecaAliqIcms
	 */
	public String getPecaAliqIcms() {
		return pecaAliqIcms;
	}
	/**
	 * @param pecaAliqIcms the pecaAliqIcms to set
	 */
	public void setPecaAliqIcms(String pecaAliqIcms) {
		this.pecaAliqIcms = pecaAliqIcms;
	}
	/**
	 * @return the pecaAliqIpi
	 */
	public String getPecaAliqIpi() {
		return pecaAliqIpi;
	}
	/**
	 * @param pecaAliqIpi the pecaAliqIpi to set
	 */
	public void setPecaAliqIpi(String pecaAliqIpi) {
		this.pecaAliqIpi = pecaAliqIpi;
	}
	/**
	 * @return the pecaClFiscal
	 */
	public String getPecaClFiscal() {
		return pecaClFiscal;
	}
	/**
	 * @param pecaClFiscal the pecaClFiscal to set
	 */
	public void setPecaClFiscal(String pecaClFiscal) {
		this.pecaClFiscal = pecaClFiscal;
	}
	/**
	 * @return the pecaCodigo
	 */
	public int getPecaCodigo() {
		return pecaCodigo;
	}
	/**
	 * @param pecaCodigo the pecaCodigo to set
	 */
	public void setPecaCodigo(int pecaCodigo) {
		this.pecaCodigo = pecaCodigo;
	}
	/**
	 * @return the pecaDataEstoque
	 */
	public Date getPecaDataEstoque() {
		return pecaDataEstoque;
	}
	/**
	 * @param pecaDataEstoque the pecaDataEstoque to set
	 */
	public void setPecaDataEstoque(Date pecaDataEstoque) {
		this.pecaDataEstoque = pecaDataEstoque;
	}
	/**
	 * @return the pecaDiscricao
	 */
	public String getPecaDiscricao() {
		return pecaDiscricao;
	}
	/**
	 * @param pecaDiscricao the pecaDiscricao to set
	 */
	public void setPecaDiscricao(String pecaDiscricao) {
		this.pecaDiscricao = pecaDiscricao;
	}
	
	/**
	 * @return the pecaFreteCompra
	 */
	public Float getPecaFreteCompra() {
		return pecaFreteCompra;
	}
	/**
	 * @param pecaFreteCompra the pecaFreteCompra to set
	 */
	public void setPecaFreteCompra(Float pecaFreteCompra) {
		this.pecaFreteCompra = pecaFreteCompra;
	}
	/**
	 * @return the pecaFretePorcentagemCompra
	 */
	public Float getPecaFretePorcentagemCompra() {
		return pecaFretePorcentagemCompra;
	}
	/**
	 * @param pecaFretePorcentagemCompra the pecaFretePorcentagemCompra to set
	 */
	public void setPecaFretePorcentagemCompra(Float pecaFretePorcentagemCompra) {
		this.pecaFretePorcentagemCompra = pecaFretePorcentagemCompra;
	}
	/**
	 * @return the pecaFretePorcentagemVenda
	 */
	public Float getPecaFretePorcentagemVenda() {
		return pecaFretePorcentagemVenda;
	}
	/**
	 * @param pecaFretePorcentagemVenda the pecaFretePorcentagemVenda to set
	 */
	public void setPecaFretePorcentagemVenda(Float pecaFretePorcentagemVenda) {
		this.pecaFretePorcentagemVenda = pecaFretePorcentagemVenda;
	}
	/**
	 * @return the pecaFreteVenda
	 */
	public Float getPecaFreteVenda() {
		return pecaFreteVenda;
	}
	/**
	 * @param pecaFreteVenda the pecaFreteVenda to set
	 */
	public void setPecaFreteVenda(Float pecaFreteVenda) {
		this.pecaFreteVenda = pecaFreteVenda;
	}
	/**
	 * @return the pecaIcmsCompra
	 */
	public Float getPecaIcmsCompra() {
		return pecaIcmsCompra;
	}
	/**
	 * @param pecaIcmsCompra the pecaIcmsCompra to set
	 */
	public void setPecaIcmsCompra(Float pecaIcmsCompra) {
		this.pecaIcmsCompra = pecaIcmsCompra;
	}
	/**
	 * @return the pecaIcmsVenda
	 */
	public Float getPecaIcmsVenda() {
		return pecaIcmsVenda;
	}
	/**
	 * @param pecaIcmsVenda the pecaIcmsVenda to set
	 */
	public void setPecaIcmsVenda(Float pecaIcmsVenda) {
		this.pecaIcmsVenda = pecaIcmsVenda;
	}
	/**
	 * @return the pecaIpiCompra
	 */
	public Float getPecaIpiCompra() {
		return pecaIpiCompra;
	}
	/**
	 * @param pecaIpiCompra the pecaIpiCompra to set
	 */
	public void setPecaIpiCompra(Float pecaIpiCompra) {
		this.pecaIpiCompra = pecaIpiCompra;
	}
	/**
	 * @return the pecaIpiVenda
	 */
	public Float getPecaIpiVenda() {
		return pecaIpiVenda;
	}
	/**
	 * @param pecaIpiVenda the pecaIpiVenda to set
	 */
	public void setPecaIpiVenda(Float pecaIpiVenda) {
		this.pecaIpiVenda = pecaIpiVenda;
	}
	/**
	 * @return the pecaLocal
	 */
	public String getPecaLocal() {
		return pecaLocal;
	}
	/**
	 * @param pecaLocal the pecaLocal to set
	 */
	public void setPecaLocal(String pecaLocal) {
		this.pecaLocal = pecaLocal;
	}
	/**
	 * @return the pecaMarca
	 */
	public String getPecaMarca() {
		return pecaMarca;
	}
	/**
	 * @param pecaMarca the pecaMarca to set
	 */
	public void setPecaMarca(String pecaMarca) {
		this.pecaMarca = pecaMarca;
	}
	/**
	 * @return the pecaModelo
	 */
	public String getPecaModelo() {
		return pecaModelo;
	}
	/**
	 * @param pecaModelo the pecaModelo to set
	 */
	public void setPecaModelo(String pecaModelo) {
		this.pecaModelo = pecaModelo;
	}
	/**
	 * @return the pecaNome
	 */
	public String getPecaNome() {
		return pecaNome;
	}
	/**
	 * @param pecaNome the pecaNome to set
	 */
	public void setPecaNome(String pecaNome) {
		this.pecaNome = pecaNome;
	}
	/**
	 * @return the pecaPorcentagemIcmsCompra
	 */
	public Float getPecaPorcentagemIcmsCompra() {
		return pecaPorcentagemIcmsCompra;
	}
	/**
	 * @param pecaPorcentagemIcmsCompra the pecaPorcentagemIcmsCompra to set
	 */
	public void setPecaPorcentagemIcmsCompra(Float pecaPorcentagemIcmsCompra) {
		this.pecaPorcentagemIcmsCompra = pecaPorcentagemIcmsCompra;
	}
	/**
	 * @return the pecaPorcentagemIcmsVenda
	 */
	public Float getPecaPorcentagemIcmsVenda() {
		return pecaPorcentagemIcmsVenda;
	}
	/**
	 * @param pecaPorcentagemIcmsVenda the pecaPorcentagemIcmsVenda to set
	 */
	public void setPecaPorcentagemIcmsVenda(Float pecaPorcentagemIcmsVenda) {
		this.pecaPorcentagemIcmsVenda = pecaPorcentagemIcmsVenda;
	}
	/**
	 * @return the pecaPorcentagemIpiCompra
	 */
	public Float getPecaPorcentagemIpiCompra() {
		return pecaPorcentagemIpiCompra;
	}
	/**
	 * @param pecaPorcentagemIpiCompra the pecaPorcentagemIpiCompra to set
	 */
	public void setPecaPorcentagemIpiCompra(Float pecaPorcentagemIpiCompra) {
		this.pecaPorcentagemIpiCompra = pecaPorcentagemIpiCompra;
	}
	/**
	 * @return the pecaPorcentagemIpiVenda
	 */
	public Float getPecaPorcentagemIpiVenda() {
		return pecaPorcentagemIpiVenda;
	}
	/**
	 * @param pecaPorcentagemIpiVenda the pecaPorcentagemIpiVenda to set
	 */
	public void setPecaPorcentagemIpiVenda(Float pecaPorcentagemIpiVenda) {
		this.pecaPorcentagemIpiVenda = pecaPorcentagemIpiVenda;
	}
	/**
	 * @return the pecaPrecoAquisicao
	 */
	public Float getPecaPrecoAquisicao() {
		return pecaPrecoAquisicao;
	}
	/**
	 * @param pecaPrecoAquisicao the pecaPrecoAquisicao to set
	 */
	public void setPecaPrecoAquisicao(Float pecaPrecoAquisicao) {
		this.pecaPrecoAquisicao = pecaPrecoAquisicao;
	}
	/**
	 * @return the pecaPrecoCusto
	 */
	public Float getPecaPrecoCusto() {
		return pecaPrecoCusto;
	}
	/**
	 * @param pecaPrecoCusto the pecaPrecoCusto to set
	 */
	public void setPecaPrecoCusto(Float pecaPrecoCusto) {
		this.pecaPrecoCusto = pecaPrecoCusto;
	}
	
	
	/**
	 * @return the pecaPrecoVenda
	 */
	public Float getPecaPrecoVenda() {
		return pecaPrecoVenda;
	}
	/**
	 * @param pecaPrecoVenda the pecaPrecoVenda to set
	 */
	public void setPecaPrecoVenda(Float pecaPrecoVenda) {
		this.pecaPrecoVenda = pecaPrecoVenda;
	}
	/**
	 * @return the pecaSeguroCompra
	 */
	public Float getPecaSeguroCompra() {
		return pecaSeguroCompra;
	}
	/**
	 * @param pecaSeguroCompra the pecaSeguroCompra to set
	 */
	public void setPecaSeguroCompra(Float pecaSeguroCompra) {
		this.pecaSeguroCompra = pecaSeguroCompra;
	}
	/**
	 * @return the pecaSeguroPorcentagemCompra
	 */
	public Float getPecaSeguroPorcentagemCompra() {
		return pecaSeguroPorcentagemCompra;
	}
	/**
	 * @param pecaSeguroPorcentagemCompra the pecaSeguroPorcentagemCompra to set
	 */
	public void setPecaSeguroPorcentagemCompra(Float pecaSeguroPorcentagemCompra) {
		this.pecaSeguroPorcentagemCompra = pecaSeguroPorcentagemCompra;
	}
	/**
	 * @return the pecaSeguroPorcentagemVenda
	 */
	public Float getPecaSeguroPorcentagemVenda() {
		return pecaSeguroPorcentagemVenda;
	}
	/**
	 * @param pecaSeguroPorcentagemVenda the pecaSeguroPorcentagemVenda to set
	 */
	public void setPecaSeguroPorcentagemVenda(Float pecaSeguroPorcentagemVenda) {
		this.pecaSeguroPorcentagemVenda = pecaSeguroPorcentagemVenda;
	}
	/**
	 * @return the pecaSeguroVenda
	 */
	public Float getPecaSeguroVenda() {
		return pecaSeguroVenda;
	}
	/**
	 * @param pecaSeguroVenda the pecaSeguroVenda to set
	 */
	public void setPecaSeguroVenda(Float pecaSeguroVenda) {
		this.pecaSeguroVenda = pecaSeguroVenda;
	}
	/**
	 * @return the pecaSitTributario
	 */
	public String getPecaSitTributario() {
		return pecaSitTributario;
	}
	/**
	 * @param pecaSitTributario the pecaSitTributario to set
	 */
	public void setPecaSitTributario(String pecaSitTributario) {
		this.pecaSitTributario = pecaSitTributario;
	}
	/**
	 * @return the pecaEstoque
	 */
	public int getPecaEstoque() {
		return pecaEstoque;
	}
	/**
	 * @param pecaEstoque the pecaEstoque to set
	 */
	public void setPecaEstoque(int pecaEstoque) {
		this.pecaEstoque = pecaEstoque;
	}
	
	
	
	
	
	
}
