package com.adamwong.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.adamwong.productsandcategories.models.Category;


public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();

}
