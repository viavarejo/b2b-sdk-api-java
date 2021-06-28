package br.com.via.api.model.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "idEntregaTipo", "nome", "habilitado" })
public class EntregaTipo {

	@JsonProperty("idEntregaTipo")
	private Integer idEntregaTipo;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("habilitado")
	private Boolean habilitado;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getIdEntregaTipo() {
		return idEntregaTipo;
	}

	public void setIdEntregaTipo(Integer idEntregaTipo) {
		this.idEntregaTipo = idEntregaTipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
