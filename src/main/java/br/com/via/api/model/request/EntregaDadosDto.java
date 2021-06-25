package br.com.via.api.model.request;

import java.io.Serializable;

public class EntregaDadosDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String previsaoDeEntrega;
	private Double valorFrete;
	private Integer idEntregaTipo;
	private Integer idEnderecoLojaFisica;
	private Integer idUnidadeNegocio;

	public EntregaDadosDto() {
	}

	public String getPrevisaoDeEntrega() {
		return previsaoDeEntrega;
	}

	public void setPrevisaoDeEntrega(String previsaoDeEntrega) {
		this.previsaoDeEntrega = previsaoDeEntrega;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Integer getIdEntregaTipo() {
		return idEntregaTipo;
	}

	public void setIdEntregaTipo(Integer idEntregaTipo) {
		this.idEntregaTipo = idEntregaTipo;
	}

	public Integer getIdEnderecoLojaFisica() {
		return idEnderecoLojaFisica;
	}

	public void setIdEnderecoLojaFisica(Integer idEnderecoLojaFisica) {
		this.idEnderecoLojaFisica = idEnderecoLojaFisica;
	}

	public Integer getIdUnidadeNegocio() {
		return idUnidadeNegocio;
	}

	public void setIdUnidadeNegocio(Integer idUnidadeNegocio) {
		this.idUnidadeNegocio = idUnidadeNegocio;
	}

}
