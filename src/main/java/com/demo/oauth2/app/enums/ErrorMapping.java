package com.demo.oauth2.app.enums;

public enum ErrorMapping {

	BOOK_NOT_FOUND("BNF404", "The requested book was not found."),
	BOOKS_NOT_FOUND("BNF204","No books were found.");
	
	private String errorCode;
	private String errorMessage;

	private ErrorMapping(String errorCode, String errorMessage) {
		this.setErrorCode(errorCode);
		this.setErrorMessage(errorMessage);
	}

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
}
