package com.gconsulting.rest;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONArray;
import org.json.JSONObject;

import com.gconsulting.rest.model.AllCoinPairs;
import com.gconsulting.rest.model.BTCEPairs;
import com.google.gson.Gson;

public class ReadTest {

	private static final String ALLCOIN_URL = "https://www.allcoin.com/api2/pairs";
	private static final String BTCE_URL = "https://btc-e.com/api/3/info";

	public static void main(String[] args) {

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI(BTCE_URL));
		Builder builder = target.request(
				MediaType.APPLICATION_JSON_TYPE);
		Response response = builder.get();
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		System.out.println("URI: " + target.getUri().toString());
		System.out.println("Server response: " + response.toString());
		String responseString = response.readEntity(String.class);
		System.out.println("Response: " + responseString);
//		JSONObject resultJSON = new JSONObject(responseString);
//		System.out.println("Code: " + resultJSON.getInt("code"));
//		JSONObject data = resultJSON.getJSONObject("data");
//		JSONArray names = data.names();
//		for (int i = 0; i < names.length(); i++) {
//			System.out.println(names.get(i));				
//		}
//		AllCoinPairs pairs = new Gson().fromJson(resonseString, AllCoinPairs.class);
//		System.out.println("Code: " + pairs.getCode());
//		System.out.println("Data: " + pairs.getData());
		BTCEPairs pairs = new Gson().fromJson(responseString, BTCEPairs.class);
		System.out.println("ServerTime: " + pairs.getServer_time());
		System.out.println("Pairs: " + pairs.getPairs());
//		JSONArray names = pairs.getPairs().names();
//		for (int i = 0; i < names.length(); i++) {
//			System.out.println(names.get(i));				
//		}
}

	private static URI getBaseURI(String url) {

		return UriBuilder.fromUri(url).build();
	}
}
