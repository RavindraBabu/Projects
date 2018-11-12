package com.ravindra.jsondemo.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.jws.soap.SOAPBinding.Use;

import com.google.gson.Gson;
import com.ravindra.jsondemo.users.GsonUserDemo;

public class GsonDemo {

	public static void main(String[] args) {
		String url = "http://services.groupkt.com/state/get/IND/UP";
		GsonUserDemo user = GsonDemo.gsonDemoImpl(url);

		if (user != null) {
			System.out.println(user.getRestResponse().getMessages().get(0));
		}
	}

	public static GsonUserDemo gsonDemoImpl(String url) {
		GsonUserDemo user = null;
		Gson gson = new Gson();

		try {
			URL urlstring = new URL(url);
			URLConnection connection = (URLConnection) urlstring.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			user = gson.fromJson(reader, GsonUserDemo.class);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;

	}

}
