package com.gconsulting.webapp.action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gconsulting.model.API;
import com.gconsulting.model.Exchange;
import com.gconsulting.model.FeeApiType;
import com.gconsulting.model.Market;
import com.gconsulting.model.ids.FeeApiId;
import com.gconsulting.service.ExchangeManager;

@SuppressWarnings("unchecked")
@Scope("request")
@Component("apisAction")
public class APIsAction extends BasePage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7276861502829761813L;
	private ExchangeManager exchangeManager;
	private API selectedAPI = new API();
	private String exchangeCode;
	private String type;

	@Autowired
	public void setExchangeManager(
			@Qualifier("exchangeManager") ExchangeManager exchangeManager) {
		this.exchangeManager = exchangeManager;
	}

	public APIsAction() {
		setSortColumn("exchange.code"); // sets the default sort column
	}

	public List<API> getAPIs() {
		return sort(exchangeManager.getAllApi());
	}

	public List<String> getExchanges() {

		List<String> exchangesString = new ArrayList<String>();
		List<Exchange> exchanges = exchangeManager.getAllExchange();
		for (Exchange exchange : exchanges) {
			exchangesString.add(exchange.getCode());
		}
		return exchangesString;
	}

	public List<String> getAPITypes() {

		List<String> typesString = new ArrayList<String>();
		List<FeeApiType> types = exchangeManager.getAllType();
		for (FeeApiType type : types) {
			typesString
					.add(type.getMarket().getCode() + " - " + type.getType());
		}
		return typesString;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public API getSelectedAPI() {
		return selectedAPI;
	}

	public void setSelectedAPI(API selectedAPI) {
		this.selectedAPI = selectedAPI;
	}

	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public String delete() {

		exchangeManager.delete(selectedAPI);
		addMessage("apis.deleted");
		return "list";
	}

	public String edit() {

		String typeType = null;
		String typeMarketCode = null;
		if (exchangeCode == null) {
			exchangeCode = new String(getParameter("exchangeCode"));
		}
		if (typeMarketCode == null) {
			typeMarketCode = new String(getParameter("marketCode"));
		}
		if (typeType == null) {
			typeType = new String(getParameter("type"));
		}
		type = typeMarketCode + " - " + typeType;
		Exchange selectedExchange = exchangeManager
				.getExchangeByCode(exchangeCode);
		Market selectedMarket = exchangeManager.getMarketByCode(typeMarketCode);
		FeeApiType apiType = new FeeApiType(typeType, selectedMarket);
		selectedAPI = exchangeManager.getApiById(new FeeApiId(selectedExchange,
				apiType));
		return "edit";
	}

	public String save() {

		String typeType = null;
		String typeMarketCode = null;
		String key = new String("");
		Exchange selectedExchange = exchangeManager
				.getExchangeByCode(exchangeCode);
		if (type != null) {
			if (type.length() > 0) {
				typeMarketCode = type.substring(0, type.indexOf(" - "));
				typeType = type.substring(type.indexOf(" - ") + 3);
			}
		}
		Market selectedMarket = exchangeManager.getMarketByCode(typeMarketCode);
		FeeApiType apiType = new FeeApiType(typeType, selectedMarket);
		selectedAPI.setExchange(selectedExchange);
		selectedAPI.setFeeType(apiType);
		boolean isUpdate = (exchangeManager.getApiById(new FeeApiId(selectedAPI
				.getExchange(), selectedAPI.getFeeType())) == null) ? false
				: true;
		if (!isUpdate) {
			exchangeManager.create(selectedAPI);
			key = "apis.added";
		} else {
			exchangeManager.update(selectedAPI);
			key = "apis.updated";
		}
		addMessage(key);
		return "list";
	}
}
