package com.cg.onlinesweetmartapplication.service;

import java.util.List;


import com.cg.onlinesweetmartapplication.entity.OrderBill;
import com.cg.onlinesweetmartapplication.exceptions.OrderBillNotFoundException;

public interface OrderBillService {
	public OrderBill addOrderBill(OrderBill OrderBill);
	public OrderBill updateOrderBill(OrderBill OrderBill) throws OrderBillNotFoundException;
	public OrderBill cancelOrderBill(int OrderBillId) throws OrderBillNotFoundException;
	public List<OrderBill> showAllOrderBills();
	public List<OrderBill> showAllOrderBills(int OrderBilldId);

}
