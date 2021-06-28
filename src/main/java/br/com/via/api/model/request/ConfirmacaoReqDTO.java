
package br.com.via.api.model.request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "idCampanha", "idPedidoParceiro", "confirmado", "idPedidoMktplc", "cancelado",
		"motivoCancelamento", "parceiro" })
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

	public Integer getIdCampanha() {
		return idCampanha;
	}

	public void setIdCampanha(Integer idCampanha) {
		this.idCampanha = idCampanha;
	}

	public Integer getIdPedidoParceiro() {
		return idPedidoParceiro;
	}

	public void setIdPedidoParceiro(Integer idPedidoParceiro) {
		this.idPedidoParceiro = idPedidoParceiro;
	}

	public Boolean getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(Boolean confirmado) {
		this.confirmado = confirmado;
	}

	public String getIdPedidoMktplc() {
		return idPedidoMktplc;
	}

	public void setIdPedidoMktplc(String idPedidoMktplc) {
		this.idPedidoMktplc = idPedidoMktplc;
	}

	public Boolean getCancelado() {
		return cancelado;
	}

	public void setCancelado(Boolean cancelado) {
		this.cancelado = cancelado;
	}

	public String getMotivoCancelamento() {
		return motivoCancelamento;
	}

	public void setMotivoCancelamento(String motivoCancelamento) {
		this.motivoCancelamento = motivoCancelamento;
	}

	public String getParceiro() {
		return parceiro;
	}

	public void setParceiro(String parceiro) {
		this.parceiro = parceiro;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
