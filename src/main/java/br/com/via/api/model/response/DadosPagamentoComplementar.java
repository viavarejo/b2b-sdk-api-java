
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
    "pagamentos",
    "valorTotalComplementar",
    "valorTotalComplementarComJuros"
})
public class DadosPagamentoComplementar {

    @JsonProperty("pagamentos")
    private List<Pagamento> pagamentos = null;
    @JsonProperty("valorTotalComplementar")
    private Integer valorTotalComplementar;
    @JsonProperty("valorTotalComplementarComJuros")
    private Integer valorTotalComplementarComJuros;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pagamentos")
    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    @JsonProperty("pagamentos")
    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    @JsonProperty("valorTotalComplementar")
    public Integer getValorTotalComplementar() {
        return valorTotalComplementar;
    }

    @JsonProperty("valorTotalComplementar")
    public void setValorTotalComplementar(Integer valorTotalComplementar) {
        this.valorTotalComplementar = valorTotalComplementar;
    }

    @JsonProperty("valorTotalComplementarComJuros")
    public Integer getValorTotalComplementarComJuros() {
        return valorTotalComplementarComJuros;
    }

    @JsonProperty("valorTotalComplementarComJuros")
    public void setValorTotalComplementarComJuros(Integer valorTotalComplementarComJuros) {
        this.valorTotalComplementarComJuros = valorTotalComplementarComJuros;
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
        result = ((result* 31)+((this.valorTotalComplementarComJuros == null)? 0 :this.valorTotalComplementarComJuros.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.valorTotalComplementar == null)? 0 :this.valorTotalComplementar.hashCode()));
        result = ((result* 31)+((this.pagamentos == null)? 0 :this.pagamentos.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DadosPagamentoComplementar) == false) {
            return false;
        }
        DadosPagamentoComplementar rhs = ((DadosPagamentoComplementar) other);
        return (((((this.valorTotalComplementarComJuros == rhs.valorTotalComplementarComJuros)||((this.valorTotalComplementarComJuros!= null)&&this.valorTotalComplementarComJuros.equals(rhs.valorTotalComplementarComJuros)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.valorTotalComplementar == rhs.valorTotalComplementar)||((this.valorTotalComplementar!= null)&&this.valorTotalComplementar.equals(rhs.valorTotalComplementar))))&&((this.pagamentos == rhs.pagamentos)||((this.pagamentos!= null)&&this.pagamentos.equals(rhs.pagamentos))));
    }

}
