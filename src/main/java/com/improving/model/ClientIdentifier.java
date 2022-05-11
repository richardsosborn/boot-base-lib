
package com.improving.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_com:clientId",
    "_com:account",
    "__prefix"
})
public class ClientIdentifier {

    @JsonProperty("_com:clientId")
    private String comClientId;
    @JsonProperty("_com:account")
    private String comAccount;
    @JsonProperty("__prefix")
    private String prefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_com:clientId")
    public String getComClientId() {
        return comClientId;
    }

    @JsonProperty("_com:clientId")
    public void setComClientId(String comClientId) {
        this.comClientId = comClientId;
    }

    @JsonProperty("_com:account")
    public String getComAccount() {
        return comAccount;
    }

    @JsonProperty("_com:account")
    public void setComAccount(String comAccount) {
        this.comAccount = comAccount;
    }

    @JsonProperty("__prefix")
    public String getPrefix() {
        return prefix;
    }

    @JsonProperty("__prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
