package br.com.via.api;

import java.util.HashMap;
import java.util.Map;

import br.com.via.api.client.ApiException;
import br.com.via.api.client.PropsReaderUtil;
import br.com.via.api.client.RequestUtil;
import br.com.via.api.model.response.CampanhasDTO;
import br.com.via.api.model.response.FormasPagamentoDTO;

public class CampanhaApi {
	
	private RequestUtil<?, CampanhasDTO> requestUtilCampanha;
	private RequestUtil<?, FormasPagamentoDTO> requestUtilFormaPagamento;
	
	private String basePath;
	
	public CampanhaApi() {
		this.basePath = new PropsReaderUtil().getHost();
		requestUtilCampanha = new RequestUtil<>(CampanhasDTO.class);
		requestUtilFormaPagamento = new RequestUtil<>(FormasPagamentoDTO.class);
	}
	
	public CampanhasDTO getCampanhas(String dtInicio, String dtFim) throws ApiException {
		Map<String, String> queryParams = new HashMap<String, String>();
		queryParams.put("dataInicio", dtInicio);
		queryParams.put("dataFim", dtFim);
		return requestUtilCampanha.get(basePath + "/campanhas", queryParams);
	}
	
	public FormasPagamentoDTO getFormasPagamento(String idCampanha, String cnpj) throws ApiException {
		Map<String, String> queryParams = new HashMap<String, String>();
		queryParams.put("cnpj", cnpj);
		return requestUtilFormaPagamento.get(basePath + "/campanhas/"+idCampanha+"/formas-pagamento/opcoes-parcelamento", queryParams);
	}

}
