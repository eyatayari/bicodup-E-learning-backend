package com.jra.pma.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jra.pma.models.exam.Category;
import com.jra.pma.services.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins="http://localhost:4200/")
public class CategoryController {
	@Autowired
	private CategoryService categoryservice;
	
	//add category
	@PostMapping("/add")
	public ResponseEntity<Category> addCategory(@RequestBody Category category)
	{
		Category category1 = this.categoryservice.addCategory(category);
		return ResponseEntity.ok(category1);
	}
	
	//get category
	@GetMapping("/{categoryId}")
	public Category getCategory(@PathVariable("categoryId") Long categoryId) {
		return this.categoryservice.getCategory(categoryId);
		
	}
	
	//get categories 
	
	@GetMapping("/")
	public  ResponseEntity<?> getCategories(){
		return ResponseEntity.ok(this.categoryservice.getCategories());
	}
	
	//update
	
	@PutMapping("/")
	public Category updateCategory(@RequestBody Category category) {
		return this.categoryservice.updateCategory(category);
	}
	
	//delete
	@DeleteMapping("/{caregoryId}")
	public void deleteCategory(@PathVariable("categoryId") Long categoryId) {
		this.categoryservice.deleteCategory(categoryId);
	}

}
