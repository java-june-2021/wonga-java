package com.adamwong.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("categories", productcategoryService.allCategories());
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
	@RequestMapping("/products/{id}")
	public String showSingleProduct(@PathVariable("id") Long id, Model model){
		model.addAttribute("product", this.productcategoryService.findProduct(id));
		model.addAttribute("categories", productcategoryService.allCategories());
		return"ShowProduct.jsp";
	}

	@PostMapping("/category/update/{id}")
	public String updateProduct(@RequestParam("categoryName") Long catName, @PathVariable("id") Long id, Model model) {
		Product product = this.productcategoryService.findProduct(id);
		Category category = this.productcategoryService.findCategory(catName);
		this.productcategoryService.addCattoProduct(product, category);
		return"redirect:/products/{id}";
	}
	
	@RequestMapping("/products/delete/{id}")
	public String destroyProduct(@PathVariable("id")Long id) {
		productcategoryService.destroyProduct(id);
		return "redirect:/";
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
//	
	@RequestMapping("/categories/{id}")
	public String showSingleCategory(@PathVariable("id") Long id, Model model){
		model.addAttribute("category", this.productcategoryService.findCategory(id));
		model.addAttribute("products", productcategoryService.allProducts());
		return"ShowCategory.jsp";
	}

	@PostMapping("/product/update/{id}")
	public String updateCategory(@RequestParam("productName") Long prodName, @PathVariable("id") Long id, Model model) {
		Category category = this.productcategoryService.findCategory(id);
		Product product = this.productcategoryService.findProduct(prodName);
		this.productcategoryService.addProdtoCategory(category, product);
		return"redirect:/categories/{id}";
	}
	
	@RequestMapping("/categories/delete/{id}")
	public String destroyCategory(@PathVariable("id")Long id) {
		productcategoryService.destroyCategory(id);
		return "redirect:/";
	}

}