package com.gconsulting.webapp.model;

import com.gconsulting.model.Market;

public class Trade {

	private Market market;
	private Double quantity;
	private Double price;
	private Double fee;

	public Trade() {
		super();
	}

	public Trade(Market market, Double quantity, Double price, Double fee) {
		super();
		this.market = market;
		this.quantity = quantity;
		this.price = price;
		this.fee = fee;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
}
