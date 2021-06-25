package br.com.via.api.model.request;

import java.io.Serializable;

public class PagamentoComplementarDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idFormaPagamento;
	private CartaoCreditoDadosDto dadosCartaoCredito;
	private CartaoCreditoDadosValidacaoDto dadosCartaoCreditoValidacao;
	private Double valorComplementarComJuros;
	private Double valorComplementar;

	public Integer getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(Integer idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public CartaoCreditoDadosDto getDadosCartaoCredito() {
		return dadosCartaoCredito;
	}

	public void setDadosCartaoCredito(CartaoCreditoDadosDto dadosCartaoCredito) {
		this.dadosCartaoCredito = dadosCartaoCredito;
	}

	public CartaoCreditoDadosValidacaoDto getDadosCartaoCreditoValidacao() {
		return dadosCartaoCreditoValidacao;
	}

	public void setDadosCartaoCreditoValidacao(CartaoCreditoDadosValidacaoDto dadosCartaoCreditoValidacao) {
		this.dadosCartaoCreditoValidacao = dadosCartaoCreditoValidacao;
	}

	public Double getValorComplementarComJuros() {
		return valorComplementarComJuros;
	}

	public void setValorComplementarComJuros(Double valorComplementarComJuros) {
		this.valorComplementarComJuros = valorComplementarComJuros;
	}

	public Double getValorComplementar() {
		return valorComplementar;
	}

	public void setValorComplementar(Double valorComplementar) {
		this.valorComplementar = valorComplementar;
	}

}
