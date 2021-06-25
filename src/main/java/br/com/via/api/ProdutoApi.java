package br.com.via.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import br.com.via.api.client.ApiException;
import br.com.via.api.client.PropsReaderUtil;
import br.com.via.api.client.RequestUtil;
import br.com.via.api.model.response.ProdutoDTO;
import br.com.via.api.model.response.ProdutosDTO;


public class ProdutoApi {
	
	private RequestUtil<?, ProdutoDTO> request;
	private RequestUtil<?, ProdutosDTO> requestList;
	
	private final String basePath;

	
	public ProdutoApi() {
		this.basePath = new PropsReaderUtil().getHost();
		request = new RequestUtil<>(ProdutoDTO.class);
		requestList = new RequestUtil<>(ProdutosDTO.class);
	}
	
	
	public ProdutoDTO getDadosProduto(String idLogista, String idSKu) throws ApiException{
		return request.get(basePath +"/lojistas/"+idLogista+"/produtos/" + idSKu);
	}
	
	public ProdutosDTO getListaDadosProdutos(String idLogista, String ... idSKu) throws ApiException{
		return requestList.get(basePath +"/lojistas/"+idLogista+"/produtos","idSku",Arrays.asList(idSKu));
	}
	
	public ProdutoDTO getDadosProdutoCampanha(String idCampanha, String idSKu, String cnpj, String idLojista) throws ApiException{
		Map<String, String> queryParams = new HashMap<String, String>();
		queryParams.put("idLojista", idLojista);
		queryParams.put("cnpj", cnpj);
		return request.get(basePath +"/campanhas/"+idCampanha+"/produtos/" + idSKu, queryParams);
	}

}
