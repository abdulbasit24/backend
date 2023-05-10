package com.nagarro.training.service;

import java.util.List;

import com.nagarro.training.entity.Author;


public interface AuthorService {

	public List<Author> getAllAuthors();
		
	

	public Author getAuthorById(int id) ;

	public Author addAuthor(Author author) ;

	public Author updateAuthor(Author author) ;

	public void deleteAuthor(int id);

}
