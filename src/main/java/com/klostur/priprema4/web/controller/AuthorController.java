package com.klostur.priprema4.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klostur.priprema4.entities.Author;
import com.klostur.priprema4.service.AuthorService;
import com.klostur.priprema4.web.dto.AuthorDTO;

@RestController
public class AuthorController {
	@Autowired
	AuthorService authorService;
	
	@GetMapping(value = "api/authors")
	public ResponseEntity<List<AuthorDTO>> findAll() {
		List<Author> authors = authorService.findAll(); 
		List<AuthorDTO> retVal = convertAuthorsToDTO(authors);
		return new ResponseEntity<List<AuthorDTO>>(retVal,HttpStatus.OK);
	}
	
	private List<AuthorDTO> convertAuthorsToDTO(List<Author> authors){
		List<AuthorDTO> retVal = new ArrayList<>();
		for (Author a : authors) {
			retVal.add(convertAuthorToDTO(a));
		}
		return retVal;
	}
	private AuthorDTO convertAuthorToDTO(Author author) {
		AuthorDTO retVal = new AuthorDTO(author.getId(), author.getFirstName(), author.getLastName());
		return retVal;
	}
}
