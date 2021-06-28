
package br.com.via.api.model.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "previsaoDeEntrega", "valorFrete", "idEntregaTipo", "idEnderecoLojaFisica", "idUnidadeNegocio" })
public class DadosEntrega implements Serializable {

	private static final long serialVersionUID = 1L;
	@JsonProperty("previsaoDeEntrega")
	private String previsaoDeEntrega;
	@JsonProperty("valorFrete")
	private Double valorFrete;
	@JsonProperty("idEntregaTipo")
	private Integer idEntregaTipo;
	@JsonProperty("idEnderecoLojaFisica")
	private Integer idEnderecoLojaFisica;
	@JsonProperty("idUnidadeNegocio")
	private Integer idUnidadeNegocio;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getPrevisaoDeEntrega() {
		return previsaoDeEntrega;
	}

	public void setPrevisaoDeEntrega(String previsaoDeEntrega) {
		this.previsaoDeEntrega = previsaoDeEntrega;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Integer getIdEntregaTipo() {
		return idEntregaTipo;
	}

	public void setIdEntregaTipo(Integer idEntregaTipo) {
		this.idEntregaTipo = idEntregaTipo;
	}

	public Integer getIdEnderecoLojaFisica() {
		return idEnderecoLojaFisica;
	}

	public void setIdEnderecoLojaFisica(Integer idEnderecoLojaFisica) {
		this.idEnderecoLojaFisica = idEnderecoLojaFisica;
	}

	public Integer getIdUnidadeNegocio() {
		return idUnidadeNegocio;
	}

	public void setIdUnidadeNegocio(Integer idUnidadeNegocio) {
		this.idUnidadeNegocio = idUnidadeNegocio;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
