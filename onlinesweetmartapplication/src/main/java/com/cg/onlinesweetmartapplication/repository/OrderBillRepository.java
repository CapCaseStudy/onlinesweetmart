package com.cg.onlinesweetmartapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinesweetmartapplication.exceptions.OrderBillNotFoundException;
import com.cg.onlinesweetmartapplication.model.OrderBillDTO;

@Repository
public interface OrderBillRepository {
	public OrderBillDTO addOrderBill(OrderBillDTO OrderBill);
	public OrderBillDTO updateOrderBill(OrderBillDTO OrderBill) throws OrderBillNotFoundException;
	public OrderBillDTO cancelOrderBill(int OrderBillId) throws OrderBillNotFoundException;
	public List<OrderBillDTO> showAllOrderBills();
	public List<OrderBillDTO> showAllOrderBills(int OrderBilldId);
	
}
