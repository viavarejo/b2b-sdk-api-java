
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
    "idLojista",
    "codigo",
    "quantidade",
    "premio",
    "precoVenda"
})
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @JsonProperty("idLojista")
    private Integer idLojista;
    @JsonProperty("codigo")
    private Integer codigo;
    @JsonProperty("quantidade")
    private Integer quantidade;
    @JsonProperty("premio")
    private Integer premio;
    @JsonProperty("precoVenda")
		private Double precoVenda;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idLojista")
    public Integer getIdLojista() {
        return idLojista;
    }

    @JsonProperty("idLojista")
    public void setIdLojista(Integer idLojista) {
        this.idLojista = idLojista;
    }

    @JsonProperty("codigo")
    public Integer getCodigo() {
        return codigo;
    }

    @JsonProperty("codigo")
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("quantidade")
    public Integer getQuantidade() {
        return quantidade;
    }

    @JsonProperty("quantidade")
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @JsonProperty("premio")
    public Integer getPremio() {
        return premio;
    }

    @JsonProperty("premio")
    public void setPremio(Integer premio) {
        this.premio = premio;
    }

    @JsonProperty("precoVenda")
		public Double getPrecoVenda() {
        return precoVenda;
    }

    @JsonProperty("precoVenda")
		public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
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
        result = ((result* 31)+((this.idLojista == null)? 0 :this.idLojista.hashCode()));
        result = ((result* 31)+((this.codigo == null)? 0 :this.codigo.hashCode()));
        result = ((result* 31)+((this.precoVenda == null)? 0 :this.precoVenda.hashCode()));
        result = ((result* 31)+((this.premio == null)? 0 :this.premio.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.quantidade == null)? 0 :this.quantidade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Produto) == false) {
            return false;
        }
        Produto rhs = ((Produto) other);
        return (((((((this.idLojista == rhs.idLojista)||((this.idLojista!= null)&&this.idLojista.equals(rhs.idLojista)))&&((this.codigo == rhs.codigo)||((this.codigo!= null)&&this.codigo.equals(rhs.codigo))))&&((this.precoVenda == rhs.precoVenda)||((this.precoVenda!= null)&&this.precoVenda.equals(rhs.precoVenda))))&&((this.premio == rhs.premio)||((this.premio!= null)&&this.premio.equals(rhs.premio))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.quantidade == rhs.quantidade)||((this.quantidade!= null)&&this.quantidade.equals(rhs.quantidade))));
    }

}
