
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
    "shortName",
    "longName",
    "cxKey",
    "__prefix"
})
public class CounterpartyInfo {

    @JsonProperty("shortName")
    private ShortName shortName;
    @JsonProperty("longName")
    private LongName longName;
    @JsonProperty("cxKey")
    private CxKey cxKey;
    @JsonProperty("__prefix")
    private String prefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shortName")
    public ShortName getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(ShortName shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("longName")
    public LongName getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(LongName longName) {
        this.longName = longName;
    }

    @JsonProperty("cxKey")
    public CxKey getCxKey() {
        return cxKey;
    }

    @JsonProperty("cxKey")
    public void setCxKey(CxKey cxKey) {
        this.cxKey = cxKey;
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
