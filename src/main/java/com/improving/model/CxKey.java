
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
    "_xsi:nil",
    "__prefix"
})
public class CxKey {

    @JsonProperty("_xsi:nil")
    private String xsiNil;
    @JsonProperty("__prefix")
    private String prefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_xsi:nil")
    public String getXsiNil() {
        return xsiNil;
    }

    @JsonProperty("_xsi:nil")
    public void setXsiNil(String xsiNil) {
        this.xsiNil = xsiNil;
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
