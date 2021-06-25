package br.com.via.api.model.request;

import java.io.Serializable;

public class CartaoCreditoDadosDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String numero;
	private String codigoVerificador;
	private String validadeAno;
	private String validadeMes;
	private String validadeAnoMes;
	private Integer quantidadeParcelas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoVerificador() {
		return codigoVerificador;
	}

	public void setCodigoVerificador(String codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}

	public String getValidadeAno() {
		return validadeAno;
	}

	public void setValidadeAno(String validadeAno) {
		this.validadeAno = validadeAno;
	}

	public String getValidadeMes() {
		return validadeMes;
	}

	public void setValidadeMes(String validadeMes) {
		this.validadeMes = validadeMes;
	}

	public String getValidadeAnoMes() {
		return validadeAnoMes;
	}

	public void setValidadeAnoMes(String validadeAnoMes) {
		this.validadeAnoMes = validadeAnoMes;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

}
