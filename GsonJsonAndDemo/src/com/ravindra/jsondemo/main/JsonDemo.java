package com.ravindra.jsondemo.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonDemo {
	public static void main(String[] args) {
		String url = "http://services.groupkt.com/state/get/IND/UP";

		String jsonResponse = JsonDemo.jsonDemoImple(url);
		
		JsonParser parser = new JsonParser();
		JsonObject jsonObject = (JsonObject) parser.parse(jsonResponse); /*parsing json object*/
		JsonObject userDemoObject = jsonObject.getAsJsonObject();/*parsing outer object*/
		JsonObject restResponse =  (JsonObject) userDemoObject.get("RestResponse"); /*/* fetching RestResponse object from json object*/
		JsonArray messages = restResponse.getAsJsonArray("messages"); /* fetching messages array from json object*/
		
		System.out.println(messages.get(0)); 
		

	}

	public static String jsonDemoImple(String url) {
		String inputLine;
		StringBuffer response = new StringBuffer();

		try {
			URL urlstring = new URL(url);
			URLConnection connection = (URLConnection) urlstring.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			while ((inputLine = reader.readLine()) != null) {
				response.append(inputLine);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response.toString();
	}

}
