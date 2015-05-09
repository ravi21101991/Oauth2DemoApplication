package com.demo.oauth2.app.dao;

import java.util.List;

import com.demo.oauth2.app.model.Book;

public interface BookDao {

	Book fetchBookById(Long id);

	List<Book> fetchAllBooks();

	Book createBook(Book book);

	Book updateBook(Book book);

	void deleteBookById(Long id);
}
