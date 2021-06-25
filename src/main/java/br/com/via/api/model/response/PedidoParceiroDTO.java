package br.com.via.api.model.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.via.api.model.request.EnderecoCobrancaDto;

public class PedidoParceiroDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("pedido")
	private PedidoParceiro pedido;
	private EnderecoCobrancaDto endereco;
	private Destinatario destinatario;
	private List<Entrega> entregas;

	public PedidoParceiro getPedido() {
		return pedido;
	}

	public void setPedidoParceiro(PedidoParceiro pedido) {
		this.pedido = pedido;
	}

	public EnderecoCobrancaDto getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoCobrancaDto endereco) {
		this.endereco = endereco;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public List<Entrega> getEntregas() {
		return entregas;
	}

	public void setEntregas(List<Entrega> entregas) {
		this.entregas = entregas;
	}

}
