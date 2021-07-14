package com.adamwong.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.adamwong.productsandcategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();

}