
package br.com.via.api.model.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "codDescricao", "data", "dataEntrega", "descricao" })
public class TrackingEntrega implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("codDescricao")
	private String codDescricao;

	@JsonProperty("data")
	private String data;

	@JsonProperty("dataEntrega")
	private String dataEntrega;

	@JsonProperty("descricao")
	private String descricao;

	public String getCodDescricao() {
		return codDescricao;
	}

	public void setCodDescricao(String codDescricao) {
		this.codDescricao = codDescricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
