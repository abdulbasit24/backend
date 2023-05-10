package com.nagarro.training.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int ID;
	private String author;
	private String book;
	private LocalDate date;

	@PrePersist
	public void prePersist() {
		setDate(LocalDate.now());
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return this.ID;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.ID = id;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the book
	 */
	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
