
package br.com.via.api.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "valorProduto",
    "valorTotalPedido",
    "codigoPedido",
    "pedidoParceiro",
    "idPedidoMktplc",
    "produtos",
    "parametrosExtras",
    "aguardandoConfirmacao",
    "dadosEntrega",
    "dadosPagamentoComplementar"
})
public class CriacaoPedido {

    @JsonProperty("valorProduto")
		private double valorProduto;

    @JsonProperty("valorTotalPedido")
		private double valorTotalPedido;

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

    public Integer getCodigoPedido() {
        return codigoPedido;
    }

    @JsonProperty("codigoPedido")
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

}
