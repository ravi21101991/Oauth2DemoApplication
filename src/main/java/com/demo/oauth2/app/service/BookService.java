package com.demo.oauth2.app.service;

import java.util.List;

import com.demo.oauth2.app.wrapper.BookWrapper;
import com.demo.oauth2.app.wrapper.SuccessWrapper;

public interface BookService {

	BookWrapper fetchBookById(Long id);

	List<BookWrapper> fetchAllBooks();

	BookWrapper createBook(BookWrapper bookWrapper);

	BookWrapper updateBook(BookWrapper bookWrapper);

	SuccessWrapper deleteBookById(Long id);
}
