package com.cg.onlinesweetmartapplication.repository;

import java.util.List;


import com.cg.onlinesweetmartapplication.entity.SweetItem;
import com.cg.onlinesweetmartapplication.exceptions.SweetItemNotFoundException;

public interface SweetItemRepository {

	public SweetItem addSweetItem(SweetItem SweetItem);
	public SweetItem updateSweetItem(SweetItem SweetItem) throws SweetItemNotFoundException;
	public SweetItem cancelSweetItem(int SweetItemId) throws SweetItemNotFoundException;
	public List<SweetItem> showAllSweetItems();

}
