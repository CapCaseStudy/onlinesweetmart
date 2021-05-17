package com.cg.onlinesweetmartapplication.service;

import java.util.List;

import com.cg.onlinesweetmartapplication.exceptions.SweetItemNotFoundException;
import com.cg.onlinesweetmartapplication.model.SweetItemDTO;

public interface SweetItemService {

	public SweetItemDTO addSweetItem(SweetItemDTO SweetItem);
	public SweetItemDTO updateSweetItem(SweetItemDTO SweetItem) throws SweetItemNotFoundException;
	public SweetItemDTO cancelSweetItem(int SweetItemId) throws SweetItemNotFoundException;
	public List<SweetItemDTO> showAllSweetItems();

}
