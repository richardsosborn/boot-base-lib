
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
    "routingInfo",
    "marketTrade",
    "_xmlns",
    "_xmlns:com",
    "_xmlns:mar",
    "_xmlns:xsi",
    "_com:msgId",
    "_com:timeStamp"
})
public class ExportToOMSNotification {

    @JsonProperty("routingInfo")
    private RoutingInfo routingInfo;
    @JsonProperty("marketTrade")
    private MarketTrade marketTrade;
    @JsonProperty("_xmlns")
    private String xmlns;
    @JsonProperty("_xmlns:com")
    private String xmlnsCom;
    @JsonProperty("_xmlns:mar")
    private String xmlnsMar;
    @JsonProperty("_xmlns:xsi")
    private String xmlnsXsi;
    @JsonProperty("_com:msgId")
    private String comMsgId;
    @JsonProperty("_com:timeStamp")
    private String comTimeStamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("routingInfo")
    public RoutingInfo getRoutingInfo() {
        return routingInfo;
    }

    @JsonProperty("routingInfo")
    public void setRoutingInfo(RoutingInfo routingInfo) {
        this.routingInfo = routingInfo;
    }

    @JsonProperty("marketTrade")
    public MarketTrade getMarketTrade() {
        return marketTrade;
    }

    @JsonProperty("marketTrade")
    public void setMarketTrade(MarketTrade marketTrade) {
        this.marketTrade = marketTrade;
    }

    @JsonProperty("_xmlns")
    public String getXmlns() {
        return xmlns;
    }

    @JsonProperty("_xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    @JsonProperty("_xmlns:com")
    public String getXmlnsCom() {
        return xmlnsCom;
    }

    @JsonProperty("_xmlns:com")
    public void setXmlnsCom(String xmlnsCom) {
        this.xmlnsCom = xmlnsCom;
    }

    @JsonProperty("_xmlns:mar")
    public String getXmlnsMar() {
        return xmlnsMar;
    }

    @JsonProperty("_xmlns:mar")
    public void setXmlnsMar(String xmlnsMar) {
        this.xmlnsMar = xmlnsMar;
    }

    @JsonProperty("_xmlns:xsi")
    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    @JsonProperty("_xmlns:xsi")
    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    @JsonProperty("_com:msgId")
    public String getComMsgId() {
        return comMsgId;
    }

    @JsonProperty("_com:msgId")
    public void setComMsgId(String comMsgId) {
        this.comMsgId = comMsgId;
    }

    @JsonProperty("_com:timeStamp")
    public String getComTimeStamp() {
        return comTimeStamp;
    }

    @JsonProperty("_com:timeStamp")
    public void setComTimeStamp(String comTimeStamp) {
        this.comTimeStamp = comTimeStamp;
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
