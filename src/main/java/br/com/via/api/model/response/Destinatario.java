
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
    "nome",
    "cpfCnpj",
    "inscricaoEstadual",
    "email"
})
public class Destinatario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @JsonProperty("nome")
    private String nome;
    @JsonProperty("cpfCnpj")
    private String cpfCnpj;
    @JsonProperty("inscricaoEstadual")
    private String inscricaoEstadual;
    @JsonProperty("email")
    private String email;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("cpfCnpj")
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    @JsonProperty("cpfCnpj")
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @JsonProperty("inscricaoEstadual")
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    @JsonProperty("inscricaoEstadual")
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
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
        result = ((result* 31)+((this.cpfCnpj == null)? 0 :this.cpfCnpj.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.inscricaoEstadual == null)? 0 :this.inscricaoEstadual.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Destinatario) == false) {
            return false;
        }
        Destinatario rhs = ((Destinatario) other);
        return ((((((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome)))&&((this.cpfCnpj == rhs.cpfCnpj)||((this.cpfCnpj!= null)&&this.cpfCnpj.equals(rhs.cpfCnpj))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.inscricaoEstadual == rhs.inscricaoEstadual)||((this.inscricaoEstadual!= null)&&this.inscricaoEstadual.equals(rhs.inscricaoEstadual))));
    }

}
