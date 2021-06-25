
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
    "nome",
    "descricao",
    "imagem",
    "categoria",
    "valor",
    "valorDe",
    "disponibilidade",
    "foraDeLinha",
    "idLojista",
    "dadosEntrega"
})
public class ListaProdutos {

    @JsonProperty("nome")
    private String nome;
    @JsonProperty("descricao")
    private String descricao;
    @JsonProperty("imagem")
    private String imagem;
    @JsonProperty("categoria")
    private Integer categoria;
    @JsonProperty("valor")
    private Double valor;
    @JsonProperty("valorDe")
    private Double valorDe;
    @JsonProperty("disponibilidade")
    private Boolean disponibilidade;
    @JsonProperty("foraDeLinha")
    private Boolean foraDeLinha;
    @JsonProperty("idLojista")
    private Integer idLojista;
    @JsonProperty("dadosEntrega")
    private List<ProdutoDadosEntrega> dadosEntrega = null;
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

    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    @JsonProperty("descricao")
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @JsonProperty("imagem")
    public String getImagem() {
        return imagem;
    }

    @JsonProperty("imagem")
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @JsonProperty("categoria")
    public Integer getCategoria() {
        return categoria;
    }

    @JsonProperty("categoria")
    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    @JsonProperty("valor")
    public Double getValor() {
        return valor;
    }

    @JsonProperty("valor")
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @JsonProperty("valorDe")
    public Double getValorDe() {
        return valorDe;
    }

    @JsonProperty("valorDe")
    public void setValorDe(Double valorDe) {
        this.valorDe = valorDe;
    }

    @JsonProperty("disponibilidade")
    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    @JsonProperty("disponibilidade")
    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @JsonProperty("foraDeLinha")
    public Boolean getForaDeLinha() {
        return foraDeLinha;
    }

    @JsonProperty("foraDeLinha")
    public void setForaDeLinha(Boolean foraDeLinha) {
        this.foraDeLinha = foraDeLinha;
    }

    @JsonProperty("idLojista")
    public Integer getIdLojista() {
        return idLojista;
    }

    @JsonProperty("idLojista")
    public void setIdLojista(Integer idLojista) {
        this.idLojista = idLojista;
    }

    @JsonProperty("dadosEntrega")
    public List<ProdutoDadosEntrega> getDadosEntrega() {
        return dadosEntrega;
    }

    @JsonProperty("dadosEntrega")
    public void setDadosEntrega(List<ProdutoDadosEntrega> dadosEntrega) {
        this.dadosEntrega = dadosEntrega;
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
