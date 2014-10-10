package com.gconsulting.webapp.model;

import java.util.List;

import com.gconsulting.model.Exchange;
import com.gconsulting.model.Market;

public class Arbs {

	private Double value;
	private Market market;
	private Exchange startExchange;
	private Exchange endExchange;
	private List<Trade> startTrade;
	private List<Trade> endTrade;
	private Trade transferTrade;

	public Arbs() {
		super();
	}

	public Arbs(Double value, Market market, Exchange startExchange,
			Exchange endExchange, List<Trade> startTrade, List<Trade> endTrade,
			Trade transferTrade) {
		super();
		this.value = value;
		this.market = market;
		this.startExchange = startExchange;
		this.endExchange = endExchange;
		this.startTrade = startTrade;
		this.endTrade = endTrade;
		this.transferTrade = transferTrade;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Exchange getStartExchange() {
		return startExchange;
	}

	public void setStartExchange(Exchange startExchange) {
		this.startExchange = startExchange;
	}

	public Exchange getEndExchange() {
		return endExchange;
	}

	public void setEndExchange(Exchange endExchange) {
		this.endExchange = endExchange;
	}

	public List<Trade> getStartTrade() {
		return startTrade;
	}

	public void setStartTrade(List<Trade> startTrade) {
		this.startTrade = startTrade;
	}

	public List<Trade> getEndTrade() {
		return endTrade;
	}

	public void setEndTrade(List<Trade> endTrade) {
		this.endTrade = endTrade;
	}

	public Trade getTransferTrade() {
		return transferTrade;
	}

	public void setTransferTrade(Trade transferTrade) {
		this.transferTrade = transferTrade;
	}
}
