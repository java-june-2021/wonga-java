package com.adamwong.languages.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adamwong.languages.models.Language;
import com.adamwong.languages.repositories.LanguageRepository;
@Service
public class LanguageService {
    // adding the book repository as a dependency
   private LanguageRepository languageRepository;
    
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    // returns all the books
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    // creates a book
    public Language createLanguage(Language language) {
    	System.out.println(language);
        return languageRepository.save(language);
    }
    // retrieves a book
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    public Language updateLanguage(Long id, Language language) {
    	return this.languageRepository.save(language);
//        if (id < books.size()){
//            books.set(id, book);
//        }
    }
    
    public void destroyLanguage(Long id) {
    	System.out.println(id);
        this.languageRepository.deleteById(id);
    }
    
    public Language findLanguageByIndex(Long id) {
    	return this.languageRepository.findById(id).orElse(null);
//        if (index < books.size()){
//            return books.get(index);
//        }else{
//            return null;
//        }
    }
}