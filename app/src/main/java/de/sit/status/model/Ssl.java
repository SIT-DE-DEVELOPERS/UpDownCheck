package de.sit.status.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "tested_at", "expires_at", "valid", "error" })
@Generated("jsonschema2pojo")
public class Ssl {

	@JsonProperty("tested_at")
	private String testedAt;
	@JsonProperty("expires_at")
	private String expiresAt;
	@JsonProperty("valid")
	private Boolean valid;
	@JsonProperty("error")
	private String error;

	@JsonProperty("tested_at")
	public String getTestedAt() {
		return testedAt;
	}

	@JsonProperty("tested_at")
	public void setTestedAt(String testedAt) {
		this.testedAt = testedAt;
	}

	@JsonProperty("expires_at")
	public String getExpiresAt() {
		return expiresAt;
	}

	@JsonProperty("expires_at")
	public void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}

	@JsonProperty("valid")
	public Boolean getValid() {
		return valid;
	}

	@JsonProperty("valid")
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	@JsonProperty("error")
	public String getError() {
		return error;
	}

	@JsonProperty("error")
	public void setError(String error) {
		this.error = error;
	}
}