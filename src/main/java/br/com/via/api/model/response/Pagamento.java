
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
    "codigoDoErro",
    "valorComplementar",
    "quantidadeParcelas",
    "valorParcela",
    "idFormaPagamento",
    "erro",
    "mensagemDeErro",
    "url"
})
public class Pagamento {

    @JsonProperty("codigoDoErro")
    private String codigoDoErro;
    @JsonProperty("valorComplementar")
    private Integer valorComplementar;
    @JsonProperty("quantidadeParcelas")
    private Integer quantidadeParcelas;
    @JsonProperty("valorParcela")
    private Integer valorParcela;
    @JsonProperty("idFormaPagamento")
    private Integer idFormaPagamento;
    @JsonProperty("erro")
    private Boolean erro;
    @JsonProperty("mensagemDeErro")
    private String mensagemDeErro;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("codigoDoErro")
    public String getCodigoDoErro() {
        return codigoDoErro;
    }

    @JsonProperty("codigoDoErro")
    public void setCodigoDoErro(String codigoDoErro) {
        this.codigoDoErro = codigoDoErro;
    }

    @JsonProperty("valorComplementar")
    public Integer getValorComplementar() {
        return valorComplementar;
    }

    @JsonProperty("valorComplementar")
    public void setValorComplementar(Integer valorComplementar) {
        this.valorComplementar = valorComplementar;
    }

    @JsonProperty("quantidadeParcelas")
    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    @JsonProperty("quantidadeParcelas")
    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @JsonProperty("valorParcela")
    public Integer getValorParcela() {
        return valorParcela;
    }

    @JsonProperty("valorParcela")
    public void setValorParcela(Integer valorParcela) {
        this.valorParcela = valorParcela;
    }

    @JsonProperty("idFormaPagamento")
    public Integer getIdFormaPagamento() {
        return idFormaPagamento;
    }

    @JsonProperty("idFormaPagamento")
    public void setIdFormaPagamento(Integer idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    @JsonProperty("erro")
    public Boolean getErro() {
        return erro;
    }

    @JsonProperty("erro")
    public void setErro(Boolean erro) {
        this.erro = erro;
    }

    @JsonProperty("mensagemDeErro")
    public String getMensagemDeErro() {
        return mensagemDeErro;
    }

    @JsonProperty("mensagemDeErro")
    public void setMensagemDeErro(String mensagemDeErro) {
        this.mensagemDeErro = mensagemDeErro;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
        result = ((result* 31)+((this.mensagemDeErro == null)? 0 :this.mensagemDeErro.hashCode()));
        result = ((result* 31)+((this.valorComplementar == null)? 0 :this.valorComplementar.hashCode()));
        result = ((result* 31)+((this.valorParcela == null)? 0 :this.valorParcela.hashCode()));
        result = ((result* 31)+((this.erro == null)? 0 :this.erro.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.quantidadeParcelas == null)? 0 :this.quantidadeParcelas.hashCode()));
        result = ((result* 31)+((this.idFormaPagamento == null)? 0 :this.idFormaPagamento.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.codigoDoErro == null)? 0 :this.codigoDoErro.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pagamento) == false) {
            return false;
        }
        Pagamento rhs = ((Pagamento) other);
        return ((((((((((this.mensagemDeErro == rhs.mensagemDeErro)||((this.mensagemDeErro!= null)&&this.mensagemDeErro.equals(rhs.mensagemDeErro)))&&((this.valorComplementar == rhs.valorComplementar)||((this.valorComplementar!= null)&&this.valorComplementar.equals(rhs.valorComplementar))))&&((this.valorParcela == rhs.valorParcela)||((this.valorParcela!= null)&&this.valorParcela.equals(rhs.valorParcela))))&&((this.erro == rhs.erro)||((this.erro!= null)&&this.erro.equals(rhs.erro))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.quantidadeParcelas == rhs.quantidadeParcelas)||((this.quantidadeParcelas!= null)&&this.quantidadeParcelas.equals(rhs.quantidadeParcelas))))&&((this.idFormaPagamento == rhs.idFormaPagamento)||((this.idFormaPagamento!= null)&&this.idFormaPagamento.equals(rhs.idFormaPagamento))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.codigoDoErro == rhs.codigoDoErro)||((this.codigoDoErro!= null)&&this.codigoDoErro.equals(rhs.codigoDoErro))));
    }

}
