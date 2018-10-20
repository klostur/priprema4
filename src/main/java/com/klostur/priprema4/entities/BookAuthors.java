package com.klostur.priprema4.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookAuthors {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Book book;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Author author;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Author getAuthor1() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	
	

	
	
}
