package com.cg.onlinesweetmartapplication.service;

import java.util.List;

import com.cg.onlinesweetmartapplication.exceptions.OrderBillNotFoundException;
import com.cg.onlinesweetmartapplication.model.OrderBillDTO;

public interface OrderBillService {
	public OrderBillDTO addOrderBill(OrderBillDTO OrderBill);
	public OrderBillDTO updateOrderBill(OrderBillDTO OrderBill) throws OrderBillNotFoundException;
	public OrderBillDTO cancelOrderBill(int OrderBillId) throws OrderBillNotFoundException;
	public List<OrderBillDTO> showAllOrderBills();
	public List<OrderBillDTO> showAllOrderBills(int OrderBilldId);

}
