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
    "idCampanha",
    "nome",
    "dataInicio",
    "dataFim",
    "idTipoCampanha",
    "tipoCampanha",
    "cnpjContrato",
    "status",
    "entregaTipos"
})

public class Campanha {

    @JsonProperty("idCampanha")
    private Integer idCampanha;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("dataInicio")
    private String dataInicio;
    @JsonProperty("dataFim")
    private String dataFim;
    @JsonProperty("idTipoCampanha")
    private Integer idTipoCampanha;
    @JsonProperty("tipoCampanha")
    private String tipoCampanha;
    @JsonProperty("cnpjContrato")
    private String cnpjContrato;
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("entregaTipos")
    private List<EntregaTipo> entregaTipos = null;
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

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("dataInicio")
    public String getDataInicio() {
        return dataInicio;
    }

    @JsonProperty("dataInicio")
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    @JsonProperty("dataFim")
    public String getDataFim() {
        return dataFim;
    }

    @JsonProperty("dataFim")
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    @JsonProperty("idTipoCampanha")
    public Integer getIdTipoCampanha() {
        return idTipoCampanha;
    }

    @JsonProperty("idTipoCampanha")
    public void setIdTipoCampanha(Integer idTipoCampanha) {
        this.idTipoCampanha = idTipoCampanha;
    }

    @JsonProperty("tipoCampanha")
    public String getTipoCampanha() {
        return tipoCampanha;
    }

    @JsonProperty("tipoCampanha")
    public void setTipoCampanha(String tipoCampanha) {
        this.tipoCampanha = tipoCampanha;
    }

    @JsonProperty("cnpjContrato")
    public String getCnpjContrato() {
        return cnpjContrato;
    }

    @JsonProperty("cnpjContrato")
    public void setCnpjContrato(String cnpjContrato) {
        this.cnpjContrato = cnpjContrato;
    }

    @JsonProperty("status")
    public Boolean getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @JsonProperty("entregaTipos")
    public List<EntregaTipo> getEntregaTipos() {
        return entregaTipos;
    }

    @JsonProperty("entregaTipos")
    public void setEntregaTipos(List<EntregaTipo> entregaTipos) {
        this.entregaTipos = entregaTipos;
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
        result = ((result* 31)+((this.dataFim == null)? 0 :this.dataFim.hashCode()));
        result = ((result* 31)+((this.tipoCampanha == null)? 0 :this.tipoCampanha.hashCode()));
        result = ((result* 31)+((this.idTipoCampanha == null)? 0 :this.idTipoCampanha.hashCode()));
        result = ((result* 31)+((this.nome == null)? 0 :this.nome.hashCode()));
        result = ((result* 31)+((this.dataInicio == null)? 0 :this.dataInicio.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.idCampanha == null)? 0 :this.idCampanha.hashCode()));
        result = ((result* 31)+((this.entregaTipos == null)? 0 :this.entregaTipos.hashCode()));
        result = ((result* 31)+((this.cnpjContrato == null)? 0 :this.cnpjContrato.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Campanha) == false) {
            return false;
        }
        Campanha rhs = ((Campanha) other);
        return (((((((((((this.dataFim == rhs.dataFim)||((this.dataFim!= null)&&this.dataFim.equals(rhs.dataFim)))&&((this.tipoCampanha == rhs.tipoCampanha)||((this.tipoCampanha!= null)&&this.tipoCampanha.equals(rhs.tipoCampanha))))&&((this.idTipoCampanha == rhs.idTipoCampanha)||((this.idTipoCampanha!= null)&&this.idTipoCampanha.equals(rhs.idTipoCampanha))))&&((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome))))&&((this.dataInicio == rhs.dataInicio)||((this.dataInicio!= null)&&this.dataInicio.equals(rhs.dataInicio))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.idCampanha == rhs.idCampanha)||((this.idCampanha!= null)&&this.idCampanha.equals(rhs.idCampanha))))&&((this.entregaTipos == rhs.entregaTipos)||((this.entregaTipos!= null)&&this.entregaTipos.equals(rhs.entregaTipos))))&&((this.cnpjContrato == rhs.cnpjContrato)||((this.cnpjContrato!= null)&&this.cnpjContrato.equals(rhs.cnpjContrato))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
