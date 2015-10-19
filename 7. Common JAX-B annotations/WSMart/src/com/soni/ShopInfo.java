package com.soni;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookUpOutput")
	public String getShopInfo(@WebParam(partName="lookUpInput") String property) {
		String response = "Invalid property";
		if("name".equals(property))
			response = "WS Mart";
		else if("year".equals(property))
			response = "2014";
		return response;
	}
}
