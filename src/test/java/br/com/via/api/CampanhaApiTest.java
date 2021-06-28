package br.com.via.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.via.api.client.ApiException;
import br.com.via.api.model.response.CampanhasDTO;
import br.com.via.api.model.response.FormasPagamentoDTO;

public class CampanhaApiTest {
	private static CampanhaApi campanhaApi;
	private Gson gson = new GsonBuilder().setPrettyPrinting().create();

	@BeforeAll
	public static void init() {
		campanhaApi = new CampanhaApi();
	}
	
	@Test
	public void testGetCampanhaSucess() throws ApiException{
			CampanhasDTO campanhas = campanhaApi.getCampanhas("2019-08-04", "2100-08-04");
			System.out.println("\nResponse:");
			System.out.println(gson.toJson(campanhas));
			assertEquals("57.822.975/0001-12", campanhas.getData().get(0).getCnpjContrato());
	}
	
	@Test
	public void testGetCampanhaFail() {
		Assertions.assertThrows(ApiException.class, () -> {
			CampanhasDTO campanhas = campanhaApi.getCampanhas("2019-08-04", null);
			assertNull(campanhas.getData());
			assertEquals("400", campanhas.getError().getCode());
			assertEquals("Request inválido\\r\\nA dataFim é um parâmetro obrigatório.", campanhas.getError().getMessage());
			});
	}
	

	@Test
	public void testGetFormasPagamentoSucess() throws ApiException{
		FormasPagamentoDTO formasPagamento = campanhaApi.getFormasPagamento("5940", "57.822.975/0001-12");
		System.out.println("\nResponse:");
		System.out.println(gson.toJson(formasPagamento));
		assertNotNull(formasPagamento);
		assertEquals(new Integer(1), formasPagamento.getData().get(0).getIdFormaPagamento());
		assertEquals("Cartão de Crédito Visa ", formasPagamento.getData().get(0).getNome());
	}

	// erro fora do padrão(cada hora da um resultado)
	@Test
	public void testGetFormasPagamentoFail() throws ApiException{
	//	Assertions.assertThrows(ApiException.class, () -> {
			FormasPagamentoDTO formasPagamento = campanhaApi.getFormasPagamento("590", "57.822.97-12");
			System.out.println(gson.toJson(formasPagamento));
			assertNotNull(formasPagamento);
			assertTrue(formasPagamento.getData().isEmpty());
			assertTrue(formasPagamento.getError().getCode() == null);
//		});
	}
	
	

	

}
