package br.com.via.api;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.via.api.client.ApiException;
import br.com.via.api.model.response.ProdutoDTO;
import br.com.via.api.model.response.ProdutosDTO;

public class ProdutoApiTest {
	private static ProdutoApi produtoApi;
	private Gson gson = new GsonBuilder().setPrettyPrinting().create();

	@BeforeAll
	public static void init() {
		produtoApi = new ProdutoApi();
	}
	
	@Test
	public void getDadosProdutoSucess(){
		try {
			ProdutoDTO dadosProduto = produtoApi.getDadosProduto("15", "5880205");
			System.out.println("Response:");
			System.out.println(gson.toJson(dadosProduto));
			assertNotNull(dadosProduto);
			assertNotNull(dadosProduto.getData());
			assertEquals("Bola de Natal Santini Christmas 10cm Transparente - 3 Unidades.", dadosProduto.getData().getNome());
			assertEquals("http://imagens.extra.com.br/Control/ArquivoExibir.aspx?IdArquivo=253172122", dadosProduto.getData().getImagem());
			assertEquals(2868, dadosProduto.getData().getCategoria());
			assertEquals(29.9, dadosProduto.getData().getValor());
		}catch (ApiException e) {
			printErrorApi(e, "testGetCampanhaSucess");
			fail("Falha. Uma exceção ApiException não deveria ser lançada!");
		} catch (Exception e) {
			fail("Falha. Uma exceção não deveria ser lançada!\n" + e.getMessage());
		}
	}
	
	@Test
	public void getListaDadosProdutosSucess(){
		try {
			ProdutosDTO listaDadosProdutos = produtoApi.getListaDadosProdutos("15","5880205", "5880206");
			System.out.println("Response:");
			System.out.println(gson.toJson(listaDadosProdutos));
			assertNotNull(listaDadosProdutos);
			assertEquals(listaDadosProdutos.getData().get(0).getNome(), "Bola de Natal Santini Christmas 10cm Transparente - 3 Unidades.");
			assertEquals(listaDadosProdutos.getData().get(0).getDescricao(), "Sua decora&amp;#231;&amp;#227;o de Natal vai ficar moderna e cheia de estilo com o Conjunto de Bolas Santini Christmas - Branco/Transparente. Elas contam com 10 cent&amp;#237;metros de di&amp;#226;metro e s&amp;#227;o feitas em material pl&amp;#225;stico resistente com detalhes em glitter branco.&amp;lt;br&amp;gt;&amp;#13;&amp;#10;Um conjunto para decorar &amp;#225;rvores de Natal, ambientes e outros arranjos. Com os produtos Santini Christmas sua decora&amp;#231;&amp;#227;o de Natal vai ganhar elogios dos convidados!");
			assertEquals(listaDadosProdutos.getData().get(0).getImagem(), "http://imagens.extra.com.br/Control/ArquivoExibir.aspx?IdArquivo=253172122");
			assertEquals(listaDadosProdutos.getData().get(0).getCategoria(), 2868);
			assertEquals(listaDadosProdutos.getData().get(0).getValor(), 29.9);
		}catch (ApiException e) {
			printErrorApi(e, "getListaDadosProdutosSucess");
			fail("Falha. Uma exceção ApiException não deveria ser lançada!");
		} catch (Exception e) {
			fail("Falha. Uma exceção não deveria ser lançada!\n" + e.getMessage());
		}
	}
	
	@Test
	public void getDadosProdutoCampanhaSucess(){
		try {
			ProdutoDTO dadosProdutoCampanha = produtoApi.getDadosProdutoCampanha("5940", "5880205", "57.822.975/0001-12", "15");
			System.out.println("Response:");
			System.out.println(gson.toJson(dadosProdutoCampanha));
			assertNotNull(dadosProdutoCampanha);
			assertNotNull(dadosProdutoCampanha.getData());
			assertEquals("Bola de Natal Santini Christmas 10cm Transparente - 3 Unidades.", dadosProdutoCampanha.getData().getNome());
			assertEquals("http://imagens.extra.com.br/Control/ArquivoExibir.aspx?IdArquivo=253172122", dadosProdutoCampanha.getData().getImagem());
			assertEquals(2868, dadosProdutoCampanha.getData().getCategoria());
			assertEquals(29.9, dadosProdutoCampanha.getData().getValor());
			assertEquals(29.9, dadosProdutoCampanha.getData().getValorDe());
		}catch (ApiException e) {
			printErrorApi(e, "testGetCampanhaSucess");
			fail("Falha. Uma exceção ApiException não deveria ser lançada!");
		} catch (Exception e) {
			fail("Falha. Uma exceção não deveria ser lançada!\n" + e.getMessage());
		}
	}
	
	@Test
	public void getDadosProdutoFail() throws ApiException{
		try {
			ProdutoDTO dadosProduto = produtoApi.getDadosProduto("15", "595959");
			System.out.println("Response:");
			System.out.println(gson.toJson(dadosProduto));
			assertNotNull(dadosProduto);
			assertEquals("ProdutoNaoEncontrado", dadosProduto.getError().getCode());
			assertEquals("Produto ou Sku 595959 não encontrado", dadosProduto.getError().getMessage());
		}catch (ApiException e) {
			printErrorApi(e, "testGetCampanhaSucess");
			fail("Falha. Uma exceção ApiException não deveria ser lançada!");
		} catch (Exception e) {
			fail("Falha. Uma exceção não deveria ser lançada!\n" + e.getMessage());
		}
	}
	
	@Test
	public void getListaDadosProdutosFail() throws ApiException{
		try {
			ProdutosDTO listaDadosProdutos = produtoApi.getListaDadosProdutos("15","595959");
			System.out.println("Response:");
			System.out.println(gson.toJson(listaDadosProdutos));
			assertNotNull(listaDadosProdutos);
			assertEquals("NaoEncontrado", listaDadosProdutos.getError().getCode());
			assertEquals("Nenhum SKU foi encontrado.(ErroValidacao)", listaDadosProdutos.getError().getMessage());
		}catch (ApiException e) {
			printErrorApi(e, "testGetCampanhaSucess");
			fail("Falha. Uma exceção ApiException não deveria ser lançada!");
		} catch (Exception e) {
			fail("Falha. Uma exceção não deveria ser lançada!\n" + e.getMessage());
		}
	}
	
	@Test
	public void getDadosProdutoCampanhaFail() {
		Assertions.assertThrows(ApiException.class, () -> {
			produtoApi.getDadosProdutoCampanha("5940", "595959", "2", "2");
		});
	}
	
	private void printErrorApi(ApiException e, String method) {
		System.out.println(String.format("ApiException %s \nCode: %s \nMessage: %s \nBody: %s \nHeaders: %s", method,
				e.getCode(), e.getMessage(), e.getResponseBody(), e.getResponseHeaders()));
	}
	
	
	
	

}
