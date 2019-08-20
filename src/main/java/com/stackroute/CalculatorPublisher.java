package com.stackroute;

import javax.xml.ws.Endpoint;

public class CalculatorPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endpoint.publish("http://localhost:7779/ws/calc", new CalculatorImpl());
	}

}
