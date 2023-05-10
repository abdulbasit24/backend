package com.nagarro.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.training.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer>{

}
