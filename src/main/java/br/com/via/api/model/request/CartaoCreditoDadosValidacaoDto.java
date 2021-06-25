package br.com.via.api.model.request;

import java.io.Serializable;

public class CartaoCreditoDadosValidacaoDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String numeroMascarado;
	private String qtCaracteresCodigoVerificador;
	private String validadeAno;
	private String validadeMes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroMascarado() {
		return numeroMascarado;
	}

	public void setNumeroMascarado(String numeroMascarado) {
		this.numeroMascarado = numeroMascarado;
	}

	public String getQtCaracteresCodigoVerificador() {
		return qtCaracteresCodigoVerificador;
	}

	public void setQtCaracteresCodigoVerificador(String qtCaracteresCodigoVerificador) {
		this.qtCaracteresCodigoVerificador = qtCaracteresCodigoVerificador;
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
}
