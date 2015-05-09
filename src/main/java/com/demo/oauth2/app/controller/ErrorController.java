package com.demo.oauth2.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.oauth2.app.wrapper.ErrorWrapper;

@Controller
@RequestMapping(value = "/errors")
public class ErrorController {

	@RequestMapping("/resourcenotfound")
	public @ResponseBody ErrorWrapper sendNotFoundError(){
		return new ErrorWrapper("RS404", "The requested resource was not found.");
	}
	
	@RequestMapping("/unauthorised")
	public @ResponseBody ErrorWrapper unauthorise(){
		return new ErrorWrapper("UN401", "You are not authorised to access this resource.");
	}
	
}
