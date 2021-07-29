

# SDK Java para API B2B

Provê os componentes para o uso da API B2B, disponibilizado pela VIA, facilitando a integração com as documentações relacionadas:

| Swagger |
| ------ | 
| http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#/ |
| http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#/| 
| http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#/ |

## Configurando o SDK
 Dentro da pasta [src/main/resources] se encontra o arquivo de propriedades (config.properties), o qual deve ser configurado duas propriedades: 
 - host  (end-point utilizado).
 - token (token de acesso do parceiro).
 
## APIs Disponíveis

O pacote [br.com.via.api] contem as classes:
* CampanhaApi.java
* FormaPagamentoApi.java
* PedidoApi.java
* ProdutoApi.java
* SegurancaApi.java

Estas classes compõem a camada de acesso para os serviços disponibilizados pelo B2B, alguns exemplos de como utiliza-lá estão disponíveis.

A seguir, são apresentadas as APIs e exemplos com as as principais operações do B2B.

- ## Campanha
    Api Utilizada para operações de campanha
    | Obtém todas as campanhas vinculadas ao parceiro: |
    | ------ | 
    | http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#/Campanha/Campanha_ListarCampanhaAsync |
    | http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#/Campanha/Campanha_ListarCampanhaAsync |
    | http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#/Campanha/Campanha_ListarCampanhaAsync |

    ```java
	    CampanhaApi campanhaApi = new CampanhaApi();
	    CampanhasDTO campanhas = campanhaApi.getCampanhas("2019-08-04", "2100-08-04");
    ```
    
	***
    
    | Obtém todas as opções de pagamento para uma determinada campanha: |
    | ------ | 
    | http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Campanha/Campanha_ListarOpcoesParcelamentoAsync |
    | http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#/Campanha/Campanha_ListarOpcoesParcelamentoAsync |
    | http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#/Campanha/Campanha_ListarOpcoesParcelamentoAsync |
    
    ```java
    CampanhaApi campanhaApi = new CampanhaApi();
    OpcoesParcelamentoDTO opcoesParcelamento = campanhaApi.getOpcoesParcelamento("5940", "57.822.975/0001-12");
    ```
    
***

- ## Pedido
    Api utilizada para operações de pedidos
     ## Calcular carrinho:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_CalcularCarrinhoAsync
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_CalcularCarrinhoAsync
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_CalcularCarrinhoAsync
	
        ```java
        PedidoApi pedidoApi = new PedidoApi();
		
        Produtos produto = new Produtos();
		produto.setCodigo(ID_SKU_CRIACAO_PEDIDO);
		produto.setQuantidade(1);
		produto.setIdLojista(ID_LOJISTA);

		PedidoCarrinho pedidoCarrinho = new PedidoCarrinho();
		pedidoCarrinho.setIdCampanha(ID_CAMPANHA);
		pedidoCarrinho.setCnpj(CNPJ);
		pedidoCarrinho.setCep("01525000");
		pedidoCarrinho.setProdutos(Arrays.asList(produto));
		
		CalculoCarrinho calculoCarrinho = pedidoApi.postCalcularCarrinho(pedidoCarrinho);
        ```
		
     ## Obter os dados de pedido do parceiro:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ObterPedidoAsync
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ObterPedidoAsync
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ObterPedidoAsync
	
        ```java
		PedidoApi pedidoApi = new PedidoApi();
		Map<String, String> pathParams = new HashMap<>();
		pathParams.put("idCompra", idPedido);

		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("request.idCompra", idPedido);
		queryParams.put("request.cnpj", CNPJ);
		queryParams.put("request.idCampanha", String.valueOf(ID_CAMPANHA));
		queryParams.put("request.idPedidoParceiro", idPedidoParceiro);

		PedidoParceiroData pedido = pedidoApi.getDadosPedidoParceiro(pathParams, queryParams);
        ```
		
     ## Confirma ou cancela pedidos pendentes de confirmação:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ConfirmarPedidoAsync
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ConfirmarPedidoAsync
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ConfirmarPedidoAsync
	
        ```java
		PedidoApi pedidoApi = new PedidoApi();
		Map<String, String> variableParams = new HashMap<>();
		variableParams.put("idCompra", idPedido);

		ConfirmacaoReqDTO dto = new ConfirmacaoReqDTO();
		dto.setIdCampanha(ID_CAMPANHA);
		dto.setIdPedidoParceiro(idPedidoParceiro);
		dto.setConfirmado(true);

		ConfirmacaoDTO confirmacaoDto = pedidoApi.patchPedidosCancelamentoOrConfirmacao(dto, variableParams);
        ```
		
     ## Obter nota fiscal do pedido:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ObterNFeAsync
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ObterNFeAsync
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ObterNFeAsync
	
        ```java
		PedidoApi pedidoApi = new PedidoApi();
		Map<String, String> pathParams = new HashMap<>();
		pathParams.put("idCompra", "247473612");
		pathParams.put("idCompraEntrega", "91712686");
		pathParams.put("formato", "PDF");

		String response = pedidoApi.getNotaFiscalPedido(pathParams);
        ```
		
     ## Criar pedido:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ObterNFeAsync
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ObterNFeAsync
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/Pedido/Pedido_ObterNFeAsync
	
        ```java
		PedidoApi pedidoApi = new PedidoApi();
		// Produto
		PedidoProdutoDto produto = new PedidoProdutoDto();
		produto.setIdLojista(ID_LOJISTA);
		produto.setCodigo(pedidoGeral.getIdSku());
		produto.setQuantidade(1);
		produto.setPremio(0);
		produto.setPrecoVenda(pedidoGeral.getPrecoVenda());
		List<PedidoProdutoDto> produtos = Arrays.asList(produto);

		// endereco Entrega
		EnderecoEntregaDto enderecoEntrega = new EnderecoEntregaDto();
		enderecoEntrega.setCep("01525-000");
		enderecoEntrega.setEstado("SP");
		enderecoEntrega.setLogradouro("rua da se");
		enderecoEntrega.setCidade("São Paulo");
		enderecoEntrega.setNumero(63);
		enderecoEntrega.setReferencia("teste");
		enderecoEntrega.setBairro("bairro se");
		enderecoEntrega.setComplemento("teste");
		enderecoEntrega.setTelefone("22333333");
		enderecoEntrega.setTelefone("22333335");
		enderecoEntrega.setTelefone("22333336");

		// destinatario
		DestinatarioDto destinatario = new DestinatarioDto();
		destinatario.setNome("teste");
		destinatario.setCpfCnpj("435.375.660-50");
		destinatario.setEmail("teste@teste.com");

		// dados entrega
		EntregaDadosDto dadosEntrega = new EntregaDadosDto();
		dadosEntrega.setValorFrete(pedidoGeral.valorFrete);

		// pedido
		CriacaoPedidoRequest pedido = new CriacaoPedidoRequest();
		pedido.setProdutos(produtos);
		pedido.setEnderecoEntrega(enderecoEntrega);
		pedido.setDestinatario(destinatario);
		pedido.setDadosEntrega(dadosEntrega);
		pedido.setCampanha(ID_CAMPANHA);
		pedido.setCnpj(CNPJ);
		int idPedidoParceiro = new Random().nextInt(65536);
		idPedidoParceiro = idPedidoParceiro < 0 ? idPedidoParceiro * -1 : idPedidoParceiro;
		pedido.setPedidoParceiro(idPedidoParceiro);
		pedido.setValorFrete(pedidoGeral.getValorFrete());
		pedido.setAguardarConfirmacao(true);
		pedido.setOptantePeloSimples(true);

		CriacaoPedidoDTO criacaoPedidoDTO = pedidoApi.postCriarPedido(pedido);
		
        ```
		
		
    
- ## Forma de Pagamento
    Api Utilizada para operações de forma de pagamento
     ## Obter opções de parcelamento:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/FormaPagamento/FormaPagamento_ListarOpcoesParcelamentoAsync
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/FormaPagamento/FormaPagamento_ListarOpcoesParcelamentoAsync
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/FormaPagamento/FormaPagamento_ListarOpcoesParcelamentoAsync
        ```java
        FormaPagamentoApi pagamentoApi = new FormaPagamentoApi();
        OpcoesParcelamentoDTO opcoesParcelamento = pagamentoApi.getOpcoesParcelamento("1", "5940", "57.822.975/0001-12", "1000");
        ```
- ## Produto
    Api Utilizada para operações de produto
     ## Obter dados do produto:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Produto/Produto_ObterProdutoAsync
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/Produto/Produto_ObterProdutoAsync
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/Produto/Produto_ObterProdutoAsync
        ```java
        ProdutoApi produtoApi = new ProdutoApi();
        ProdutoDTO dadosProduto = produtoApi.getDadosProduto("15", "5880205");
        ```
     ## Obter lista de dados dos produtos:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Produto/Produto_ListarProdutoAsync
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/Produto/Produto_ListarProdutoAsync
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/Produto/Produto_ListarProdutoAsync
        ```java
        ProdutoApi produtoApi = new ProdutoApi();
        ProdutosDTO listaDadosProdutos = produtoApi.getListaDadosProdutos("15","5880205", "5880206");
        ```
     ## Obter dados do produto por Campanha:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Produto/Produto_ObterProdutoPorCampanhaAsync
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/Produto/Produto_ObterProdutoPorCampanhaAsync
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/Produto/Produto_ObterProdutoPorCampanhaAsync
        ```java
        ProdutoApi produtoApi = new ProdutoApi();
        ProdutoDTO dadosProdutoCampanha = produtoApi.getDadosProdutoCampanha("5940", "5880205", "57.822.975/0001-12", "15");
        ```
- ## Seguranca
    Api Utilizada para operações de seguranca
     ## Obter chave pública 2048 bits utilizada para criptografia dos dados do cartão:
    - http://api-integracao-casasbahia.hlg-b2b.net/swagger/ui/index#!/Seguranca/Seguranca_ObterChave
    - http://api-integracao-pontofrio.hlg-b2b.net/swagger/ui/index#!/Seguranca/Seguranca_ObterChave
    - http://api-integracao-extra.hlg-b2b.net/swagger/ui/index#!/Seguranca/Seguranca_ObterChave
        ```java
        SegurancaApi segurancaApi = new SegurancaApi();;
        ChaveDTO chave = segurancaApi.setAuthorization("TOKEN").getChave();
        ```
       
## Testes unitarios

Foram criados no pacote src/test/java br.com.via.api um arquivo específico para cada uma das 5 API's do B2B, 
nesses arquivos você encontrará exemplos de como consumir os serviços oferecidos.      
        