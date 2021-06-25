
package br.com.via.api.model.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pedido implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@JsonProperty("valorProduto")
	private Double valorProduto;

	@JsonProperty("valorTotalPedido")
	private Double valorTotalPedido;

	@JsonProperty("codigoPedido")
	private Integer codigoPedido;

	@JsonProperty("pedidoParceiro")
	private Integer pedidoParceiro;

	@JsonProperty("idPedidoMktplc")
	private String idPedidoMktplc;

	@JsonProperty("produtos")
	private List<Produto> produtos = null;

	@JsonProperty("parametrosExtras")
	private String parametrosExtras;

	@JsonProperty("aguardandoConfirmacao")
	private Boolean aguardandoConfirmacao;

	@JsonProperty("dadosEntrega")
	private DadosEntrega dadosEntrega;

	@JsonProperty("dadosPagamentoComplementar")
	private DadosPagamentoComplementar dadosPagamentoComplementar;

	private String dataHora;
	private String urlBoleto;
	private Double valorAdicional;
	private Double valorFrete;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Double getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setValorTotalPedido(Double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

	public Integer getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Integer getPedidoParceiro() {
		return pedidoParceiro;
	}

	public void setPedidoParceiro(Integer pedidoParceiro) {
		this.pedidoParceiro = pedidoParceiro;
	}

	public String getIdPedidoMktplc() {
		return idPedidoMktplc;
	}

	public void setIdPedidoMktplc(String idPedidoMktplc) {
		this.idPedidoMktplc = idPedidoMktplc;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getParametrosExtras() {
		return parametrosExtras;
	}

	public void setParametrosExtras(String parametrosExtras) {
		this.parametrosExtras = parametrosExtras;
	}

	public Boolean getAguardandoConfirmacao() {
		return aguardandoConfirmacao;
	}

	public void setAguardandoConfirmacao(Boolean aguardandoConfirmacao) {
		this.aguardandoConfirmacao = aguardandoConfirmacao;
	}

	public DadosEntrega getDadosEntrega() {
		return dadosEntrega;
	}

	public void setDadosEntrega(DadosEntrega dadosEntrega) {
		this.dadosEntrega = dadosEntrega;
	}

	public DadosPagamentoComplementar getDadosPagamentoComplementar() {
		return dadosPagamentoComplementar;
	}

	public void setDadosPagamentoComplementar(DadosPagamentoComplementar dadosPagamentoComplementar) {
		this.dadosPagamentoComplementar = dadosPagamentoComplementar;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getUrlBoleto() {
		return urlBoleto;
	}

	public void setUrlBoleto(String urlBoleto) {
		this.urlBoleto = urlBoleto;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}
	
	


}
