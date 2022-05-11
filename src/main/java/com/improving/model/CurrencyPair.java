
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
    "_com:givenCCY",
    "_com:settleCCY",
    "_com:quotePair",
    "__prefix"
})
public class CurrencyPair {

    @JsonProperty("_com:givenCCY")
    private String comGivenCCY;
    @JsonProperty("_com:settleCCY")
    private String comSettleCCY;
    @JsonProperty("_com:quotePair")
    private String comQuotePair;
    @JsonProperty("__prefix")
    private String prefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_com:givenCCY")
    public String getComGivenCCY() {
        return comGivenCCY;
    }

    @JsonProperty("_com:givenCCY")
    public void setComGivenCCY(String comGivenCCY) {
        this.comGivenCCY = comGivenCCY;
    }

    @JsonProperty("_com:settleCCY")
    public String getComSettleCCY() {
        return comSettleCCY;
    }

    @JsonProperty("_com:settleCCY")
    public void setComSettleCCY(String comSettleCCY) {
        this.comSettleCCY = comSettleCCY;
    }

    @JsonProperty("_com:quotePair")
    public String getComQuotePair() {
        return comQuotePair;
    }

    @JsonProperty("_com:quotePair")
    public void setComQuotePair(String comQuotePair) {
        this.comQuotePair = comQuotePair;
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
