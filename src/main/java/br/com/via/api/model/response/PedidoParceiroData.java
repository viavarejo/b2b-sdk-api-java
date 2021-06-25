package br.com.via.api.model.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PedidoParceiroData implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("data")
	private PedidoParceiroDTO data;

	@JsonProperty("error")
	private Error error;

	public PedidoParceiroDTO getData() {
		return data;
	}

	public void setData(PedidoParceiroDTO data) {
		this.data = data;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

}
