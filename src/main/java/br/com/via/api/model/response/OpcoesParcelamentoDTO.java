
package br.com.via.api.model.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "error"
})
public class OpcoesParcelamentoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@JsonProperty("data")
    private List<OpcaoParcelamento> data = null;
    @JsonProperty("error")
    private Error error;

    public List<OpcaoParcelamento> getData() {
        return data;
    }

    public void setData(List<OpcaoParcelamento> data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }


}
