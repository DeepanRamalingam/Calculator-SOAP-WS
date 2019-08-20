package com.stackroute;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface Calculator {
	
	@WebMethod
	public int add(int a, int b);
	@WebMethod
	public int diff(int a, int b);
	@WebMethod
	public long product(int a, int b);
	@WebMethod
	public float div(int a, int b);
}
