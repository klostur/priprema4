package com.klostur.priprema4.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klostur.priprema4.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
