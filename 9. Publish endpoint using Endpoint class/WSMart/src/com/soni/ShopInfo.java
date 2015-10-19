package com.soni;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.soni.exception.InvalidInputException;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookUpOutput")
	public String getShopInfo(@WebParam(partName="lookUpInput") String property) throws InvalidInputException {
		String response = null;
		if("name".equals(property))
			response = "WS Mart";
		else if("year".equals(property))
			response = "2014";
		else {
			throw new InvalidInputException("Invalid Input", property+" is not valid property");
		}
		return response;
	}
}
