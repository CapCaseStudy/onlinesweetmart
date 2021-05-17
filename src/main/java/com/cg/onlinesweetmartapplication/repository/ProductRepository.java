package com.cg.onlinesweetmartapplication.repository;

import java.time.LocalDate;
import java.util.List;

import com.cg.onlinesweetmartapplication.entity.Product;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;

public interface ProductRepository{

	public Product addProduct(Product product);
	public Product updateProduct(Product product) throws ProductNotFoundException;
	public Product cancelProduct(int productId) throws ProductNotFoundException;
	public List<Product> showAllProducts(int productId);
	public List<Product> showAllProducts();
	
}
