
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
    "_com:group",
    "_com:institution",
    "_com:user",
    "_com:side",
    "__prefix"
})
public class From {

    @JsonProperty("_com:group")
    private String comGroup;
    @JsonProperty("_com:institution")
    private String comInstitution;
    @JsonProperty("_com:user")
    private String comUser;
    @JsonProperty("_com:side")
    private String comSide;
    @JsonProperty("__prefix")
    private String prefix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_com:group")
    public String getComGroup() {
        return comGroup;
    }

    @JsonProperty("_com:group")
    public void setComGroup(String comGroup) {
        this.comGroup = comGroup;
    }

    @JsonProperty("_com:institution")
    public String getComInstitution() {
        return comInstitution;
    }

    @JsonProperty("_com:institution")
    public void setComInstitution(String comInstitution) {
        this.comInstitution = comInstitution;
    }

    @JsonProperty("_com:user")
    public String getComUser() {
        return comUser;
    }

    @JsonProperty("_com:user")
    public void setComUser(String comUser) {
        this.comUser = comUser;
    }

    @JsonProperty("_com:side")
    public String getComSide() {
        return comSide;
    }

    @JsonProperty("_com:side")
    public void setComSide(String comSide) {
        this.comSide = comSide;
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
