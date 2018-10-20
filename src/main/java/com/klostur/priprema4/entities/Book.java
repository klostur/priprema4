package com.klostur.priprema4.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String genre;
	@JsonIgnore
	@OneToMany(mappedBy="book", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<BookAuthors> authors = new ArrayList<>();
	
	public Book(Long id, String name, String genre ) {
		this.id = id;
		this.name = name;
		this.genre = genre;
	}
	public Book() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<BookAuthors> getAuthors() {
		return authors;
	}
	public void setAuthors(List<BookAuthors> authors) {
		this.authors = authors;
	}

	
	
	
}
