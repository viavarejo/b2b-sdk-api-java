
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
    "codigo",
    "nome",
    "quantidade",
    "valor",
    "frete",
    "valorAdicional",
    "valorTotal",
    "idLojista"
})
public class ProdutoEntrega implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @JsonProperty("codigo")
    private Integer codigo;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("quantidade")
    private Integer quantidade;
    @JsonProperty("valor")
		private double valor;
    @JsonProperty("frete")
		private double frete;
    @JsonProperty("valorAdicional")
		private double valorAdicional;
    @JsonProperty("valorTotal")
		private double valorTotal;
    @JsonProperty("idLojista")
    private Integer idLojista;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("codigo")
    public Integer getCodigo() {
        return codigo;
    }

    @JsonProperty("codigo")
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("quantidade")
    public Integer getQuantidade() {
        return quantidade;
    }

    @JsonProperty("quantidade")
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @JsonProperty("valor")
		public double getValor() {
        return valor;
    }

    @JsonProperty("valor")
		public void setValor(double valor) {
        this.valor = valor;
    }

    @JsonProperty("frete")
		public double getFrete() {
        return frete;
    }

    @JsonProperty("frete")
		public void setFrete(double frete) {
        this.frete = frete;
    }

    @JsonProperty("valorAdicional")
		public double getValorAdicional() {
        return valorAdicional;
    }

    @JsonProperty("valorAdicional")
		public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @JsonProperty("valorTotal")
		public double getValorTotal() {
        return valorTotal;
    }

    @JsonProperty("valorTotal")
		public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @JsonProperty("idLojista")
    public Integer getIdLojista() {
        return idLojista;
    }

    @JsonProperty("idLojista")
    public void setIdLojista(Integer idLojista) {
        this.idLojista = idLojista;
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
