package com.cg.onlinesweetmartapplication.controller;

import java.util.List;
import javax.validation.Valid;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.onlinesweetmartapplication.entity.Customer;
import com.cg.onlinesweetmartapplication.exceptions.CustomerNotFoundException;
import com.cg.onlinesweetmartapplication.serviceImpl.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerservice;

	@PostMapping(path = "/customer")
	public Customer addCustomer(@RequestBody @Valid Customer customer) {
		return customerservice.addCustomer(customer);
	} 

	//
	@DeleteMapping(path = "/customer/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) throws CustomerNotFoundException {
		return customerservice.deleteCustomer(customerId);
	}

	
	@GetMapping(path = "/customerAll")
	public List<Customer> showAllCustomers() throws CustomerNotFoundException {
		return customerservice.showAllCustomers();
	}
  
	
	@PutMapping(path = "/customerUpdate")
	public Customer updateCustomer(@RequestBody @Valid Customer customer) throws CustomerNotFoundException {
		return customerservice.updateCustomer(customer);
	}

	
	
	@PutMapping(path = "/customer/addr/{customerId}")
	public Customer UpdateAddress(@RequestBody @Valid Address address, @PathVariable("customerId") int customerId)
			throws CustomerNotFoundException {
		return customerservice.updateAddress(address, customerId);
	}
/*
	@GetMapping(path = "/customer/{customerId}")
	public Customer findCustomerById(@PathVariable("customerId") int CustomerId) throws CustomerNotFoundException {
		Optional<Customer> result = customerservice.findCustomerById(CustomerId);
		return result.get();
all
	}
	@GetMapping(path = "/customer/name/{username}")
	public Customer findCustomerByName(@PathVariable("username") String username) throws CustomerNotFoundException {
		Optional<Customer> customer = customerservice.findCustomerByName(username);
		return customer.get();
	}
	*/
}

