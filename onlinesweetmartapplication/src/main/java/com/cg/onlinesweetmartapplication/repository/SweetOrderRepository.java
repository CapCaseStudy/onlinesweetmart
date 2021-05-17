package com.cg.onlinesweetmartapplication.repository;

import java.util.List;

import com.cg.onlinesweetmartapplication.exceptions.SweetOrderNotFoundException;
import com.cg.onlinesweetmartapplication.model.SweetOrderDTO;

public interface SweetOrderRepository  {

	public SweetOrderDTO addSweetOrder(SweetOrderDTO sweetOrder);
	public SweetOrderDTO updateSweetOrder(SweetOrderDTO sweetOrder) throws SweetOrderNotFoundException;
	public SweetOrderDTO cancelSweetOrder(int sweetOrderId) throws SweetOrderNotFoundException;
	public List<SweetOrderDTO> showAllSweetOrders();
	public double calculateTotalCost(int sweetOrderId);
	
}
