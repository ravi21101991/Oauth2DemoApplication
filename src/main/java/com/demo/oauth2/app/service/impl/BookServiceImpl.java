package com.demo.oauth2.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.oauth2.app.dao.BookDao;
import com.demo.oauth2.app.enums.ErrorMapping;
import com.demo.oauth2.app.exception.BookException;
import com.demo.oauth2.app.model.Book;
import com.demo.oauth2.app.service.BookService;
import com.demo.oauth2.app.wrapper.BookWrapper;
import com.demo.oauth2.app.wrapper.SuccessWrapper;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	@Transactional(readOnly = true)
	public BookWrapper fetchBookById(Long id) {
		Book book = bookDao.fetchBookById(id);
		if (book == null) {
			throw new BookException(ErrorMapping.BOOK_NOT_FOUND);
		}

		BookWrapper bookWrapper = new BookWrapper();
		bookWrapper.wrapBook(book);
		return bookWrapper;
	}

	@Override
	@Transactional(readOnly = true)
	public List<BookWrapper> fetchAllBooks() {
		List<Book> bookList = bookDao.fetchAllBooks();
		if (bookList == null || bookList.isEmpty()) {
			throw new BookException(ErrorMapping.BOOKS_NOT_FOUND);
		}
		List<BookWrapper> bookWrapList = new ArrayList<BookWrapper>();
		for (Book book : bookList) {
			BookWrapper bookWrapper = new BookWrapper();
			bookWrapper.wrapBook(book);
			bookWrapList.add(bookWrapper);
		}
		return bookWrapList;
	}

	@Override
	@Transactional
	public BookWrapper createBook(BookWrapper bookWrapper) {
		Book book = bookWrapper.unWrapBook(bookWrapper, new Book());
		book = bookDao.createBook(book);
		bookWrapper.wrapBook(book);
		return bookWrapper;
	}

	@Override
	@Transactional
	public BookWrapper updateBook(BookWrapper bookWrapper) {
		if(bookWrapper.getId() == null){
			return createBook(bookWrapper);
		}
		Book book = bookDao.fetchBookById(bookWrapper.getId());
		if (book == null) {
			throw new BookException(ErrorMapping.BOOK_NOT_FOUND);
		}
		
		book = bookWrapper.unWrapBook(bookWrapper, book);
		book = bookDao.updateBook(book);
		bookWrapper.wrapBook(book);
		return bookWrapper;
	}

	@Override
	@Transactional
	public SuccessWrapper deleteBookById(Long id) {
		Book book = bookDao.fetchBookById(id);
		if (book == null) {
			throw new BookException(ErrorMapping.BOOK_NOT_FOUND);
		}
		
		bookDao.deleteBookById(id);
		return new SuccessWrapper("The book was deleted successfully");
	}

}
