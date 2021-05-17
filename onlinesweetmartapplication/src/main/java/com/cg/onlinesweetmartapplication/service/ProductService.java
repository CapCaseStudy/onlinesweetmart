package com.cg.onlinesweetmartapplication.service;

import java.util.List;

import com.cg.onlinesweetmartapplication.entities.Product;
import com.cg.onlinesweetmartapplication.exceptions.InvalidProductInputException;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;

public interface ProductService{

	public ProductDTO addProduct(Product product);
	public ProductDTO updateProduct(Product product) throws ProductNotFoundException, InvalidProductInputException;
	public ProductDTO deleteProduct(int productId) throws ProductNotFoundException;
	public ProductDTO showProductById(int productId);
	public List<ProductDTO> showAllProducts();
	public List<ProductDTO> showProductsByAvailability();
	
}
