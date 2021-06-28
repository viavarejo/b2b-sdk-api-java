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

    public Integer getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(Integer idCampanha) {
        this.idCampanha = idCampanha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Integer getIdTipoCampanha() {
        return idTipoCampanha;
    }

    public void setIdTipoCampanha(Integer idTipoCampanha) {
        this.idTipoCampanha = idTipoCampanha;
    }

    public String getTipoCampanha() {
        return tipoCampanha;
    }

    public void setTipoCampanha(String tipoCampanha) {
        this.tipoCampanha = tipoCampanha;
    }

    public String getCnpjContrato() {
        return cnpjContrato;
    }

    public void setCnpjContrato(String cnpjContrato) {
        this.cnpjContrato = cnpjContrato;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<EntregaTipo> getEntregaTipos() {
        return entregaTipos;
    }

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
}
