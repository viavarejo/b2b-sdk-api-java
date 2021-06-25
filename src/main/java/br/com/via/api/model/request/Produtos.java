package br.com.via.api.model.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Produtos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("Codigo")
	private Integer codigo;
	
	@JsonProperty("Quantidade")
   private Integer quantidade;
   
	@JsonProperty("IdLojista")
	private Integer idLojista;
   
   public Produtos() {}
   
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Integer getIdLojista() {
		return idLojista;
	}
	public void setIdLojista(Integer idLojista) {
		this.idLojista = idLojista;
	}
   
}
