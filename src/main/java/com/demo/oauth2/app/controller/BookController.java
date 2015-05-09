package com.demo.oauth2.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.demo.oauth2.app.service.BookService;
import com.demo.oauth2.app.wrapper.BookWrapper;
import com.demo.oauth2.app.wrapper.SuccessWrapper;

@Controller("bookController")
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody BookWrapper fetchBookById(@PathVariable("id") Long id) {
		BookWrapper bookWrapper = bookService.fetchBookById(id);
		return bookWrapper;
	}

	@RequestMapping(value = "all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody List<BookWrapper> fetchAllBooks() {
		List<BookWrapper> bookWrapList = bookService.fetchAllBooks();
		return bookWrapList;
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.CREATED)
	public @ResponseBody BookWrapper createBook(@RequestBody BookWrapper bookWrapper) {
		bookWrapper = bookService.createBook(bookWrapper);
		return bookWrapper;
	}

	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody BookWrapper updateBook(@RequestBody BookWrapper bookWrapper) {
		bookWrapper = bookService.updateBook(bookWrapper);
		return bookWrapper;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody SuccessWrapper deleteBookById(@PathVariable("id") Long id) {
		return bookService.deleteBookById(id);
	}
}
