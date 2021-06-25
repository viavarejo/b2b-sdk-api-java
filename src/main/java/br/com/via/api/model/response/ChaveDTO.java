
package br.com.via.api.model.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "error"
})
public class ChaveDTO implements Serializable{

	private static final long serialVersionUID = -616453953704856593L;
	
	@JsonProperty("data")
    private Chave data;
    @JsonProperty("error")
    private Error error;

    public Chave getData() {
        return data;
    }

    public void setData(Chave data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }



}
