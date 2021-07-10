package com.adamwong.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adamwong.lookify.models.Lookify;
import com.adamwong.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	   private LookifyRepository lookifyRepository;
	    
	    public LookifyService(LookifyRepository lookifyRepository) {
	        this.lookifyRepository = lookifyRepository;
	    }
	    // returns all the books
	    public List<Lookify> allSongs() {
	        return lookifyRepository.findAll();
	    }
	    // creates a book
	    public Lookify createSong(Lookify song) {
	        return lookifyRepository.save(song);
	    }
	    // retrieves a book
	    public Lookify findSong(Long id) {
	        Optional<Lookify> optionalSong = lookifyRepository.findById(id);
	        if(optionalSong.isPresent()) {
	            return optionalSong.get();
	        } else {
	            return null;
	        }
	    }
	    public Lookify updateLanguage(Long id, Lookify song) {
	    	return this.lookifyRepository.save(song);
	    }
	    
	    public void destroyLanguage(Long id) {
	        this.lookifyRepository.deleteById(id);
	    }
	    
	    public Lookify findLanguageByIndex(Long id) {
	    	return this.lookifyRepository.findById(id).orElse(null);
	    }
}
