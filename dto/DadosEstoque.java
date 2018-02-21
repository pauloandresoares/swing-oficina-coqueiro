package dto;

import java.sql.Date;

public class DadosEstoque {

	private String estoquePeca;
	private String estoqueModelo;
	private String estoqueMarca;
	private String estoqueDescricao;
	private Date estoqueDataEntrada;
	private int estoqueCodigoDaAquisicao;
	private Float estoquePreco;
	private int estoqueMinima;
	private int estoqueMaxima;
	private int estoqueQuantidade;
	/**
	 * @return the estoqueMaxima
	 */
	public int getEstoqueMaxima() {
		return estoqueMaxima;
	}
	/**
	 * @param estoqueMaxima the estoqueMaxima to set
	 */
	public void setEstoqueMaxima(int estoqueMaxima) {
		this.estoqueMaxima = estoqueMaxima;
	}
	/**
	 * @return the estoqueMinima
	 */
	public int getEstoqueMinima() {
		return estoqueMinima;
	}
	/**
	 * @param estoqueMinima the estoqueMinima to set
	 */
	public void setEstoqueMinima(int estoqueMinima) {
		this.estoqueMinima = estoqueMinima;
	}
	/**
	 * @return the estoqueCodigoDaAquisicao
	 */
	public int getEstoqueCodigoDaAquisicao() {
		return estoqueCodigoDaAquisicao;
	}
	/**
	 * @param estoqueCodigoDaAquisicao the estoqueCodigoDaAquisicao to set
	 */
	public void setEstoqueCodigoDaAquisicao(int estoqueCodigoDaAquisicao) {
		this.estoqueCodigoDaAquisicao = estoqueCodigoDaAquisicao;
	}
	/**
	 * @return the estoqueDataEntrada
	 */
	public Date getEstoqueDataEntrada() {
		return estoqueDataEntrada;
	}
	/**
	 * @param estoqueDataEntrada the estoqueDataEntrada to set
	 */
	public void setEstoqueDataEntrada(Date estoqueDataEntrada) {
		this.estoqueDataEntrada = estoqueDataEntrada;
	}
	/**
	 * @return the estoqueDescricao
	 */
	public String getEstoqueDescricao() {
		return estoqueDescricao;
	}
	/**
	 * @param estoqueDescricao the estoqueDescricao to set
	 */
	public void setEstoqueDescricao(String estoqueDescricao) {
		this.estoqueDescricao = estoqueDescricao;
	}
	/**
	 * @return the estoqueMarca
	 */
	public String getEstoqueMarca() {
		return estoqueMarca;
	}
	/**
	 * @param estoqueMarca the estoqueMarca to set
	 */
	public void setEstoqueMarca(String estoqueMarca) {
		this.estoqueMarca = estoqueMarca;
	}
	/**
	 * @return the estoqueModelo
	 */
	public String getEstoqueModelo() {
		return estoqueModelo;
	}
	/**
	 * @param estoqueModelo the estoqueModelo to set
	 */
	public void setEstoqueModelo(String estoqueModelo) {
		this.estoqueModelo = estoqueModelo;
	}
	/**
	 * @return the estoquePeca
	 */
	public String getEstoquePeca() {
		return estoquePeca;
	}
	/**
	 * @param estoquePeca the estoquePeca to set
	 */
	public void setEstoquePeca(String estoquePeca) {
		this.estoquePeca = estoquePeca;
	}
	/**
	 * @return the estoquePreco
	 */
	public Float getEstoquePreco() {
		return estoquePreco;
	}
	/**
	 * @param estoquePreco the estoquePreco to set
	 */
	public void setEstoquePreco(Float estoquePreco) {
		this.estoquePreco = estoquePreco;
	}
	/**
	 * @return the estoqueQuantidade
	 */
	public int getEstoqueQuantidade() {
		return estoqueQuantidade;
	}
	/**
	 * @param estoqueQuantidade the estoqueQuantidade to set
	 */
	public void setEstoqueQuantidade(int estoqueQuantidade) {
		this.estoqueQuantidade = estoqueQuantidade;
	}

}