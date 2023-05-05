/*package de.sit.updowncheck.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Status(String type, Value value) { }
*/
package de.sit.status.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "token", "url", "alias", "last_status", "uptime", "down", "down_since", "error", "period",
		"apdex_t", "string_match", "enabled", "published", "disabled_locations", "recipients", "last_check_at",
		"next_check_at", "mute_until", "favicon_url", "custom_headers", "http_verb", "http_body", "ssl" })
@Generated("jsonschema2pojo")
public class Status {

	@JsonProperty("token")
	private String token;
	@JsonProperty("url")
	private String url;
	@JsonProperty("alias")
	private String alias;
	@JsonProperty("last_status")
	private Integer lastStatus;
	@JsonProperty("uptime")
	private Double uptime;
	@JsonProperty("down")
	private Boolean down;
	@JsonProperty("down_since")
	private Object downSince;
	@JsonProperty("error")
	private Object error;
	@JsonProperty("period")
	private Integer period;
	@JsonProperty("apdex_t")
	private Double apdexT;
	@JsonProperty("string_match")
	private String stringMatch;
	@JsonProperty("enabled")
	private Boolean enabled;
	@JsonProperty("published")
	private Boolean published;
	@JsonProperty("disabled_locations")
	private List<String> disabledLocations;
	@JsonProperty("recipients")
	private List<String> recipients;
	@JsonProperty("last_check_at")
	private String lastCheckAt;
	@JsonProperty("next_check_at")
	private String nextCheckAt;
	@JsonProperty("mute_until")
	private Object muteUntil;
	@JsonProperty("favicon_url")
	private String faviconUrl;
	@JsonProperty("custom_headers")
	private CustomHeaders customHeaders;
	@JsonProperty("http_verb")
	private String httpVerb;
	@JsonProperty("http_body")
	private String httpBody;
	@JsonProperty("ssl")
	private Ssl ssl;

	@JsonProperty("token")
	public String getToken() {
		return token;
	}

	@JsonProperty("token")
	public void setToken(String token) {
		this.token = token;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("alias")
	public String getAlias() {
		return alias;
	}

	@JsonProperty("alias")
	public void setAlias(String alias) {
		this.alias = alias;
	}

	@JsonProperty("last_status")
	public Integer getLastStatus() {
		return lastStatus;
	}

	@JsonProperty("last_status")
	public void setLastStatus(Integer lastStatus) {
		this.lastStatus = lastStatus;
	}

	@JsonProperty("uptime")
	public Double getUptime() {
		return uptime;
	}

	@JsonProperty("uptime")
	public void setUptime(Double uptime) {
		this.uptime = uptime;
	}

	@JsonProperty("down")
	public Boolean getDown() {
		return down;
	}

	@JsonProperty("down")
	public void setDown(Boolean down) {
		this.down = down;
	}

	@JsonProperty("down_since")
	public Object getDownSince() {
		return downSince;
	}

	@JsonProperty("down_since")
	public void setDownSince(Object downSince) {
		this.downSince = downSince;
	}

	@JsonProperty("error")
	public Object getError() {
		return error;
	}

	@JsonProperty("error")
	public void setError(Object error) {
		this.error = error;
	}

	@JsonProperty("period")
	public Integer getPeriod() {
		return period;
	}

	@JsonProperty("period")
	public void setPeriod(Integer period) {
		this.period = period;
	}

	@JsonProperty("apdex_t")
	public Double getApdexT() {
		return apdexT;
	}

	@JsonProperty("apdex_t")
	public void setApdexT(Double apdexT) {
		this.apdexT = apdexT;
	}

	@JsonProperty("string_match")
	public String getStringMatch() {
		return stringMatch;
	}

	@JsonProperty("string_match")
	public void setStringMatch(String stringMatch) {
		this.stringMatch = stringMatch;
	}

	@JsonProperty("enabled")
	public Boolean getEnabled() {
		return enabled;
	}

	@JsonProperty("enabled")
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@JsonProperty("published")
	public Boolean getPublished() {
		return published;
	}

	@JsonProperty("published")
	public void setPublished(Boolean published) {
		this.published = published;
	}

	@JsonProperty("disabled_locations")
	public List<String> getDisabledLocations() {
		return disabledLocations;
	}

	@JsonProperty("disabled_locations")
	public void setDisabledLocations(List<String> disabledLocations) {
		this.disabledLocations = disabledLocations;
	}

	@JsonProperty("recipients")
	public List<String> getRecipients() {
		return recipients;
	}

	@JsonProperty("recipients")
	public void setRecipients(List<String> recipients) {
		this.recipients = recipients;
	}

	@JsonProperty("last_check_at")
	public String getLastCheckAt() {
		return lastCheckAt;
	}

	@JsonProperty("last_check_at")
	public void setLastCheckAt(String lastCheckAt) {
		this.lastCheckAt = lastCheckAt;
	}

	@JsonProperty("next_check_at")
	public String getNextCheckAt() {
		return nextCheckAt;
	}

	@JsonProperty("next_check_at")
	public void setNextCheckAt(String nextCheckAt) {
		this.nextCheckAt = nextCheckAt;
	}

	@JsonProperty("mute_until")
	public Object getMuteUntil() {
		return muteUntil;
	}

	@JsonProperty("mute_until")
	public void setMuteUntil(Object muteUntil) {
		this.muteUntil = muteUntil;
	}

	@JsonProperty("favicon_url")
	public String getFaviconUrl() {
		return faviconUrl;
	}

	@JsonProperty("favicon_url")
	public void setFaviconUrl(String faviconUrl) {
		this.faviconUrl = faviconUrl;
	}

	@JsonProperty("custom_headers")
	public CustomHeaders getCustomHeaders() {
		return customHeaders;
	}

	@JsonProperty("custom_headers")
	public void setCustomHeaders(CustomHeaders customHeaders) {
		this.customHeaders = customHeaders;
	}

	@JsonProperty("http_verb")
	public String getHttpVerb() {
		return httpVerb;
	}

	@JsonProperty("http_verb")
	public void setHttpVerb(String httpVerb) {
		this.httpVerb = httpVerb;
	}

	@JsonProperty("http_body")
	public String getHttpBody() {
		return httpBody;
	}

	@JsonProperty("http_body")
	public void setHttpBody(String httpBody) {
		this.httpBody = httpBody;
	}

	@JsonProperty("ssl")
	public Ssl getSsl() {
		return ssl;
	}

	@JsonProperty("ssl")
	public void setSsl(Ssl ssl) {
		this.ssl = ssl;
	}

}
