
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
    "_com:USIID",
    "_com:USIPrefix",
    "__prefix"
})
public class USICode {

    @JsonProperty("_com:USIID")
    private String comUSIID;
    @JsonProperty("_com:USIPrefix")
    private String comUSIPrefix;
    @JsonProperty("__prefix")
    private String prefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_com:USIID")
    public String getComUSIID() {
        return comUSIID;
    }

    @JsonProperty("_com:USIID")
    public void setComUSIID(String comUSIID) {
        this.comUSIID = comUSIID;
    }

    @JsonProperty("_com:USIPrefix")
    public String getComUSIPrefix() {
        return comUSIPrefix;
    }

    @JsonProperty("_com:USIPrefix")
    public void setComUSIPrefix(String comUSIPrefix) {
        this.comUSIPrefix = comUSIPrefix;
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
