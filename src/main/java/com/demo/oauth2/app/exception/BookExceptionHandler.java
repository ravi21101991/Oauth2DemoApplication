package com.demo.oauth2.app.exception;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.oauth2.app.wrapper.BookExceptionWrapper;

@ControllerAdvice
public class BookExceptionHandler {

	@ExceptionHandler(value = BookException.class)
	public @ResponseBody BookExceptionWrapper handleBookException(BookException be, HttpServletResponse response) {
		BookExceptionWrapper bookExceptionWrapper = new BookExceptionWrapper();
		bookExceptionWrapper.unwrapBookException(be);
		
		response.setStatus(getStatusCode(bookExceptionWrapper.getErrorCode()));
		return bookExceptionWrapper;
	}
	
	private int getStatusCode(String message){
		String strStatus = message.substring(3);
		int status = Integer.parseInt(strStatus);
		return status;
	}
}
