package com.demo.oauth2.app.wrapper;

import com.demo.oauth2.app.exception.BookException;

public class BookExceptionWrapper {
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

	public void unwrapBookException(BookException bookException) {
		errorCode = bookException.getErrorCode();
		errorMessage = bookException.getErrorMessage();
	}
}
