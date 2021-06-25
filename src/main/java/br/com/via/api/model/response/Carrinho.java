package br.com.via.api.model.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Carrinho implements Serializable {

	private static final long serialVersionUID = 1L;
	private Double valorFrete;
	private Double valorImpostos;
	private Double valorTotaldosProdutos;
	private Double valorTotaldoPedido;

	private List<ProdutoCarrinho> produtos;

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Double getValorImpostos() {
		return valorImpostos;
	}

	public void setValorImpostos(Double valorImpostos) {
		this.valorImpostos = valorImpostos;
	}

	public Double getValorTotaldosProdutos() {
		return valorTotaldosProdutos;
	}

	public void setValorTotaldosProdutos(Double valorTotaldosProdutos) {
		this.valorTotaldosProdutos = valorTotaldosProdutos;
	}

	public Double getValorTotaldoPedido() {
		return valorTotaldoPedido;
	}

	public void setValorTotaldoPedido(Double valorTotaldoPedido) {
		this.valorTotaldoPedido = valorTotaldoPedido;
	}

	public List<ProdutoCarrinho> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoCarrinho> produtos) {
		this.produtos = produtos;
	}

}
