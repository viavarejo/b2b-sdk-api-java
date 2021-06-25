
package br.com.via.api.model.response;

import java.io.Serializable;
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
    "previsaoDeEntrega",
    "valorFrete",
    "idEntregaTipo",
    "idEnderecoLojaFisica",
    "idUnidadeNegocio"
})
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

    @JsonProperty("previsaoDeEntrega")
    public String getPrevisaoDeEntrega() {
        return previsaoDeEntrega;
    }

    @JsonProperty("previsaoDeEntrega")
    public void setPrevisaoDeEntrega(String previsaoDeEntrega) {
        this.previsaoDeEntrega = previsaoDeEntrega;
    }

    @JsonProperty("valorFrete")
		public Double getValorFrete() {
        return valorFrete;
    }

    @JsonProperty("valorFrete")
		public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    @JsonProperty("idEntregaTipo")
    public Integer getIdEntregaTipo() {
        return idEntregaTipo;
    }

    @JsonProperty("idEntregaTipo")
    public void setIdEntregaTipo(Integer idEntregaTipo) {
        this.idEntregaTipo = idEntregaTipo;
    }

    @JsonProperty("idEnderecoLojaFisica")
    public Integer getIdEnderecoLojaFisica() {
        return idEnderecoLojaFisica;
    }

    @JsonProperty("idEnderecoLojaFisica")
    public void setIdEnderecoLojaFisica(Integer idEnderecoLojaFisica) {
        this.idEnderecoLojaFisica = idEnderecoLojaFisica;
    }

    @JsonProperty("idUnidadeNegocio")
    public Integer getIdUnidadeNegocio() {
        return idUnidadeNegocio;
    }

    @JsonProperty("idUnidadeNegocio")
    public void setIdUnidadeNegocio(Integer idUnidadeNegocio) {
        this.idUnidadeNegocio = idUnidadeNegocio;
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
        result = ((result* 31)+((this.valorFrete == null)? 0 :this.valorFrete.hashCode()));
        result = ((result* 31)+((this.idEntregaTipo == null)? 0 :this.idEntregaTipo.hashCode()));
        result = ((result* 31)+((this.idUnidadeNegocio == null)? 0 :this.idUnidadeNegocio.hashCode()));
        result = ((result* 31)+((this.previsaoDeEntrega == null)? 0 :this.previsaoDeEntrega.hashCode()));
        result = ((result* 31)+((this.idEnderecoLojaFisica == null)? 0 :this.idEnderecoLojaFisica.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DadosEntrega) == false) {
            return false;
        }
        DadosEntrega rhs = ((DadosEntrega) other);
        return (((((((this.valorFrete == rhs.valorFrete)||((this.valorFrete!= null)&&this.valorFrete.equals(rhs.valorFrete)))&&((this.idEntregaTipo == rhs.idEntregaTipo)||((this.idEntregaTipo!= null)&&this.idEntregaTipo.equals(rhs.idEntregaTipo))))&&((this.idUnidadeNegocio == rhs.idUnidadeNegocio)||((this.idUnidadeNegocio!= null)&&this.idUnidadeNegocio.equals(rhs.idUnidadeNegocio))))&&((this.previsaoDeEntrega == rhs.previsaoDeEntrega)||((this.previsaoDeEntrega!= null)&&this.previsaoDeEntrega.equals(rhs.previsaoDeEntrega))))&&((this.idEnderecoLojaFisica == rhs.idEnderecoLojaFisica)||((this.idEnderecoLojaFisica!= null)&&this.idEnderecoLojaFisica.equals(rhs.idEnderecoLojaFisica))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
