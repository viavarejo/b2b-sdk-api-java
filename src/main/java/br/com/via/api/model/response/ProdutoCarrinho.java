package br.com.via.api.model.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProdutoCarrinho implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idSku;
	private String previsaoEntrega;
	private Double valorUnitario;
	private Double valorTotal;
	private Double valorTotalFrete;
	private Double valorTotalImpostos;
	private boolean erro;
	private String mensagemDeErro;
	private String codigoDoErro;

	public Integer getIdSku() {
		return idSku;
	}

	public void setIdSku(Integer idSku) {
		this.idSku = idSku;
	}

	public String getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(String previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorTotalFrete() {
		return valorTotalFrete;
	}

	public void setValorTotalFrete(Double valorTotalFrete) {
		this.valorTotalFrete = valorTotalFrete;
	}

	public Double getValorTotalImpostos() {
		return valorTotalImpostos;
	}

	public void setValorTotalImpostos(Double valorTotalImpostos) {
		this.valorTotalImpostos = valorTotalImpostos;
	}

	public boolean isErro() {
		return erro;
	}

	public void setErro(boolean erro) {
		this.erro = erro;
	}

	public String getMensagemDeErro() {
		return mensagemDeErro;
	}

	public void setMensagemDeErro(String mensagemDeErro) {
		this.mensagemDeErro = mensagemDeErro;
	}

	public String getCodigoDoErro() {
		return codigoDoErro;
	}

	public void setCodigoDoErro(String codigoDoErro) {
		this.codigoDoErro = codigoDoErro;
	}
}
