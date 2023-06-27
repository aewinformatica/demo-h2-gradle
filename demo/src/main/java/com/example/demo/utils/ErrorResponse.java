package com.example.demo.utils;

import java.util.Map;

public class ErrorResponse {
    private int errorCode;
    private String errorMessage;
    private Map<String, Object> details;
    
    
    
	public ErrorResponse(int errorCode, String errorMessage, Map<String, Object> details) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.details = details;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Map<String, Object> getDetails() {
		return details;
	}
	public void setDetails(Map<String, Object> details) {
		this.details = details;
	}

    
}