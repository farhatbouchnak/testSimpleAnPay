package com.jwt.test;

import javax.xml.ws.Endpoint;

import com.jwt.serviceImpl.MarchandServiceImpl;
import com.jwt.serviceImpl.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/soapTest/services/marchands?wsdl", new MarchandServiceImpl());
		//Endpoint.publish("http://localhost:8080/soapTest/services/products?wsdl", new ProductServiceImpl());
	}
}
