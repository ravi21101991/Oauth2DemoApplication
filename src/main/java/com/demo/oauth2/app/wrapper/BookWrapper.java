package com.demo.oauth2.app.wrapper;

import com.demo.oauth2.app.model.Book;

public class BookWrapper {

	private Long id;
	private String isbn;
	private String title;
	private String subTitle;
	private String description;
	private String author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void wrapBook(Book book) {
		id = book.getId();
		isbn = book.getIsbn();
		title = book.getTitle();
		subTitle = book.getSubTitle();
		description = book.getDescription();
		author = book.getAuthor();
	}

	public Book unWrapBook(BookWrapper bookWrapper, Book book) {
		
		book.setId(bookWrapper.getId());
		book.setIsbn(bookWrapper.getIsbn());
		book.setTitle(bookWrapper.getTitle());
		book.setSubTitle(bookWrapper.getSubTitle());
		book.setDescription(bookWrapper.getDescription());
		book.setAuthor(bookWrapper.getAuthor());
		return book;
	}

}
