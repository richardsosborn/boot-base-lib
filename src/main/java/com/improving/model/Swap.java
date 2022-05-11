
package com.improving.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NONNULL)
@JsonPropertyOrder({
    "clientIdentifier",
    "currencyPair",
    "givenAmount",
    "USICode",
    "tradeDate",
    "valueDate",
    "NDFFlag",
    "rate",
    "allInRate",
    "settleAmount",
    "status",
    "action",
    "acceptedTimestamp",
    "rateMkt",
    "diffSpot",
    "diffFwd",
    "clientRate",
    "clientAllInRate",
    "com:side",
    "com:nearOrFar",
    "com:id",
    "com:readableId",
    "prefix",
    "swapPts",
    "clientSwapPts"
})
public class Swap {

    @JsonProperty("clientIdentifier")
    private ClientIdentifier clientIdentifier;
    @JsonProperty("currencyPair")
    private CurrencyPair currencyPair;
    @JsonProperty("givenAmount")
    private GivenAmount givenAmount;
    @JsonProperty("USICode")
    private USICode uSICode;
    @JsonProperty("tradeDate")
    private TradeDate tradeDate;
    @JsonProperty("valueDate")
    private ValueDate valueDate;
    @JsonProperty("NDFFlag")
    private NDFFlag nDFFlag;
    @JsonProperty("rate")
    private Rate rate;
    @JsonProperty("allInRate")
    private AllInRate allInRate;
    @JsonProperty("settleAmount")
    private SettleAmount settleAmount;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("action")
    private Action action;
    @JsonProperty("acceptedTimestamp")
    private AcceptedTimestamp acceptedTimestamp;
    @JsonProperty("rateMkt")
    private RateMkt rateMkt;
    @JsonProperty("diffSpot")
    private DiffSpot diffSpot;
    @JsonProperty("diffFwd")
    private DiffFwd diffFwd;
    @JsonProperty("clientRate")
    private ClientRate clientRate;
    @JsonProperty("clientAllInRate")
    private ClientAllInRate clientAllInRate;
    @JsonProperty("com:side")
    private String comSide;
    @JsonProperty("com:nearOrFar")
    private String comNearOrFar;
    @JsonProperty("com:id")
    private String comId;
    @JsonProperty("com:readableId")
    private String comReadableId;
    @JsonProperty("prefix")
    private String prefix;
    @JsonProperty("swapPts")
    private SwapPts swapPts;
    @JsonProperty("clientSwapPts")
    private ClientSwapPts clientSwapPts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clientIdentifier")
    public ClientIdentifier getClientIdentifier() {
        return clientIdentifier;
    }

    @JsonProperty("clientIdentifier")
    public void setClientIdentifier(ClientIdentifier clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }

    @JsonProperty("currencyPair")
    public CurrencyPair getCurrencyPair() {
        return currencyPair;
    }

    @JsonProperty("currencyPair")
    public void setCurrencyPair(CurrencyPair currencyPair) {
        this.currencyPair = currencyPair;
    }

    @JsonProperty("givenAmount")
    public GivenAmount getGivenAmount() {
        return givenAmount;
    }

    @JsonProperty("givenAmount")
    public void setGivenAmount(GivenAmount givenAmount) {
        this.givenAmount = givenAmount;
    }

    @JsonProperty("USICode")
    public USICode getUSICode() {
        return uSICode;
    }

    @JsonProperty("USICode")
    public void setUSICode(USICode uSICode) {
        this.uSICode = uSICode;
    }

    @JsonProperty("tradeDate")
    public TradeDate getTradeDate() {
        return tradeDate;
    }

    @JsonProperty("tradeDate")
    public void setTradeDate(TradeDate tradeDate) {
        this.tradeDate = tradeDate;
    }

    @JsonProperty("valueDate")
    public ValueDate getValueDate() {
        return valueDate;
    }

    @JsonProperty("valueDate")
    public void setValueDate(ValueDate valueDate) {
        this.valueDate = valueDate;
    }

    @JsonProperty("NDFFlag")
    public NDFFlag getNDFFlag() {
        return nDFFlag;
    }

    @JsonProperty("NDFFlag")
    public void setNDFFlag(NDFFlag nDFFlag) {
        this.nDFFlag = nDFFlag;
    }

    @JsonProperty("rate")
    public Rate getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(Rate rate) {
        this.rate = rate;
    }

    @JsonProperty("allInRate")
    public AllInRate getAllInRate() {
        return allInRate;
    }

    @JsonProperty("allInRate")
    public void setAllInRate(AllInRate allInRate) {
        this.allInRate = allInRate;
    }

    @JsonProperty("settleAmount")
    public SettleAmount getSettleAmount() {
        return settleAmount;
    }

    @JsonProperty("settleAmount")
    public void setSettleAmount(SettleAmount settleAmount) {
        this.settleAmount = settleAmount;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("action")
    public Action getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(Action action) {
        this.action = action;
    }

    @JsonProperty("acceptedTimestamp")
    public AcceptedTimestamp getAcceptedTimestamp() {
        return acceptedTimestamp;
    }

    @JsonProperty("acceptedTimestamp")
    public void setAcceptedTimestamp(AcceptedTimestamp acceptedTimestamp) {
        this.acceptedTimestamp = acceptedTimestamp;
    }

    @JsonProperty("rateMkt")
    public RateMkt getRateMkt() {
        return rateMkt;
    }

    @JsonProperty("rateMkt")
    public void setRateMkt(RateMkt rateMkt) {
        this.rateMkt = rateMkt;
    }

    @JsonProperty("diffSpot")
    public DiffSpot getDiffSpot() {
        return diffSpot;
    }

    @JsonProperty("diffSpot")
    public void setDiffSpot(DiffSpot diffSpot) {
        this.diffSpot = diffSpot;
    }

    @JsonProperty("diffFwd")
    public DiffFwd getDiffFwd() {
        return diffFwd;
    }

    @JsonProperty("diffFwd")
    public void setDiffFwd(DiffFwd diffFwd) {
        this.diffFwd = diffFwd;
    }

    @JsonProperty("clientRate")
    public ClientRate getClientRate() {
        return clientRate;
    }

    @JsonProperty("clientRate")
    public void setClientRate(ClientRate clientRate) {
        this.clientRate = clientRate;
    }

    @JsonProperty("clientAllInRate")
    public ClientAllInRate getClientAllInRate() {
        return clientAllInRate;
    }

    @JsonProperty("clientAllInRate")
    public void setClientAllInRate(ClientAllInRate clientAllInRate) {
        this.clientAllInRate = clientAllInRate;
    }

    @JsonProperty("com:side")
    public String getComSide() {
        return comSide;
    }

    @JsonProperty("com:side")
    public void setComSide(String comSide) {
        this.comSide = comSide;
    }

    @JsonProperty("com:nearOrFar")
    public String getComNearOrFar() {
        return comNearOrFar;
    }

    @JsonProperty("com:nearOrFar")
    public void setComNearOrFar(String comNearOrFar) {
        this.comNearOrFar = comNearOrFar;
    }

    @JsonProperty("com:id")
    public String getComId() {
        return comId;
    }

    @JsonProperty("com:id")
    public void setComId(String comId) {
        this.comId = comId;
    }

    @JsonProperty("com:readableId")
    public String getComReadableId() {
        return comReadableId;
    }

    @JsonProperty("com:readableId")
    public void setComReadableId(String comReadableId) {
        this.comReadableId = comReadableId;
    }

    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @JsonProperty("swapPts")
    public SwapPts getSwapPts() {
        return swapPts;
    }

    @JsonProperty("swapPts")
    public void setSwapPts(SwapPts swapPts) {
        this.swapPts = swapPts;
    }

    @JsonProperty("clientSwapPts")
    public ClientSwapPts getClientSwapPts() {
        return clientSwapPts;
    }

    @JsonProperty("clientSwapPts")
    public void setClientSwapPts(ClientSwapPts clientSwapPts) {
        this.clientSwapPts = clientSwapPts;
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
