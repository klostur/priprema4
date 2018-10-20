package com.klostur.priprema4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.klostur.priprema4.data.AuthorRepository;
import com.klostur.priprema4.entities.Author;

@Component
public class AuthorService {
	@Autowired
	AuthorRepository authorRepository;

	public List<Author> findAll() {
		return authorRepository.findAll();
	}


	public Page<Author> findAll(Pageable page) {
		return authorRepository.findAll(page);
	}
}
