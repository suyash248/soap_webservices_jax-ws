package com.soni.exception;

public class InvalidInputException extends Exception {

	private static final long serialVersionUID = -8415140966182168867L;
	private String errorDetails;
	
	public InvalidInputException(String reason, String errorDetails) {
		super(reason);
		this.errorDetails = errorDetails;
	}
	
	public String getFaultInfo() {
		return errorDetails;
	}
}
