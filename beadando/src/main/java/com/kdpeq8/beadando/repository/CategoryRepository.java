package com.kdpeq8.beadando.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kdpeq8.beadando.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
}
