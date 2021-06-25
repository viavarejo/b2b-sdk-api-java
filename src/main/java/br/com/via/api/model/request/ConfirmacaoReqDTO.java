
package br.com.via.api.model.request;

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
    "idCampanha",
    "idPedidoParceiro",
    "confirmado",
    "idPedidoMktplc",
    "cancelado",
    "motivoCancelamento",
    "parceiro"
})
public class ConfirmacaoReqDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @JsonProperty("idCampanha")
    private Integer idCampanha;
    @JsonProperty("idPedidoParceiro")
    private Integer idPedidoParceiro;
    @JsonProperty("confirmado")
    private Boolean confirmado;
    @JsonProperty("idPedidoMktplc")
    private String idPedidoMktplc;
    @JsonProperty("cancelado")
    private Boolean cancelado;
    @JsonProperty("motivoCancelamento")
    private String motivoCancelamento;
    @JsonProperty("parceiro")
    private String parceiro;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idCampanha")
    public Integer getIdCampanha() {
        return idCampanha;
    }

    @JsonProperty("idCampanha")
    public void setIdCampanha(Integer idCampanha) {
        this.idCampanha = idCampanha;
    }

    @JsonProperty("idPedidoParceiro")
    public Integer getIdPedidoParceiro() {
        return idPedidoParceiro;
    }

    @JsonProperty("idPedidoParceiro")
    public void setIdPedidoParceiro(Integer idPedidoParceiro) {
        this.idPedidoParceiro = idPedidoParceiro;
    }

    @JsonProperty("confirmado")
    public Boolean getConfirmado() {
        return confirmado;
    }

    @JsonProperty("confirmado")
    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    @JsonProperty("idPedidoMktplc")
    public String getIdPedidoMktplc() {
        return idPedidoMktplc;
    }

    @JsonProperty("idPedidoMktplc")
    public void setIdPedidoMktplc(String idPedidoMktplc) {
        this.idPedidoMktplc = idPedidoMktplc;
    }

    @JsonProperty("cancelado")
    public Boolean getCancelado() {
        return cancelado;
    }

    @JsonProperty("cancelado")
    public void setCancelado(Boolean cancelado) {
        this.cancelado = cancelado;
    }

    @JsonProperty("motivoCancelamento")
    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }

    @JsonProperty("motivoCancelamento")
    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }

    @JsonProperty("parceiro")
    public String getParceiro() {
        return parceiro;
    }

    @JsonProperty("parceiro")
    public void setParceiro(String parceiro) {
        this.parceiro = parceiro;
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
        result = ((result* 31)+((this.cancelado == null)? 0 :this.cancelado.hashCode()));
        result = ((result* 31)+((this.motivoCancelamento == null)? 0 :this.motivoCancelamento.hashCode()));
        result = ((result* 31)+((this.parceiro == null)? 0 :this.parceiro.hashCode()));
        result = ((result* 31)+((this.confirmado == null)? 0 :this.confirmado.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.idCampanha == null)? 0 :this.idCampanha.hashCode()));
        result = ((result* 31)+((this.idPedidoParceiro == null)? 0 :this.idPedidoParceiro.hashCode()));
        result = ((result* 31)+((this.idPedidoMktplc == null)? 0 :this.idPedidoMktplc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfirmacaoReqDTO) == false) {
            return false;
        }
        ConfirmacaoReqDTO rhs = ((ConfirmacaoReqDTO) other);
        return (((((((((this.cancelado == rhs.cancelado)||((this.cancelado!= null)&&this.cancelado.equals(rhs.cancelado)))&&((this.motivoCancelamento == rhs.motivoCancelamento)||((this.motivoCancelamento!= null)&&this.motivoCancelamento.equals(rhs.motivoCancelamento))))&&((this.parceiro == rhs.parceiro)||((this.parceiro!= null)&&this.parceiro.equals(rhs.parceiro))))&&((this.confirmado == rhs.confirmado)||((this.confirmado!= null)&&this.confirmado.equals(rhs.confirmado))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.idCampanha == rhs.idCampanha)||((this.idCampanha!= null)&&this.idCampanha.equals(rhs.idCampanha))))&&((this.idPedidoParceiro == rhs.idPedidoParceiro)||((this.idPedidoParceiro!= null)&&this.idPedidoParceiro.equals(rhs.idPedidoParceiro))))&&((this.idPedidoMktplc == rhs.idPedidoMktplc)||((this.idPedidoMktplc!= null)&&this.idPedidoMktplc.equals(rhs.idPedidoMktplc))));
    }

}
