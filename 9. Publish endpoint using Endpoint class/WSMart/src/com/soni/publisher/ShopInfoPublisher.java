package com.soni.publisher;

import javax.xml.ws.Endpoint;

import com.soni.ShopInfo;

public class ShopInfoPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/shopInfo", new ShopInfo());
	}
}
