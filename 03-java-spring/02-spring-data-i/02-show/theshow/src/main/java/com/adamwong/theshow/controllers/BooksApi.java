package com.adamwong.theshow.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adamwong.theshow.models.Book;
import com.adamwong.theshow.services.BookService;

@RestController
public class BooksApi {
    private final BookService bookService;
    public BooksApi(BookService bookService){ 
        this.bookService = bookService;
    }
    // other methods removed for brevity
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.GET)
    public Book get(@PathVariable("id") Long id) {
        return this.bookService.findBook(id);
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id, Book book) {
        return this.bookService.updateBook(id, book);
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.destroyBook(id);//This was previously "deletebook"
    }
}