package com.cg.onlinesweetmartapplication.service;

import java.util.List;

import com.cg.onlinesweetmartapplication.exceptions.CustomerNotFoundException;
import com.cg.onlinesweetmartapplication.model.CustomerDTO;

public interface CustomerService {

	public CustomerDTO addCustomer(CustomerDTO Customer);
	public CustomerDTO updateCustomer(CustomerDTO Customer) throws CustomerNotFoundException;
	public CustomerDTO cancelCustomer(int CustomerId) throws CustomerNotFoundException;
	public List<CustomerDTO> showAllCustomers();
	public List<CustomerDTO> showAllCustomers(int CustomerdId);	
	
}
