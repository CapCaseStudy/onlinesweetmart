package com.cg.onlinesweetmartapplication.repository;

import java.util.List;

import com.cg.onlinesweetmartapplication.exceptions.CategoryNotFoundException;
import com.cg.onlinesweetmartapplication.model.CategoryDTO;

public interface CategoryRepository  {

	public CategoryDTO addCategory(CategoryDTO Category);
	public CategoryDTO updateCategory(CategoryDTO Category) throws CategoryNotFoundException;
	public CategoryDTO cancelCategory(int CategoryId) throws CategoryNotFoundException;
	public List<CategoryDTO> showAllCategorys();

}
