package dto;

import java.sql.Date;

public class DadosOrdemDeServico {

	private int Codigo;
	private int Orcamento;
	private String Cotacao;
	private String TipoDeOS;
	private String prisma;
	private String numeroDeSerie;
	private String placa;
	private String chassis;
	private String convenio;
	private String cliente;
	private String Veiculo;
	private String km;
	private String tecnico;
	private String Queixas;
	
	//orçamento vem ate aqui !!!
	
	private Date abertura;
	private Date fechamento;
	private String iss;
	private String icms;
	private String ipi;
	private String custoMaoDeObra;
	private String custoPecas;
	private String horas;
	private Float custoTotal;
	private String valorMaoDeObra;
	private String valorPecas;
	private String materialDeConsulmo;
	private String desconto;
	private Float valorTotal;
	private String numeroDeParcelas;
	private String primeira;
	private String valorDasParcelas;
	private String formaDePagamento;
	private String ressalvas;
	/**
	 * @return the abertura
	 */
	public Date getAbertura() {
		return abertura;
	}
	/**
	 * @param abertura the abertura to set
	 */
	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}
	/**
	 * @return the chassis
	 */
	public String getChassis() {
		return chassis;
	}
	/**
	 * @param chassis the chassis to set
	 */
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return Codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	/**
	 * @return the convenio
	 */
	public String getConvenio() {
		return convenio;
	}
	/**
	 * @param convenio the convenio to set
	 */
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	/**
	 * @return the cotacao
	 */
	public String getCotacao() {
		return Cotacao;
	}
	/**
	 * @param cotacao the cotacao to set
	 */
	public void setCotacao(String cotacao) {
		Cotacao = cotacao;
	}
	/**
	 * @return the custoMaoDeObra
	 */
	public String getCustoMaoDeObra() {
		return custoMaoDeObra;
	}
	/**
	 * @param custoMaoDeObra the custoMaoDeObra to set
	 */
	public void setCustoMaoDeObra(String custoMaoDeObra) {
		this.custoMaoDeObra = custoMaoDeObra;
	}
	/**
	 * @return the custoPecas
	 */
	public String getCustoPecas() {
		return custoPecas;
	}
	/**
	 * @param custoPecas the custoPecas to set
	 */
	public void setCustoPecas(String custoPecas) {
		this.custoPecas = custoPecas;
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
	 * @return the desconto
	 */
	public String getDesconto() {
		return desconto;
	}
	/**
	 * @param desconto the desconto to set
	 */
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	/**
	 * @return the fechamento
	 */
	public Date getFechamento() {
		return fechamento;
	}
	/**
	 * @param fechamento the fechamento to set
	 */
	public void setFechamento(Date fechamento) {
		this.fechamento = fechamento;
	}
	/**
	 * @return the formaDePagamento
	 */
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	/**
	 * @param formaDePagamento the formaDePagamento to set
	 */
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	/**
	 * @return the horas
	 */
	public String getHoras() {
		return horas;
	}
	/**
	 * @param horas the horas to set
	 */
	public void setHoras(String horas) {
		this.horas = horas;
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
	 * @return the km
	 */
	public String getKm() {
		return km;
	}
	/**
	 * @param km the km to set
	 */
	public void setKm(String km) {
		this.km = km;
	}
	/**
	 * @return the materialDeConsulmo
	 */
	public String getMaterialDeConsulmo() {
		return materialDeConsulmo;
	}
	/**
	 * @param materialDeConsulmo the materialDeConsulmo to set
	 */
	public void setMaterialDeConsulmo(String materialDeConsulmo) {
		this.materialDeConsulmo = materialDeConsulmo;
	}
	/**
	 * @return the numeroDeParcelas
	 */
	public String getNumeroDeParcelas() {
		return numeroDeParcelas;
	}
	/**
	 * @param numeroDeParcelas the numeroDeParcelas to set
	 */
	public void setNumeroDeParcelas(String numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	/**
	 * @return the numeroDeSerie
	 */
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	/**
	 * @param numeroDeSerie the numeroDeSerie to set
	 */
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	/**
	 * @return the orcamento
	 */
	public int getOrcamento() {
		return Orcamento;
	}
	/**
	 * @param orcamento the orcamento to set
	 */
	public void setOrcamento(int orcamento) {
		Orcamento = orcamento;
	}
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the primeira
	 */
	public String getPrimeira() {
		return primeira;
	}
	/**
	 * @param primeira the primeira to set
	 */
	public void setPrimeira(String primeira) {
		this.primeira = primeira;
	}
	/**
	 * @return the prisma
	 */
	public String getPrisma() {
		return prisma;
	}
	/**
	 * @param prisma the prisma to set
	 */
	public void setPrisma(String prisma) {
		this.prisma = prisma;
	}
	/**
	 * @return the queixas
	 */
	public String getQueixas() {
		return Queixas;
	}
	/**
	 * @param queixas the queixas to set
	 */
	public void setQueixas(String queixas) {
		Queixas = queixas;
	}
	/**
	 * @return the ressalvas
	 */
	public String getRessalvas() {
		return ressalvas;
	}
	/**
	 * @param ressalvas the ressalvas to set
	 */
	public void setRessalvas(String ressalvas) {
		this.ressalvas = ressalvas;
	}
	/**
	 * @return the tecnico
	 */
	public String getTecnico() {
		return tecnico;
	}
	/**
	 * @param tecnico the tecnico to set
	 */
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	/**
	 * @return the tipoDeOS
	 */
	public String getTipoDeOS() {
		return TipoDeOS;
	}
	/**
	 * @param tipoDeOS the tipoDeOS to set
	 */
	public void setTipoDeOS(String tipoDeOS) {
		TipoDeOS = tipoDeOS;
	}
	/**
	 * @return the valorDasParcelas
	 */
	public String getValorDasParcelas() {
		return valorDasParcelas;
	}
	/**
	 * @param valorDasParcelas the valorDasParcelas to set
	 */
	public void setValorDasParcelas(String valorDasParcelas) {
		this.valorDasParcelas = valorDasParcelas;
	}
	/**
	 * @return the valorMaoDeObra
	 */
	public String getValorMaoDeObra() {
		return valorMaoDeObra;
	}
	/**
	 * @param valorMaoDeObra the valorMaoDeObra to set
	 */
	public void setValorMaoDeObra(String valorMaoDeObra) {
		this.valorMaoDeObra = valorMaoDeObra;
	}
	/**
	 * @return the valorPecas
	 */
	public String getValorPecas() {
		return valorPecas;
	}
	/**
	 * @param valorPecas the valorPecas to set
	 */
	public void setValorPecas(String valorPecas) {
		this.valorPecas = valorPecas;
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
	 * @return the veiculo
	 */
	public String getVeiculo() {
		return Veiculo;
	}
	/**
	 * @param veiculo the veiculo to set
	 */
	public void setVeiculo(String veiculo) {
		Veiculo = veiculo;
	}
	
}
