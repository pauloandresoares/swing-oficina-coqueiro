package dto;

public class DadosItem {

	private int codigoOS;
	private int codigoPeca;
	private String Quantidade;
	private String valorUnitario;
	private String iss;
	private String icms;
	private String ipi;
	private int numeroItem;
	private Float custoTotal;
	private Float valorTotal;
	private int quantidadeTotal;
	private String tipo;
	private String nome;
	
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the quantidadeTotal
	 */
	public int getQuantidadeTotal() {
		return quantidadeTotal;
	}
	/**
	 * @param quantidadeTotal the quantidadeTotal to set
	 */
	public void setQuantidadeTotal(int quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}
	/**
	 * @return the codigoOS
	 */
	public int getCodigoOS() {
		return codigoOS;
	}
	public void setCodigoOS(int codigoOS) {
		this.codigoOS = codigoOS;
	}
	/**
	 * @return the codigoPeca
	 */
	public int getCodigoPeca() {
		return codigoPeca;
	}
	/**
	 * @param codigoPeca the codigoPeca to set
	 */
	public void setCodigoPeca(int codigoPeca) {
		this.codigoPeca = codigoPeca;
	}
	/**
	 * @return the custoTotal
	 */
	public Float getCustoTotal() {
		return custoTotal;
	}
	/**
	 * @param custoTotal the custoTotal to set
	 */
	public void setCustoTotal(Float custoTotal) {
		this.custoTotal = custoTotal;
	}
	/**
	 * @return the icms
	 */
	public String getIcms() {
		return icms;
	}
	/**
	 * @param icms the icms to set
	 */
	public void setIcms(String icms) {
		this.icms = icms;
	}
	/**
	 * @return the ipi
	 */
	public String getIpi() {
		return ipi;
	}
	/**
	 * @param ipi the ipi to set
	 */
	public void setIpi(String ipi) {
		this.ipi = ipi;
	}
	/**
	 * @return the iss
	 */
	public String getIss() {
		return iss;
	}
	/**
	 * @param iss the iss to set
	 */
	public void setIss(String iss) {
		this.iss = iss;
	}
	/**
	 * @return the numeroItem
	 */
	public int getNumeroItem() {
		return numeroItem;
	}
	/**
	 * @param numeroItem the numeroItem to set
	 */
	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}
	/**
	 * @return the quantidade
	 */
	public String getQuantidade() {
		return Quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(String quantidade) {
		Quantidade = quantidade;
	}
	/**
	 * @return the valorTotal
	 */
	public Float getValorTotal() {
		return valorTotal;
	}
	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	/**
	 * @return the valorUnitario
	 */
	public String getValorUnitario() {
		return valorUnitario;
	}
	/**
	 * @param valorUnitario the valorUnitario to set
	 */
	public void setValorUnitario(String valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
