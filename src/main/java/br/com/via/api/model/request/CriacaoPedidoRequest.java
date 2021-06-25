package br.com.via.api.model.request;

import java.io.Serializable;
import java.util.List;

public class CriacaoPedidoRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<PedidoProdutoDto> produtos;
	private EnderecoEntregaDto enderecoEntrega;
	private DestinatarioDto destinatario;
	private Integer campanha;
	private String cnpj;
	private Integer pedidoParceiro;
	private String idPedidoMktplc;
	private String senhaAtendimento;
	private String apolice;
	private Integer administrador;
	private String parametrosExtras;
	private Double valorFrete;
	private boolean aguardarConfirmacao;
	boolean optantePeloSimples;
	boolean possuiPagtoComplementar;
	private List<PagamentoComplementarDto> pagtosComplementares;
	private EntregaDadosDto dadosEntrega;
	private EnderecoCobrancaDto enderecoCobranca;
	private Double valorTotalPedido;
	private Double valorTotalComplementar;
	private Double valorTotalComplementarComJuros;

	public List<PedidoProdutoDto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<PedidoProdutoDto> produtos) {
		this.produtos = produtos;
	}

	public EnderecoEntregaDto getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(EnderecoEntregaDto enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public DestinatarioDto getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(DestinatarioDto destinatario) {
		this.destinatario = destinatario;
	}

	public Integer getCampanha() {
		return campanha;
	}

	public void setCampanha(Integer campanha) {
		this.campanha = campanha;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public String getSenhaAtendimento() {
		return senhaAtendimento;
	}

	public void setSenhaAtendimento(String senhaAtendimento) {
		this.senhaAtendimento = senhaAtendimento;
	}

	public String getApolice() {
		return apolice;
	}

	public void setApolice(String apolice) {
		this.apolice = apolice;
	}

	public Integer getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Integer administrador) {
		this.administrador = administrador;
	}

	public String getParametrosExtras() {
		return parametrosExtras;
	}

	public void setParametrosExtras(String parametrosExtras) {
		this.parametrosExtras = parametrosExtras;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public boolean isAguardarConfirmacao() {
		return aguardarConfirmacao;
	}

	public void setAguardarConfirmacao(boolean aguardarConfirmacao) {
		this.aguardarConfirmacao = aguardarConfirmacao;
	}

	public boolean isOptantePeloSimples() {
		return optantePeloSimples;
	}

	public void setOptantePeloSimples(boolean optantePeloSimples) {
		this.optantePeloSimples = optantePeloSimples;
	}

	public boolean isPossuiPagtoComplementar() {
		return possuiPagtoComplementar;
	}

	public void setPossuiPagtoComplementar(boolean possuiPagtoComplementar) {
		this.possuiPagtoComplementar = possuiPagtoComplementar;
	}

	public List<PagamentoComplementarDto> getPagtosComplementares() {
		return pagtosComplementares;
	}

	public void setPagtosComplementares(List<PagamentoComplementarDto> pagtosComplementares) {
		this.pagtosComplementares = pagtosComplementares;
	}

	public EntregaDadosDto getDadosEntrega() {
		return dadosEntrega;
	}

	public void setDadosEntrega(EntregaDadosDto dadosEntrega) {
		this.dadosEntrega = dadosEntrega;
	}

	public EnderecoCobrancaDto getEnderecoCobranca() {
		return enderecoCobranca;
	}

	public void setEnderecoCobranca(EnderecoCobrancaDto enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
	}

	public Double getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setValorTotalPedido(Double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

	public Double getValorTotalComplementar() {
		return valorTotalComplementar;
	}

	public void setValorTotalComplementar(Double valorTotalComplementar) {
		this.valorTotalComplementar = valorTotalComplementar;
	}

	public Double getValorTotalComplementarComJuros() {
		return valorTotalComplementarComJuros;
	}

	public void setValorTotalComplementarComJuros(Double valorTotalComplementarComJuros) {
		this.valorTotalComplementarComJuros = valorTotalComplementarComJuros;
	}

}
