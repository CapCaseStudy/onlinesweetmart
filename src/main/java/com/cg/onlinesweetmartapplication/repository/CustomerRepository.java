package com.cg.onlinesweetmartapplication.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.cg.onlinesweetmartapplication.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	@Query(value = "from Customer where :CustomerName = name")
	public Optional<Customer> findCustomerByName(@Param("CustomerName")String CustomerName);
}
