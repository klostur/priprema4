package com.klostur.priprema4.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klostur.priprema4.entities.Author;
import com.klostur.priprema4.entities.Book;
import com.klostur.priprema4.entities.BookAuthors;
import com.klostur.priprema4.service.AuthorService;
import com.klostur.priprema4.service.BookService;
import com.klostur.priprema4.web.dto.AuthorDTO;
import com.klostur.priprema4.web.dto.BookDTO;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	@Autowired
	AuthorService authorService;
	
	
	@RequestMapping(value = "/api/test")
	public ResponseEntity<String> test() {
		String test = "Sve ok.";
		return new ResponseEntity<String>(test, HttpStatus.OK);
	}
	@GetMapping(value = "/api/books")
	public ResponseEntity<List<BookDTO>> findAll() {
		List<BookDTO> retVal = convertBooksToDTO(bookService.findAll());
		return new ResponseEntity<List<BookDTO>> (retVal, HttpStatus.OK);
		
	}
	@PostMapping(value = "/api/books")
	public ResponseEntity<BookDTO> save(@RequestBody BookDTO bookDTO) {
		Book book = new Book();
		book.setId(bookDTO.getId());
		book.setName(bookDTO.getName());
		book.setGenre(bookDTO.getGenre());
		
		Book retVal = bookService.save(book);
		return new ResponseEntity<>(bookDTO, HttpStatus.CREATED);
	}
	@PutMapping(value = "/api/books/{id}")
	public ResponseEntity<BookDTO> update(@PathVariable Long id, @RequestBody BookDTO bookDTO) {
		Book book = bookService.findOne(id);
		
		if (book == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			book.setId(id);
			book.setName(bookDTO.getName());
			book.setGenre(bookDTO.getGenre());
			
			book = bookService.save(book);
			return new ResponseEntity<BookDTO>(bookDTO, HttpStatus.OK);
		}
	}
	@DeleteMapping(value = "/api/books/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		Book book = bookService.findOne(id);
		if (book == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			bookService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}
	
	private List<BookDTO> convertBooksToDTO(List<Book> books) {
		List<BookDTO> retVal = new ArrayList<>();
		for (Book book : books) {
			retVal.add(convertBookToDTO(book));
		}
		return retVal;
	}
	private BookDTO convertBookToDTO(Book book) {
		BookDTO retVal = new BookDTO(book.getId(), book.getName(), book.getGenre());
		List<AuthorDTO> authorsDTO = new ArrayList<>();
		for (BookAuthors a : book.getAuthors()) {
			AuthorDTO authorDTO = new AuthorDTO(a.getAuthor1().getId(), a.getAuthor1().getFirstName(), a.getAuthor1().getLastName());
			authorsDTO.add(authorDTO);
		}
		retVal.setAuthors(authorsDTO);
		return retVal;
	}
}
