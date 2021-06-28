package br.com.via.api;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.via.api.client.ApiException;
import br.com.via.api.model.response.ChaveDTO;

public class SegurancaApiTest {
	private static SegurancaApi segurancaApi;
	private Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	@BeforeAll
	public static void init() {
		segurancaApi = new SegurancaApi();
	}
	
	@Test
	public void getChaveTestSucess() {
		try {
			ChaveDTO chave = segurancaApi.getChave();
			System.out.println(gson.toJson(chave));
			assertNotNull(chave);
			assertEquals("2018-11-28T13:56:06", chave.getData().getDataCadastro());
		} catch (ApiException e) {
			printErrorApi(e, "testgetChaveTestSucess");
			fail("Falha. Uma exceção ApiException não deveria ser lançada!");
		} catch (Exception e) {
			fail("Falha. Uma exceção não deveria ser lançada!\n" + e.getMessage());
		}
	}
	
	//Mesmo com um token invalido ele tem sucesso na requisição
//	@Test
//	@Ignore
//	public void getChaveTestFail() {
//		try {
//			ChaveDTO chave = segurancaApi.setAuthorization("TOKEN_FALSO_123").getChave();
//			System.out.println(gson.toJson(chave));
//			assertNotNull(chave);
//		} catch (ApiException e) {
//			printErrorApi(e, "testGetCampanhaFail");
//			fail("Falha. Uma exceção ApiException não deveria ser lançada!");
//		} catch (Exception e) {
//			fail("Falha. Uma exceção não deveria ser lançada!\n" + e.getMessage());
//		}
//	}
//	
	private void printErrorApi(ApiException e, String method) {
		System.out.println(String.format("ApiException %s \nCode: %s \nMessage: %s \nBody: %s \nHeaders: %s", method,
				e.getCode(), e.getMessage(), e.getResponseBody(), e.getResponseHeaders()));
	}

}
