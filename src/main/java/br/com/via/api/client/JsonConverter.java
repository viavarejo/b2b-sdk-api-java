package br.com.via.api.client;

import java.io.Serializable;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConverter<T extends Serializable> implements Serializable {

	private static final long serialVersionUID = 2434333182892020955L;

	private transient GsonBuilder gsonBuilder;

	private transient Gson gson;

	private Class<T> clazz;

	public JsonConverter(Class<T> clazz) {
		this.gsonBuilder = new GsonBuilder();
		gson = gsonBuilder.setDateFormat("dd/MM/yyyy HH:mm:ss").setPrettyPrinting().create();
		this.clazz = clazz;
	}

	public T convertToObject(String inputAsJson) {
		return gson.fromJson(inputAsJson, clazz);
	}

	public T convertToObject(Response response)  {
		//validarStatus(response);
		String json = getStringJson(response);
		return gson.fromJson(json, clazz);
	}

	public String convertToString(T entity) {
		return gson.toJson(entity);
	}


	private String getStringJson(Response response) {
		return response.readEntity(String.class);
	}


}
