package com.adamwong.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adamwong.productsandcategories.models.Category;
import com.adamwong.productsandcategories.models.Product;
import com.adamwong.productsandcategories.services.ProductsandcategoriesService;

@Controller
public class ProductsandcategoriesController {
	private final ProductsandcategoriesService productcategoryService;
	public ProductsandcategoriesController(ProductsandcategoriesService service) {
		this.productcategoryService = service;	
	}
	@RequestMapping("/")
	public String showAll(Model model) {
		model.addAttribute("products", productcategoryService.allProducts());
		return "ShowEverything.jsp";
	}
	@RequestMapping("/products/new")
	public String addNewProduct(@ModelAttribute("product") Product product) {
		return "NewProduct.jsp";
	}
	@PostMapping("/products/new")
	public String CreateNewProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "NewProduct.jsp";
		}
		this.productcategoryService.createProduct(product);
		return"redirect:/";
	}
	@RequestMapping("/categories/new")
	public String addNewCategory(@ModelAttribute("category") Category category) {
		return "NewCategory.jsp";
	}
	@PostMapping("/categories/new")
	public String CreateNewCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "NewCategory.jsp";
		}
		this.productcategoryService.createCategory(category);
		return"redirect:/";
	}
}