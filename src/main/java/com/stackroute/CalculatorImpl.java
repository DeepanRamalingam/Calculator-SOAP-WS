package com.stackroute;

import javax.jws.WebService;

@WebService(endpointInterface = "com.stackroute.Calculator")
public class CalculatorImpl implements Calculator {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int diff(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public long product(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public float div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
