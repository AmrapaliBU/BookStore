package com.BookStore.bookstore.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
@Id
//@Column(name = "publishing_date")

	private int id;
	private String title;
	private double price;
	private String author;
	private String type;
	private String description;
	private LocalDate publishingDate;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String title, double price, String author, String type, String description,
			LocalDate publishingDate) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
		this.type = type;
		this.description = description;
		this.publishingDate = publishingDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getPublishingDate() {
		return publishingDate;
	}
	public void setPublishingDate(LocalDate publishingDate) {
		this.publishingDate = publishingDate;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", author=" + author + ", type=" + type
				+ ", description=" + description + ", publishingDate=" + publishingDate + "]";
	}	
}
