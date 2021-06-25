package br.com.via.api;

public class CriptografiaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CriptografiaException(String message, Throwable cause) {
		super(message, cause);
	}

	public CriptografiaException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		return "Erro na criptografia" + super.getMessage();
	}
}
