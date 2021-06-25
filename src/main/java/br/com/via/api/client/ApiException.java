package br.com.via.api.client;

import java.util.List;
import java.util.Map;

public class ApiException extends Exception {

	private static final long serialVersionUID = 1L;

	private int code = 0;
	private String message = null;
	private Map<String, List<Object>> responseHeaders = null;
	private String responseBody = null;

	public ApiException() {
	}

	public ApiException(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public ApiException(int code, String message, Map<String, List<Object>> responseHeaders, String responseBody) {
		this.code = code;
		this.message = message;
		this.responseHeaders = responseHeaders;
		this.responseBody = responseBody;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * Get the HTTP response headers.
	 */
	public Map<String, List<Object>> getResponseHeaders() {
		return responseHeaders;
	}

	/**
	 * Get the HTTP response body.
	 */
	public String getResponseBody() {
		return responseBody;
	}
}
