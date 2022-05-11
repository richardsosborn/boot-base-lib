
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
    "_com:spot",
    "_com:fwdPoints",
    "__prefix"
})
public class RateMkt {

    @JsonProperty("_com:spot")
    private String comSpot;
    @JsonProperty("_com:fwdPoints")
    private String comFwdPoints;
    @JsonProperty("__prefix")
    private String prefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_com:spot")
    public String getComSpot() {
        return comSpot;
    }

    @JsonProperty("_com:spot")
    public void setComSpot(String comSpot) {
        this.comSpot = comSpot;
    }

    @JsonProperty("_com:fwdPoints")
    public String getComFwdPoints() {
        return comFwdPoints;
    }

    @JsonProperty("_com:fwdPoints")
    public void setComFwdPoints(String comFwdPoints) {
        this.comFwdPoints = comFwdPoints;
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
