package com.cg.onlinesweetmartapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.onlinesweetmartapplication.entities.Product;

@Repository
public interface iProductRepository extends JpaRepository<Product, Integer>{

	@Query("SELECT p FROM Product p WHERE p.available=true")
	List<Product> showProductsByAvailability();
	
//	public ProductDTO addProduct(ProductDTO product);
//	public ProductDTO updateProduct(ProductDTO product) throws ProductNotFoundException;
//	public ProductDTO cancelProduct(int productId) throws ProductNotFoundException;
//	public List<ProductDTO> showAllProducts(int productId);
//	public List<ProductDTO> showAllProducts();
	
}
