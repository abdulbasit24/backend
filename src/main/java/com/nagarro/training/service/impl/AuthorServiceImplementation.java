package com.nagarro.training.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.training.entity.Author;
import com.nagarro.training.repository.AuthorRepository;
import com.nagarro.training.service.AuthorService;

@Service
public class AuthorServiceImplementation implements AuthorService{
	
	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}

	
	@Override
	public Author getAuthorById(int id) {
		Optional<Author> optional= authorRepository.findById(id);
		return optional.isPresent()?optional.get():null;
	}

	@Override
	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}

	@Override
	public Author updateAuthor(Author author) {
		return authorRepository.save(author);
	}


	@Override
	public void deleteAuthor(int id) {
		Optional<Author> optional= authorRepository.findById(id);
		if(optional.isPresent()) {
			authorRepository.delete(optional.get());
		}
	}

}
