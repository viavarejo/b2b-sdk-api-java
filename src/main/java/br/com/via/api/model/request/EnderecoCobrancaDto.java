
package br.com.via.api.model.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "cep", "estado", "logradouro", "cidade", "numero", "referencia", "bairro", "complemento",
		"telefone", "telefone2", "telefone3" })
public class EnderecoCobrancaDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("cep")
	private String cep;

	@JsonProperty("estado")
	private String estado;

	@JsonProperty("logradouro")
	private String logradouro;

	@JsonProperty("cidade")
	private String cidade;

	@JsonProperty("numero")
	private Integer numero;

	@JsonProperty("referencia")
	private String referencia;

	@JsonProperty("bairro")
	private String bairro;

	@JsonProperty("complemento")
	private String complemento;

	@JsonProperty("telefone")
	private String telefone;

	@JsonProperty("telefone2")
	private String telefone2;

	@JsonProperty("telefone3")
	private String telefone3;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

}
