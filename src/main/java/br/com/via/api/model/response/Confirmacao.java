
package br.com.via.api.model.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Confirmacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("pedidoConfirmado")
	private Boolean pedidoConfirmado;

	@JsonProperty("pedidoCancelado")
	private Boolean pedidoCancelado;

	public Boolean getPedidoConfirmado() {
		return pedidoConfirmado;
	}

	public void setPedidoConfirmado(Boolean pedidoConfirmado) {
		this.pedidoConfirmado = pedidoConfirmado;
	}

	public Boolean getPedidoCancelado() {
		return pedidoCancelado;
	}

	public void setPedidoCancelado(Boolean pedidoCancelado) {
		this.pedidoCancelado = pedidoCancelado;
	}

}
