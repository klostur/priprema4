package com.klostur.priprema4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.klostur.priprema4.data.BookAuthorsRepository;
import com.klostur.priprema4.entities.Author;
import com.klostur.priprema4.entities.BookAuthors;

@Component
public class BookAuthorsService {
	@Autowired
	BookAuthorsRepository bookAuthorsRepository;

	public Page<BookAuthors> findAll(Pageable page) {
		return bookAuthorsRepository.findAll(page);
	}
	
	
}
