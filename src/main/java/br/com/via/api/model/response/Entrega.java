
package br.com.via.api.model.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "codigoEntrega", "previsaoEntrega", "dataEntrega", "dataPrevisao", "dataEmissaoNotaFiscal",
		"idNotaFiscal", "serieNotaFiscal", "chaveAcesso", "trackingEntrega", "produtoEntrega", "rastreioEntrega",
		"nomeTransportadora", "linkNotaFiscalPDF", "listNotaFiscalXML", "estorno", "origem", "motivo" })
public class Entrega implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("codigoEntrega")
	private double codigoEntrega;

	@JsonProperty("previsaoEntrega")
	private String previsaoEntrega;

	@JsonProperty("dataEntrega")
	private String dataEntrega;

	@JsonProperty("dataPrevisao")
	private String dataPrevisao;

	@JsonProperty("dataEmissaoNotaFiscal")
	private String dataEmissaoNotaFiscal;

	@JsonProperty("idNotaFiscal")
	private Integer idNotaFiscal;

	@JsonProperty("serieNotaFiscal")
	private String serieNotaFiscal;

	@JsonProperty("chaveAcesso")
	private String chaveAcesso;

	@JsonProperty("trackingEntrega")
	private List<TrackingEntrega> trackingEntrega = null;

	@JsonProperty("produtoEntrega")
	private List<ProdutoEntrega> produtoEntrega = null;

	@JsonProperty("rastreioEntrega")
	private String rastreioEntrega;

	@JsonProperty("nomeTransportadora")
	private String nomeTransportadora;

	@JsonProperty("linkNotaFiscalPDF")
	private String linkNotaFiscalPDF;

	@JsonProperty("listNotaFiscalXML")
	private String listNotaFiscalXML;

	@JsonProperty("estorno")
	private Boolean estorno;

	@JsonProperty("origem")
	private String origem;

	@JsonProperty("motivo")
	private Motivo motivo;

	public double getCodigoEntrega() {
		return codigoEntrega;
	}

	public void setCodigoEntrega(double codigoEntrega) {
		this.codigoEntrega = codigoEntrega;
	}

	public String getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(String previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getDataPrevisao() {
		return dataPrevisao;
	}

	public void setDataPrevisao(String dataPrevisao) {
		this.dataPrevisao = dataPrevisao;
	}

	public String getDataEmissaoNotaFiscal() {
		return dataEmissaoNotaFiscal;
	}

	public void setDataEmissaoNotaFiscal(String dataEmissaoNotaFiscal) {
		this.dataEmissaoNotaFiscal = dataEmissaoNotaFiscal;
	}

	public Integer getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(Integer idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public String getSerieNotaFiscal() {
		return serieNotaFiscal;
	}

	public void setSerieNotaFiscal(String serieNotaFiscal) {
		this.serieNotaFiscal = serieNotaFiscal;
	}

	public String getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(String chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}

	public List<TrackingEntrega> getTrackingEntrega() {
		return trackingEntrega;
	}

	public void setTrackingEntrega(List<TrackingEntrega> trackingEntrega) {
		this.trackingEntrega = trackingEntrega;
	}

	public List<ProdutoEntrega> getProdutoEntrega() {
		return produtoEntrega;
	}

	public void setProdutoEntrega(List<ProdutoEntrega> produtoEntrega) {
		this.produtoEntrega = produtoEntrega;
	}

	public String getRastreioEntrega() {
		return rastreioEntrega;
	}

	public void setRastreioEntrega(String rastreioEntrega) {
		this.rastreioEntrega = rastreioEntrega;
	}

	public String getNomeTransportadora() {
		return nomeTransportadora;
	}

	public void setNomeTransportadora(String nomeTransportadora) {
		this.nomeTransportadora = nomeTransportadora;
	}

	public String getLinkNotaFiscalPDF() {
		return linkNotaFiscalPDF;
	}

	public void setLinkNotaFiscalPDF(String linkNotaFiscalPDF) {
		this.linkNotaFiscalPDF = linkNotaFiscalPDF;
	}

	public String getListNotaFiscalXML() {
		return listNotaFiscalXML;
	}

	public void setListNotaFiscalXML(String listNotaFiscalXML) {
		this.listNotaFiscalXML = listNotaFiscalXML;
	}

	public Boolean getEstorno() {
		return estorno;
	}

	public void setEstorno(Boolean estorno) {
		this.estorno = estorno;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Motivo getMotivo() {
		return motivo;
	}

	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}

}
