package com.cg.onlinesweetmartapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.onlinesweetmartapplication.entities.Product;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;

@Repository
public interface iProductRepository extends JpaRepository<Product, Integer>{

//	public ProductDTO addProduct(ProductDTO product);
//	public ProductDTO updateProduct(ProductDTO product) throws ProductNotFoundException;
//	public ProductDTO cancelProduct(int productId) throws ProductNotFoundException;
//	public List<ProductDTO> showAllProducts(int productId);
//	public List<ProductDTO> showAllProducts();
	
}
