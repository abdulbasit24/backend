package com.nagarro.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.entity.Author;
import com.nagarro.training.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService service;
	
	@GetMapping
	public List<Author> getAuthors() {
		return service.getAllAuthors();
	}
	
	@GetMapping("/{id}")
	public Author getAuthor(@PathVariable int id) {
		return service.getAuthorById(id);
	}
	
	@PostMapping
	public Author addAuthor(@RequestBody Author author) {
		return service.addAuthor(author);
	}
	
	@PutMapping
	public Author updateAuthor(@RequestBody Author author) {
		return service.updateAuthor(author);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAuthor(@PathVariable int id) {
		service.deleteAuthor(id);
	}
	
}
