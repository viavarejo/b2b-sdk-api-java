package br.com.via.api.model.request;

import java.io.Serializable;

public class PedidoProdutoDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idLojista;
	private Integer codigo;
	private Integer quantidade;
	private Integer premio;
	private Double precoVenda;

	public PedidoProdutoDto() {
	}

	public Integer getIdLojista() {
		return idLojista;
	}

	public void setIdLojista(Integer idLojista) {
		this.idLojista = idLojista;
	}

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

	public Integer getPremio() {
		return premio;
	}

	public void setPremio(Integer premio) {
		this.premio = premio;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

}
