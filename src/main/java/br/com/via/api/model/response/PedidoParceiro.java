package br.com.via.api.model.response;

import java.io.Serializable;

public class PedidoParceiro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codigoPedido;
	private String dataHora;
	private int idPedidoMktplc;
	private long pedidoParceiro;
	private String urlBoleto;
	private double valorAdicional;
	private double valorFrete;
	private double valorProduto;
	private double valorTotalPedido;

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public int getIdPedidoMktplc() {
		return idPedidoMktplc;
	}

	public void setIdPedidoMktplc(int idPedidoMktplc) {
		this.idPedidoMktplc = idPedidoMktplc;
	}

	public long getPedidoParceiro() {
		return pedidoParceiro;
	}

	public void setPedidoParceiro(long pedidoParceiro) {
		this.pedidoParceiro = pedidoParceiro;
	}

	public String getUrlBoleto() {
		return urlBoleto;
	}

	public void setUrlBoleto(String urlBoleto) {
		this.urlBoleto = urlBoleto;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public double getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setValorTotalPedido(double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

}
