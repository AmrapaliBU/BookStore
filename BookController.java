package com.BookStore.bookstore.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookStore.bookstore.model.Book;
import com.BookStore.bookstore.service.BookService;

@RestController
public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/get/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return service.getBookById(id);
    }

    @GetMapping("/getByTitle/{title}")
    public List<Book> getBooksByTitle(@PathVariable String title) {
        return service.getBooksByTitle(title);
    }
    
    @GetMapping("/getByAuthor/{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return service.getBooksByAuthor(author);
    }

    @GetMapping("/getByType/{type}")
    public List<Book> getBooksByType(@PathVariable String type) {
        return service.getBooksByType(type);
    }

    @GetMapping("/getByPublishingDate/{publishingDate}")
    public List<Book> getBooksByPublishingDate(@PathVariable LocalDate publishingDate) {
        return service.getBooksByPublishingDate(publishingDate);
    }

    @GetMapping("/getAll")
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }
}

