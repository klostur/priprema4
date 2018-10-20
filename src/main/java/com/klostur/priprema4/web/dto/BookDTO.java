package com.klostur.priprema4.web.dto;

import java.util.ArrayList;
import java.util.List;


public class BookDTO {
	private Long id;
	private String name;
	private String genre;
	private List<AuthorDTO> authors = new ArrayList<>();
	
	public BookDTO(Long id, String name, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
	}
	

	public BookDTO() {
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

	public List<AuthorDTO> getAuthors() {
		return authors;
	}

	public void setAuthors(List<AuthorDTO> authors) {
		this.authors = authors;
	}
	
	
}
