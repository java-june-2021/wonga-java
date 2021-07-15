package com.adamwong.productsandcategories.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adamwong.productsandcategories.models.Category;
import com.adamwong.productsandcategories.models.Product;
import com.adamwong.productsandcategories.repositories.CategoryRepository;
import com.adamwong.productsandcategories.repositories.ProductRepository;

@Service
public class ProductsandcategoriesService {
	private final CategoryRepository categoryRepo;
	private final ProductRepository productRepo;
//	why in the world do they do this?
	public ProductsandcategoriesService(CategoryRepository cRepository, ProductRepository pRepository) {
		this.categoryRepo = cRepository;
		this.productRepo = pRepository;
	}
	
	public Category createCategory (Category category) {
		return categoryRepo.save(category);
	}

	public Product createProduct (Product product) {
		return productRepo.save(product);
	}
	public List<Category> allCategories(){
		return categoryRepo.findAll();
	}
	public List<Product> allProducts(){
		return productRepo.findAll();
	}
	public Category findCategory(Long id) {
		return this.categoryRepo.findById(id).orElse(null);
	}

	public Product findProduct(Long id) {
		return this.productRepo.findById(id).orElse(null);
	}
	public void destroyCategory(Long id) {
		this.categoryRepo.deleteById(id);
	}
	public void destroyProduct(Long id) {
		this.productRepo.deleteById(id);
	}
	public Category addProdtoCategory(Category category, Product product) {
		List<Product> products = category.getProducts();
		products.add(product);
		return categoryRepo.save(category);
	}
	
	public Product addCattoProduct(Product product, Category category) {
		List<Category> categories = product.getCategories();
		categories.add(category);
		return productRepo.save(product);
		
	}

}