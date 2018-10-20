package com.klostur.priprema4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.klostur.priprema4.data.BookRepository;
import com.klostur.priprema4.entities.Book;
import com.klostur.priprema4.web.dto.BookDTO;

@Component
public class BookService {
	@Autowired
	BookRepository bookRepository;

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book save(Book book) {
		return bookRepository.save(book);
	}

	public Book findOne(Long id) {
		return bookRepository.findOne(id);
	}

	public void delete(Long id) {
		bookRepository.delete(id);
	}
	
	
}
