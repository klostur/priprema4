package com.klostur.priprema4.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klostur.priprema4.entities.BookAuthors;

public interface BookAuthorsRepository extends JpaRepository<BookAuthors, Long>{
	
}
