package com.BookStore.bookstore.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.BookStore.bookstore.model.Book;

@Repository
public interface BookRepositoy extends JpaRepository<Book, Integer> {
	
	public List<Book> findByTitle(String title);

	public List<Book> findByAuthor(String author);

	public List<Book> findByType(String type);

	public List<Book> findByPublishingDate(LocalDate publishingDate);

}
