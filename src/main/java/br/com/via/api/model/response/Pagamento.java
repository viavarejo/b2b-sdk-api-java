
package br.com.via.api.model.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "codigoDoErro", "valorComplementar", "quantidadeParcelas", "valorParcela", "idFormaPagamento",
		"erro", "mensagemDeErro", "url" })
public class Pagamento {

	@JsonProperty("codigoDoErro")
	private String codigoDoErro;
	@JsonProperty("valorComplementar")
	private Integer valorComplementar;
	@JsonProperty("quantidadeParcelas")
	private Integer quantidadeParcelas;
	@JsonProperty("valorParcela")
	private Integer valorParcela;
	@JsonProperty("idFormaPagamento")
	private Integer idFormaPagamento;
	@JsonProperty("erro")
	private Boolean erro;
	@JsonProperty("mensagemDeErro")
	private String mensagemDeErro;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getCodigoDoErro() {
		return codigoDoErro;
	}

	public void setCodigoDoErro(String codigoDoErro) {
		this.codigoDoErro = codigoDoErro;
	}

	public Integer getValorComplementar() {
		return valorComplementar;
	}

	public void setValorComplementar(Integer valorComplementar) {
		this.valorComplementar = valorComplementar;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public Integer getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Integer valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Integer getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(Integer idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public Boolean getErro() {
		return erro;
	}

	public void setErro(Boolean erro) {
		this.erro = erro;
	}

	public String getMensagemDeErro() {
		return mensagemDeErro;
	}

	public void setMensagemDeErro(String mensagemDeErro) {
		this.mensagemDeErro = mensagemDeErro;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
