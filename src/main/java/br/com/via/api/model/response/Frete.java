
package br.com.via.api.model.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "estado", "precoCapital", "precoInterior" })
public class Frete {

	@JsonProperty("estado")
	private String estado;
	@JsonProperty("precoCapital")
	private String precoCapital;
	@JsonProperty("precoInterior")
	private String precoInterior;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPrecoCapital() {
		return precoCapital;
	}

	public void setPrecoCapital(String precoCapital) {
		this.precoCapital = precoCapital;
	}

	public String getPrecoInterior() {
		return precoInterior;
	}

	public void setPrecoInterior(String precoInterior) {
		this.precoInterior = precoInterior;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
