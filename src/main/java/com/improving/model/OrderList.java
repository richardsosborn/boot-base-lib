
package com.improving.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "outright",
    "swap",
    "__prefix"
})
public class OrderList {

    @JsonProperty("outright")
    private List<Outright> outright = null;
    @JsonProperty("swap")
    private List<Swap> swap = null;
    @JsonProperty("__prefix")
    private String prefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("outright")
    public List<Outright> getOutright() {
        return outright;
    }

    @JsonProperty("outright")
    public void setOutright(List<Outright> outright) {
        this.outright = outright;
    }

    @JsonProperty("swap")
    public List<Swap> getSwap() {
        return swap;
    }

    @JsonProperty("swap")
    public void setSwap(List<Swap> swap) {
        this.swap = swap;
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
