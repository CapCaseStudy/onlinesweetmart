package com.cg.onlinesweetmartapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinesweetmartapplication.entities.Product;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;
import com.cg.onlinesweetmartapplication.service.ProductService;

@RestController
@RequestMapping("/api/osm")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/addProduct")
	public ProductDTO addProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
	}
	
	@GetMapping(value="/viewAllProducts")
	public List<ProductDTO> showAllProducts()
	{
		return (List<ProductDTO>) productService.showAllProducts();
	}
	
	@GetMapping(value="/viewProduct/{id}")
	public ProductDTO showProductById(@PathVariable int id)
	{
		return productService.showProductById(id);
	}
	
	@PutMapping(value="/updateProduct")
	public ProductDTO updateProduct(@RequestBody Product product) throws ProductNotFoundException
	{
		return productService.updateProduct(product);
	}
	
	@DeleteMapping(value="/deleteProduct/{id}")
	public ProductDTO deleteProduct(@PathVariable int id)
	{
		return productService.deleteProduct(id);
	}
}
