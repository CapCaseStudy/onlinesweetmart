package com.cg.onlinesweetmartapplication.model;
import java.util.List;
import java.util.Set;

//import com.cg.osm.entity.SweetOrder;

public class CustomerDTO {

    private Long userId;
    private String username;
    private Set<SweetOrderDTO> sweetOrders;
    private List<SweetItemDTO> sweetItems;
	private CartDTO cart;
}
