package com.gconsulting.rest.model;

import org.json.JSONObject;

public class BTCEPairs {

	private Integer server_time;
	private String pairs;

	public BTCEPairs() {
		super();
	}

	public BTCEPairs(Integer server_time, String pairs) {
		super();
		this.server_time = server_time;
		this.pairs = pairs;
	}

	public Integer getServer_time() {
		return server_time;
	}

	public void setServer_time(Integer server_time) {
		this.server_time = server_time;
	}

	public String getPairs() {
		return pairs;
	}

	public void setPairs(String pairs) {
		this.pairs = pairs;
	}

}
