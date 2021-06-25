package br.com.via.api;

import java.util.HashMap;
import java.util.Map;

import br.com.via.api.client.ApiException;
import br.com.via.api.client.PropsReaderUtil;
import br.com.via.api.client.RequestUtil;
import br.com.via.api.model.response.OpcoesParcelamentoDTO;

public class FormaPagamentoApi {
	
	private RequestUtil<?, OpcoesParcelamentoDTO> request;
	
	private String basePath;
	
	public FormaPagamentoApi() {
		this.basePath = new PropsReaderUtil().getHost();
		request = new RequestUtil<>(OpcoesParcelamentoDTO.class);
	}
	
	public OpcoesParcelamentoDTO getOpcoesParcelamento(String idFormaPagamento, String idCampanha, String cnpj, String valorParcela) throws ApiException {
		Map<String, String> queryParams = new HashMap<String, String>();
		queryParams.put("idCampanha", idCampanha);
		queryParams.put("cnpj", cnpj);
		queryParams.put("valorParcelar", valorParcela);
		return request.get(basePath + "/formas-pagamento/"+idFormaPagamento+"/opcoes-parcelamento", queryParams);
	}

}
