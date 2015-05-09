package com.demo.oauth2.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	private Long id;
	private String isbn;
	private String title;
	private String subTitle;
	private String description;
	private String author;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "isbn")
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String iSBN) {
		isbn = iSBN;
	}

	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "sub_title")
	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", title=");
		builder.append(title);
		builder.append(", subTitle=");
		builder.append(subTitle);
		builder.append(", description=");
		builder.append(description);
		builder.append(", author=");
		builder.append(author);
		builder.append("]");
		return builder.toString();
	}
}
