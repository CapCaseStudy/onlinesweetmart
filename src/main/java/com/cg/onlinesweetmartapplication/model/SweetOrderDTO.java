package com.cg.onlinesweetmartapplication.model;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class SweetOrderDTO {

	private Integer sweetOrderId;
	private UserDTO user;
	private List<SweetItemDTO> listItems;
	private LocalDate createdDate;
	private Map<ProductDTO, Long> groupedProducts;
	
}
