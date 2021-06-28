package br.com.via.api.client;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import org.glassfish.jersey.client.HttpUrlConnectorProvider;


public class RequestUtil<T1 extends Serializable, T2 extends Serializable> implements Serializable {

	private static final String AUTHORIZATION = "Authorization";
	private static final long serialVersionUID = 1L;
	// private static final Logger LOGGER =
	// Logger.getLogger(RequestUtil.class.getName());
	
	private transient Client client;
	private JsonConverter<T2> tratarRetorno;
	String accessToken;

	public RequestUtil(Class<T2> clazz2) {
		this.tratarRetorno = new JsonConverter<>(clazz2); 
		this.accessToken = new PropsReaderUtil().getToken();
	}

	public T2 get(String path) throws ApiException {
		return this.get(path, null);
	}

	public T2 get(String path, Map<String, String> queryParams) throws ApiException {
		try {
			Response response = this.doGet(path, queryParams);
			return this.tratarRetorno.convertToObject(response);
		} finally {
			this.closeClient();
		}
	}
	
	public T2 get(String path, String parameter, List<String> parameterValues) throws ApiException {
		try {
			Response response = this.doGet(path, parameter, parameterValues);
			return tratarRetorno.convertToObject(response);
		} finally {
			this.closeClient();
		}
	}


	public T2 post(String path, T1 entityIn) throws ApiException {
		try {
//			requestBody(entityIn);
			Response response = this.doPost(path, entityIn);
			return this.tratarRetorno.convertToObject(response);
		} finally {
			this.closeClient();
		}
	}

	public T2 patch(String path, T1 entityIn) throws ApiException {
		try {
			Response response = this.doPath(path, entityIn);
			return this.tratarRetorno.convertToObject(response);
		} finally {
			this.closeClient();
		}
	}

	private WebTarget createWebTarget(String path) {
		this.client = ClientBuilder.newClient();
		return this.client.target(path);
	}

	private void closeClient() {
		if (this.client != null) {
			this.client.close();
			this.client = null;
		}
	}

	private Response doPost(String path, T1 entityIn) throws ApiException {
		Response response = null;
		WebTarget webTarget = this.createWebTarget(path);
		if (accessToken != null) {
			response = webTarget.request().header(AUTHORIZATION, accessToken)
					.post(Entity.json(entityIn));
		} else {
			response = webTarget.request().post(Entity.json(entityIn));
		}
		validarResponse(response);
		return response;
	}

	private Response doPath(String path, T1 entityIn) throws ApiException {
		Response response = null;
		WebTarget webTarget = this.createWebTarget(path);
		webTarget.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true);
		if (accessToken != null) {

			response = webTarget.request().header(AUTHORIZATION, accessToken).method("PATCH", Entity.json(entityIn));
		} else {
			response = webTarget.request().method("PATCH", Entity.json(entityIn));
		}
		validarResponse(response);
		return response;
	}

	private Response doGet(String path, Map<String, String> queryParams) throws ApiException {
		Response response = null;
		String fullPath = path;
		if(queryParams != null) {
			fullPath = fullPath + queryParamStringBuilder(queryParams);
		}	
		
		WebTarget webTarget = this.createWebTarget(fullPath);
		if (accessToken != null) {
			response = webTarget.request().header(AUTHORIZATION, accessToken).get();
		} else {
			response = webTarget.request().get();
		}
		validarResponse(response);
		return response;
	}
	
	private String queryParamStringBuilder(Map<String, String> queryParams) {
		StringBuilder b = new StringBuilder();
		for (String key : queryParams.keySet()) {
			String value = queryParams.get(key);
			if (value != null) {
				if (b.toString().length() == 0)
					b.append("?");
				else
					b.append("&");
				b.append(key).append("=").append(value);
			}
		}
		return b.toString();
	}
	
	private Response doGet(String path, String parameter, List<String> parameterValues) {
		Response response = null;
		WebTarget webTarget = this.createWebTarget(path);
		if (parameter != null) {
		webTarget = webTarget.queryParam(parameter, parameterValues.toArray());
		}
		if (accessToken != null) {
			response = webTarget.request().header(AUTHORIZATION, accessToken).get();
		} else {
			response = webTarget.request().get();
		}
		return response;
		}
	
	private void validarResponse(Response response) throws ApiException {
		if (response != null && response.getStatusInfo() != null
				&& (response.getStatusInfo().getFamily() == Family.SERVER_ERROR
				|| response.getStatusInfo().getFamily() == Family.CLIENT_ERROR)) {
			String message = response.getStatusInfo().getReasonPhrase();
			String respBody = null;
			if (response.hasEntity()) {
				try {
					respBody = String.valueOf(response.readEntity(String.class));
				} catch (RuntimeException e) {
					message += "\n" + e.getMessage();
				}
			}
			throw new ApiException(response.getStatus(), message, response.getHeaders(), respBody);
		}
	}

//	private void requestBody(T1 entityIn) {
//		JsonConverter<T1> tratarEntrada = new JsonConverter<T1>((Class<T1>) entityIn.getClass());
//		LOGGER.log(Level.INFO, "payload da requisição: \n{0} ", tratarEntrada.convertToString(entityIn));
//	}

}
