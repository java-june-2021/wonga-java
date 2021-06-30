package com.adamwong.theshow.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adamwong.theshow.models.Book;
import com.adamwong.theshow.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
   private BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Book updateBook(Long id, Book book) {
    	return this.bookRepository.save(book);
//        if (id < books.size()){
//            books.set(id, book);
//        }
    }
    
    public void destroyBook(Long id) {
        this.bookRepository.deleteById(id);
//    	if (id < books.size()){
//            books.remove(id);
//        }
    }
    
    public Book findBookByIndex(Long id) {
    	return this.bookRepository.findById(id).orElse(null);
//        if (index < books.size()){
//            return books.get(index);
//        }else{
//            return null;
//        }
    }
}