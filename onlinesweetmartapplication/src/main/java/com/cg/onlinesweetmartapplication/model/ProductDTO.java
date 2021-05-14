package com.cg.onlinesweetmartapplication.model;

import org.springframework.stereotype.Component;

@Component
public class ProductDTO {
	
    private Integer productId;
    private String name;
//    private String photoPath;
    private Double price;
    private String description;
    private Boolean available = true;
    private CategoryDTO category;

    public ProductDTO() {
		super();
	}

	public ProductDTO(Integer productId, String name, Double price, String description, Boolean available,
			CategoryDTO category) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.description = description;
		this.available = available;
		this.category = category;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", description="
				+ description + ", available=" + available + ", category=" + category + ", product=" + "]";
	}
	
	
}
