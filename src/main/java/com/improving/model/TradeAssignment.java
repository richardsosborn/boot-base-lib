
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
    "buySideAssignedTo",
    "sellSideAssignedTo",
    "__prefix"
})
public class TradeAssignment {

    @JsonProperty("buySideAssignedTo")
    private BuySideAssignedTo buySideAssignedTo;
    @JsonProperty("sellSideAssignedTo")
    private SellSideAssignedTo sellSideAssignedTo;
    @JsonProperty("__prefix")
    private String prefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("buySideAssignedTo")
    public BuySideAssignedTo getBuySideAssignedTo() {
        return buySideAssignedTo;
    }

    @JsonProperty("buySideAssignedTo")
    public void setBuySideAssignedTo(BuySideAssignedTo buySideAssignedTo) {
        this.buySideAssignedTo = buySideAssignedTo;
    }

    @JsonProperty("sellSideAssignedTo")
    public SellSideAssignedTo getSellSideAssignedTo() {
        return sellSideAssignedTo;
    }

    @JsonProperty("sellSideAssignedTo")
    public void setSellSideAssignedTo(SellSideAssignedTo sellSideAssignedTo) {
        this.sellSideAssignedTo = sellSideAssignedTo;
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
