
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

import br.com.via.api.model.request.EnderecoCobrancaDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pedido",
    "endereco",
    "destinatario",
    "entregas"
})
public class DadosPedidoParceiro {

    @JsonProperty("pedido")
    private Pedido pedido;
    @JsonProperty("endereco")
    private EnderecoCobrancaDto endereco;
    @JsonProperty("destinatario")
    private Destinatario destinatario;
    @JsonProperty("entregas")
    private List<Entrega> entregas = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pedido")
    public Pedido getPedido() {
        return pedido;
    }

    @JsonProperty("pedido")
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @JsonProperty("endereco")
    public EnderecoCobrancaDto getEndereco() {
        return endereco;
    }

    @JsonProperty("endereco")
    public void setEndereco(EnderecoCobrancaDto endereco) {
        this.endereco = endereco;
    }

    @JsonProperty("destinatario")
    public Destinatario getDestinatario() {
        return destinatario;
    }

    @JsonProperty("destinatario")
    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    @JsonProperty("entregas")
    public List<Entrega> getEntregas() {
        return entregas;
    }

    @JsonProperty("entregas")
    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
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
        result = ((result* 31)+((this.pedido == null)? 0 :this.pedido.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.endereco == null)? 0 :this.endereco.hashCode()));
        result = ((result* 31)+((this.destinatario == null)? 0 :this.destinatario.hashCode()));
        result = ((result* 31)+((this.entregas == null)? 0 :this.entregas.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DadosPedidoParceiro) == false) {
            return false;
        }
        DadosPedidoParceiro rhs = ((DadosPedidoParceiro) other);
        return ((((((this.pedido == rhs.pedido)||((this.pedido!= null)&&this.pedido.equals(rhs.pedido)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.endereco == rhs.endereco)||((this.endereco!= null)&&this.endereco.equals(rhs.endereco))))&&((this.destinatario == rhs.destinatario)||((this.destinatario!= null)&&this.destinatario.equals(rhs.destinatario))))&&((this.entregas == rhs.entregas)||((this.entregas!= null)&&this.entregas.equals(rhs.entregas))));
    }

}
