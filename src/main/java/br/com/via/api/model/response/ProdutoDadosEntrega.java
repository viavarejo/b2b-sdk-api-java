
package br.com.via.api.model.response;

import java.util.HashMap;
import java.util.List;
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
    "disponibilidade",
    "fretes"
})
public class ProdutoDadosEntrega {

    @JsonProperty("idEntregaTipo")
    private Integer idEntregaTipo;
    @JsonProperty("disponibilidade")
    private Boolean disponibilidade;
    @JsonProperty("fretes")
    private List<Frete> fretes = null;
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

    @JsonProperty("disponibilidade")
    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    @JsonProperty("disponibilidade")
    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @JsonProperty("fretes")
    public List<Frete> getFretes() {
        return fretes;
    }

    @JsonProperty("fretes")
    public void setFretes(List<Frete> fretes) {
        this.fretes = fretes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
