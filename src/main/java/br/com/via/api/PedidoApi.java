package br.com.via.api;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.Map;

import javax.ws.rs.core.Response;

import br.com.via.api.client.ApiException;
import br.com.via.api.client.PropsReaderUtil;
import br.com.via.api.client.RequestUtil;
import br.com.via.api.model.request.ConfirmacaoReqDTO;
import br.com.via.api.model.request.CriacaoPedidoRequest;
import br.com.via.api.model.request.PedidoCarrinho;
import br.com.via.api.model.response.CalculoCarrinho;
import br.com.via.api.model.response.ConfirmacaoDTO;
import br.com.via.api.model.response.CriacaoPedidoDTO;
import br.com.via.api.model.response.PedidoParceiroData;

public class PedidoApi {
	private RequestUtil<PedidoCarrinho, CalculoCarrinho> requestUtilPedidoCarrinho;

	private RequestUtil<?, PedidoParceiroData> requestUtilPedidoParceiro;

	private RequestUtil<ConfirmacaoReqDTO, ConfirmacaoDTO> requestUtilConfirmacaoReqDTO;

	private RequestUtil<String, String> requestUtilNotaFiscalPedido;

	private RequestUtil<CriacaoPedidoRequest, CriacaoPedidoDTO> requestUtilCriacaoPedido;

	private final String basePath;
	private final String basePathMock;

	public PedidoApi() {
		this.basePath = new PropsReaderUtil().getHost();
		this.basePathMock = new PropsReaderUtil().getHostMock();
		requestUtilPedidoCarrinho = new RequestUtil<>(CalculoCarrinho.class);
		requestUtilPedidoParceiro = new RequestUtil<>(PedidoParceiroData.class);
		requestUtilConfirmacaoReqDTO = new RequestUtil<>(ConfirmacaoDTO.class);
		requestUtilNotaFiscalPedido = new RequestUtil<>(String.class);
		requestUtilCriacaoPedido = new RequestUtil<>(CriacaoPedidoDTO.class);
	}

	public CalculoCarrinho postCalcularCarrinho(PedidoCarrinho pedidosCarrinho) throws ApiException {
		// verify the required parameter
		if (pedidosCarrinho == null) {
			throw new ApiException(400,
					"Missing the required parameter 'pedidosCarrinho' when calling postPedidosCarrinho");
		}

		// create path and map variables
		String path = basePath + "/pedidos/carrinho";

		return requestUtilPedidoCarrinho.post(path, pedidosCarrinho);
	}

	public PedidoParceiroData getDadosPedidoParceiro(Map<String, String> pathParams, Map<String, String> queryParams)
			throws ApiException {
		// verify the required parameter
		if (pathParams == null) {
			throw new ApiException(400, "Missing the required parameter 'pathParams'");
		}

		// create path and map variables
		String path = basePath + String.format("/pedidos/%s", pathParams.get("idCompra"));

		return requestUtilPedidoParceiro.get(path, queryParams);
	}

	public ConfirmacaoDTO patchPedidosCancelamentoOrConfirmacao(ConfirmacaoReqDTO confirmacaoPedido,
			Map<String, String> variableParams)
			throws ApiException {
		// verify the required parameter
		if (variableParams == null) {
			throw new ApiException(400, "Missing the required parameter 'variableParams'");
		}

		// verify the required parameter
		if (confirmacaoPedido == null) {
			throw new ApiException(400,
					"Missing the required parameter 'confirmacaoPedido' when calling pathPedidosCancelamentoOrConfirmacao");
		}

		// create path and map variables
		String path = basePath + String.format("/pedidos/%s", variableParams.get("idCompra"));

		return requestUtilConfirmacaoReqDTO.patch(path, confirmacaoPedido);
	}

	public String getNotaFiscalPedido(Map<String, String> pathParams) throws ApiException, IOException {
		// verify the required parameter
		if (pathParams == null) {
			throw new ApiException(400, "Missing the required parameter 'pathParams'");
		}
		// create path and map variables
		String uri = null;
		if (basePathMock != null && !basePathMock.isEmpty()) {
			uri = basePathMock;
		} else {
			uri = basePath;
		}
		uri += String.format("/pedidos/%s/entregas/%s/nfe/%s", pathParams.get("idCompra"),
				pathParams.get("idCompraEntrega"), pathParams.get("formato"));

		Response response = requestUtilNotaFiscalPedido.getDownLoad(uri);
		InputStream in = response.readEntity(InputStream.class);
		Date date = new Date();
		String outFile = "NF_" + date.getTime() + ".PDF";
		Files.copy(in, Paths.get(outFile), StandardCopyOption.REPLACE_EXISTING);
		return outFile;
	}

	public CriacaoPedidoDTO postCriarPedido(CriacaoPedidoRequest pedido) throws ApiException {
		// verify the required parameter
		if (pedido == null) {
			throw new ApiException(400,
					"Missing the required parameter 'pedido'");
		}

		// create path and map variables
		String path = basePath + "/pedidos";

		return requestUtilCriacaoPedido.post(path, pedido);
	}

}
