package com.cg.onlinesweetmartapplication.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinesweetmartapplication.entities.Product;
import com.cg.onlinesweetmartapplication.exceptions.InvalidProductInputException;
import com.cg.onlinesweetmartapplication.exceptions.ProductNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;
import com.cg.onlinesweetmartapplication.repository.iProductRepository;
import com.cg.onlinesweetmartapplication.service.ProductService;
import com.cg.onlinesweetmartapplication.utils.ProductUtils;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private iProductRepository productRepo;
	
	@Override
	public ProductDTO addProduct(Product product) {
		Product productEntity;
		if(product == null)
		{
			productEntity = null;
		}
		else
		{
			productEntity = productRepo.save(product);
		}
		return ProductUtils.convertToProductDto(productEntity);
//		return productRepo.save(product);
	}

	@Override
	public ProductDTO updateProduct(Product product) throws ProductNotFoundException, InvalidProductInputException {
		Product productEntity;
		Product productExist = productRepo.findById(product.getProductId()).orElse(null);
		if(productExist == null)
		{
			throw new ProductNotFoundException("Product Not Available");
		}
		else
		{
			productEntity = productRepo.save(product);
		}
		return ProductUtils.convertToProductDto(productEntity);
	}

	@Override
	public ProductDTO deleteProduct(int productId) throws ProductNotFoundException {
		Product productExist = productRepo.findById(productId).orElse(null);
		if(productExist == null)
		{
			throw new ProductNotFoundException("product Id Not Available");
		}
		else
		{
			productRepo.delete(productExist);
		}
		return ProductUtils.convertToProductDto(productExist);
	}

	@Override
	public ProductDTO showProductById(int productId) {
		Product productExist = productRepo.findById(productId).get();
		return ProductUtils.convertToProductDto(productExist);
	}

	@Override
	public List<ProductDTO> showAllProducts() {
		List<Product> productsList = productRepo.findAll();
		return ProductUtils.convertToProductDtoList(productsList);
	}

	@Override
	public List<ProductDTO> showProductsByAvailability() {
		List<Product> availableList = productRepo.showProductsByAvailability();
		return ProductUtils.convertToProductDtoList(availableList);
	}
	
}
