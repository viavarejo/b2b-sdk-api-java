package br.com.via.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.via.api.client.ApiException;
import br.com.via.api.model.response.OpcoesParcelamentoDTO;

public class FormaPagamentoTest {
	private static FormaPagamentoApi pagamentoApi;

	private Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	@BeforeAll
	public static void init() {
		pagamentoApi = new FormaPagamentoApi();
	}
	
	@Test
	public void getOpcoesParcelamentoSucess() throws ApiException{
		try {
			OpcoesParcelamentoDTO opcoesParcelamento = pagamentoApi.getOpcoesParcelamento("1", "5940", "57.822.975/0001-12", "1000");
			System.out.println("Response:");
			System.out.println(gson.toJson(opcoesParcelamento));
			assertNotNull(opcoesParcelamento);
			assertEquals(new Double(1000.0), opcoesParcelamento.getData().get(0).getValorParcela());
		}catch (ApiException e) {
			printErrorApi(e, "testGetOpcoesParcelamentoSucess");
			fail("Falha. Uma exceção ApiException não deveria ser lançada!");
		} catch (Exception e) {
			fail("Falha. Uma exceção não deveria ser lançada!\n" + e.getMessage());
		}
	}
	
	//ERRO FORA DO PADRÃO(objeto vem todo vazio)
	@Test
	public void getOpcoesParcelamentoFailure() throws ApiException{
		try {
			OpcoesParcelamentoDTO opcoesParcelamento = pagamentoApi.getOpcoesParcelamento("8", "5940", "57.822.975/0001-12", "1000");
			System.out.println("Response:");
			System.out.println(gson.toJson(opcoesParcelamento));
			assertNotNull(opcoesParcelamento);
			assertTrue(opcoesParcelamento.getData().isEmpty());
		}catch (ApiException e) {
			printErrorApi(e, "testGetOpcoesParcelamentoSucess");
			fail("Falha. Uma exceção ApiException não deveria ser lançada!");
		} catch (Exception e) {
			fail("Falha. Uma exceção não deveria ser lançada!\n" + e.getMessage());
		}
	}
	
	private void printErrorApi(ApiException e, String method) {
		System.out.println(String.format("ApiException %s \nCode: %s \nMessage: %s \nBody: %s \nHeaders: %s", method,
				e.getCode(), e.getMessage(), e.getResponseBody(), e.getResponseHeaders()));
	}

}
