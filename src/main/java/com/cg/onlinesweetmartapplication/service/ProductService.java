package com.cg.onlinesweetmartapplication.service;

import java.time.LocalDate;
import java.util.List;
import com.cg.onlinesweetmartapplication.entity.Product;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;

public interface ProductService{

	public ProductDTO addProduct(com.cg.onlinesweetmartapplication.entities.Product product);
	public ProductDTO updateProduct(com.cg.onlinesweetmartapplication.entities.Product product) throws ProductNotFoundException;
	public Product cancelProduct(int productId) throws ProductNotFoundException;
	public List<Product> showAllProducts(int productId);
	public List<ProductDTO> showAllProducts();
	public ProductDTO deleteProduct(int id);
	public ProductDTO showProductById(int id);
}