package com.klostur.priprema4.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.klostur.priprema4.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{


}
