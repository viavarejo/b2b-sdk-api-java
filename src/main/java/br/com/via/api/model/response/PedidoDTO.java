package br.com.via.api.model.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PedidoDTO implements Serializable {

	private static final long serialVersionUID = 4161532802164921443L;

	@JsonProperty("data")
	private Pedido data;

	@JsonProperty("error")
	private Error error;

	public Pedido getData() {
		return data;
	}

	public void setData(Pedido data) {
		this.data = data;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

}
