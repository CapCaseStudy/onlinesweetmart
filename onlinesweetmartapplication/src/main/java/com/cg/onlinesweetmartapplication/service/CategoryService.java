package com.cg.onlinesweetmartapplication.service;

import java.util.List;

import com.cg.onlinesweetmartapplication.exceptions.CategoryNotFoundException;
import com.cg.onlinesweetmartapplication.model.CategoryDTO;

public interface CategoryService  {

	public CategoryDTO addCategory(CategoryDTO Category);
	public CategoryDTO updateCategory(CategoryDTO Category) throws CategoryNotFoundException;
	public CategoryDTO cancelCategory(int CategoryId) throws CategoryNotFoundException;
	public List<CategoryDTO> showAllCategorys();
	public double calculateTotalCost(int categoryId);

}
