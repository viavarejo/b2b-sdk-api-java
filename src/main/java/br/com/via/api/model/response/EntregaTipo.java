package br.com.via.api.model.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idEntregaTipo",
    "nome",
    "habilitado"
})
public class EntregaTipo {

    @JsonProperty("idEntregaTipo")
    private Integer idEntregaTipo;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("habilitado")
    private Boolean habilitado;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idEntregaTipo")
    public Integer getIdEntregaTipo() {
        return idEntregaTipo;
    }

    @JsonProperty("idEntregaTipo")
    public void setIdEntregaTipo(Integer idEntregaTipo) {
        this.idEntregaTipo = idEntregaTipo;
    }

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("habilitado")
    public Boolean getHabilitado() {
        return habilitado;
    }

    @JsonProperty("habilitado")
    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.nome == null)? 0 :this.nome.hashCode()));
        result = ((result* 31)+((this.habilitado == null)? 0 :this.habilitado.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.idEntregaTipo == null)? 0 :this.idEntregaTipo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntregaTipo) == false) {
            return false;
        }
        EntregaTipo rhs = ((EntregaTipo) other);
        return (((((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome)))&&((this.habilitado == rhs.habilitado)||((this.habilitado!= null)&&this.habilitado.equals(rhs.habilitado))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.idEntregaTipo == rhs.idEntregaTipo)||((this.idEntregaTipo!= null)&&this.idEntregaTipo.equals(rhs.idEntregaTipo))));
    }

}
