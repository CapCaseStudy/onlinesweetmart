package com.cg.onlinesweetmartapplication.model;

import java.time.LocalDate;
import java.util.List;

public class OrderBillDTO {
	
	private Integer orderBillId;
	private LocalDate createdDate;
	private float totalCost;
	private List<SweetOrderDTO> listSweetOrder;
	
}
