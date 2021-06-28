
package br.com.via.api.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pagamentos", "valorTotalComplementar", "valorTotalComplementarComJuros" })
public class DadosPagamentoComplementar {

	private List<Pagamento> pagamentos = null;
	private double valorTotalComplementar;
	private double valorTotalComplementarComJuros;

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public double getValorTotalComplementar() {
		return valorTotalComplementar;
	}

	public void setValorTotalComplementar(double valorTotalComplementar) {
		this.valorTotalComplementar = valorTotalComplementar;
	}

	public double getValorTotalComplementarComJuros() {
		return valorTotalComplementarComJuros;
	}

	public void setValorTotalComplementarComJuros(double valorTotalComplementarComJuros) {
		this.valorTotalComplementarComJuros = valorTotalComplementarComJuros;
	}
}
