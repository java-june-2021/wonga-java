package com.adamwong.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adamwong.languages.models.Language;

//...
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
 // this method retrieves all the books from the database
 List<Language> findAll();
 // this method find a book by their description
// List<Language> findByDescriptionContaining(String search);
// // this method counts how many titles contain a certain string
// Long countByTitleContaining(String search);
// // this method deletes a book that starts with a specific title
// Long deleteByTitleStartingWith(String search);
}