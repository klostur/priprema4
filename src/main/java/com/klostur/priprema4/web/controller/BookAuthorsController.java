package com.klostur.priprema4.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klostur.priprema4.entities.Author;
import com.klostur.priprema4.entities.BookAuthors;
import com.klostur.priprema4.service.BookAuthorsService;

@RestController
public class BookAuthorsController {
	
	@Autowired
	BookAuthorsService bookAuthorsService;
	
	
	@GetMapping(value = "api/authors/books")
	public ResponseEntity<Page<BookAuthors>> findAllSorted(Pageable page) {
		Page<BookAuthors> authors = bookAuthorsService.findAll(page);
		return new ResponseEntity<Page<BookAuthors>>(authors, HttpStatus.OK);
	}
}
