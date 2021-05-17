package com.cg.onlinesweetmartapplication.service;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.jni.Address;
import com.cg.onlinesweetmartapplication.entity.Customer;
import com.cg.onlinesweetmartapplication.exceptions.CustomerNotFoundException;

public interface CustomerService {

	public Customer addCustomer(Customer Customer);
	
	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException;
	
	public String deleteCustomer(int CustomerId) throws CustomerNotFoundException;
	
	public List<Customer> showAllCustomers() throws CustomerNotFoundException;
	
	public Optional<Customer> findCustomerById(int CustomerId) throws CustomerNotFoundException;	
	
	public Customer updateAddress(Address address, int customerId) throws CustomerNotFoundException;

	public Optional<Customer> findCustomerByName(String name) throws CustomerNotFoundException;

	
	
}
