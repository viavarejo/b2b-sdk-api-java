package br.com.via.api;

import br.com.via.api.client.ApiException;
import br.com.via.api.client.PropsReaderUtil;
import br.com.via.api.client.RequestUtil;
import br.com.via.api.model.response.ChaveDTO;


public class SegurancaApi {
	
	private RequestUtil<?, ChaveDTO> request;
	
	private String basePath;
	
	public SegurancaApi() {
		this.basePath =  new PropsReaderUtil().getHost();
		request = new RequestUtil<>(ChaveDTO.class);
	}
	
	public ChaveDTO getChave() throws ApiException{
		return request.get(basePath + "/seguranca/chaves");
	}
	

}
