
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
    "date",
    "finishedTime",
    "tradeAssignment",
    "status",
    "postExecStatus",
    "obo",
    "sellUser",
    "clientTriad",
    "traderTriad",
    "counterpartyInfo",
    "orderList",
    "_mar:type",
    "_com:id"
})
public class MarketTrade {

    @JsonProperty("date")
    private Date date;
    @JsonProperty("finishedTime")
    private FinishedTime finishedTime;
    @JsonProperty("tradeAssignment")
    private TradeAssignment tradeAssignment;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("postExecStatus")
    private PostExecStatus postExecStatus;
    @JsonProperty("obo")
    private Obo obo;
    @JsonProperty("sellUser")
    private SellUser sellUser;
    @JsonProperty("clientTriad")
    private ClientTriad clientTriad;
    @JsonProperty("traderTriad")
    private TraderTriad traderTriad;
    @JsonProperty("counterpartyInfo")
    private CounterpartyInfo counterpartyInfo;
    @JsonProperty("orderList")
    private OrderList orderList;
    @JsonProperty("_mar:type")
    private String marType;
    @JsonProperty("_com:id")
    private String comId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    @JsonProperty("finishedTime")
    public FinishedTime getFinishedTime() {
        return finishedTime;
    }

    @JsonProperty("finishedTime")
    public void setFinishedTime(FinishedTime finishedTime) {
        this.finishedTime = finishedTime;
    }

    @JsonProperty("tradeAssignment")
    public TradeAssignment getTradeAssignment() {
        return tradeAssignment;
    }

    @JsonProperty("tradeAssignment")
    public void setTradeAssignment(TradeAssignment tradeAssignment) {
        this.tradeAssignment = tradeAssignment;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("postExecStatus")
    public PostExecStatus getPostExecStatus() {
        return postExecStatus;
    }

    @JsonProperty("postExecStatus")
    public void setPostExecStatus(PostExecStatus postExecStatus) {
        this.postExecStatus = postExecStatus;
    }

    @JsonProperty("obo")
    public Obo getObo() {
        return obo;
    }

    @JsonProperty("obo")
    public void setObo(Obo obo) {
        this.obo = obo;
    }

    @JsonProperty("sellUser")
    public SellUser getSellUser() {
        return sellUser;
    }

    @JsonProperty("sellUser")
    public void setSellUser(SellUser sellUser) {
        this.sellUser = sellUser;
    }

    @JsonProperty("clientTriad")
    public ClientTriad getClientTriad() {
        return clientTriad;
    }

    @JsonProperty("clientTriad")
    public void setClientTriad(ClientTriad clientTriad) {
        this.clientTriad = clientTriad;
    }

    @JsonProperty("traderTriad")
    public TraderTriad getTraderTriad() {
        return traderTriad;
    }

    @JsonProperty("traderTriad")
    public void setTraderTriad(TraderTriad traderTriad) {
        this.traderTriad = traderTriad;
    }

    @JsonProperty("counterpartyInfo")
    public CounterpartyInfo getCounterpartyInfo() {
        return counterpartyInfo;
    }

    @JsonProperty("counterpartyInfo")
    public void setCounterpartyInfo(CounterpartyInfo counterpartyInfo) {
        this.counterpartyInfo = counterpartyInfo;
    }

    @JsonProperty("orderList")
    public OrderList getOrderList() {
        return orderList;
    }

    @JsonProperty("orderList")
    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }

    @JsonProperty("_mar:type")
    public String getMarType() {
        return marType;
    }

    @JsonProperty("_mar:type")
    public void setMarType(String marType) {
        this.marType = marType;
    }

    @JsonProperty("_com:id")
    public String getComId() {
        return comId;
    }

    @JsonProperty("_com:id")
    public void setComId(String comId) {
        this.comId = comId;
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
