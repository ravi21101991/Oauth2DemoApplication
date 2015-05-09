package com.demo.oauth2.app.exception;

import com.demo.oauth2.app.enums.ErrorMapping;

@SuppressWarnings("serial")
public class BookException extends RuntimeException {

	private String errorCode;
	private String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public BookException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public BookException(ErrorMapping errorMapping) {
		this.errorCode = errorMapping.getErrorCode();
		this.errorMessage = errorMapping.getErrorMessage();
	}
}
