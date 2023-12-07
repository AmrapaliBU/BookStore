package com.BookStore.bookstore.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BookStore.bookstore.dao.BookRepositoy;
import com.BookStore.bookstore.model.Book;

@Service
public class BookService {

    @Autowired
    private BookRepositoy bookRepository;

    public Book getBookById(Integer id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null); 
    }

    public List<Book> getBooksByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public List<Book> getBooksByType(String type) {
        return bookRepository.findByType(type);
    }

    public List<Book> getBooksByPublishingDate(LocalDate publishingDate) {
        return bookRepository.findByPublishingDate(publishingDate);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
