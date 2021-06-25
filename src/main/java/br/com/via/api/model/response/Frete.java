
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
    "estado",
    "precoCapital",
    "precoInterior"
})
public class Frete {

    @JsonProperty("estado")
    private String estado;
    @JsonProperty("precoCapital")
    private String precoCapital;
    @JsonProperty("precoInterior")
    private String precoInterior;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("estado")
    public String getEstado() {
        return estado;
    }

    @JsonProperty("estado")
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @JsonProperty("precoCapital")
    public String getPrecoCapital() {
        return precoCapital;
    }

    @JsonProperty("precoCapital")
    public void setPrecoCapital(String precoCapital) {
        this.precoCapital = precoCapital;
    }

    @JsonProperty("precoInterior")
    public String getPrecoInterior() {
        return precoInterior;
    }

    @JsonProperty("precoInterior")
    public void setPrecoInterior(String precoInterior) {
        this.precoInterior = precoInterior;
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
        result = ((result* 31)+((this.estado == null)? 0 :this.estado.hashCode()));
        result = ((result* 31)+((this.precoInterior == null)? 0 :this.precoInterior.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.precoCapital == null)? 0 :this.precoCapital.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Frete) == false) {
            return false;
        }
        Frete rhs = ((Frete) other);
        return (((((this.estado == rhs.estado)||((this.estado!= null)&&this.estado.equals(rhs.estado)))&&((this.precoInterior == rhs.precoInterior)||((this.precoInterior!= null)&&this.precoInterior.equals(rhs.precoInterior))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.precoCapital == rhs.precoCapital)||((this.precoCapital!= null)&&this.precoCapital.equals(rhs.precoCapital))));
    }

}
