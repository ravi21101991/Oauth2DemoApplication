package com.demo.oauth2.app.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.oauth2.app.dao.BookDao;
import com.demo.oauth2.app.model.Book;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Book fetchBookById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = (Book) session.get(Book.class, id);
		return book;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> fetchAllBooks() {
		Session session = sessionFactory.getCurrentSession();
		List<Book> bookList = (List<Book>) session.createCriteria(Book.class).list();
		return bookList;
	}

	@Override
	public Book createBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.save(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(book);
		return book;
	}

	@Override
	public void deleteBookById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = (Book) session.get(Book.class, id);
		session.delete(book);
	}

}
