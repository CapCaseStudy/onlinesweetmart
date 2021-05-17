package com.cg.onlinesweetmartapplication.model;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

//import com.cg.osm.entity.SweetOrder;
@Component
public class CustomerDTO {

    private Long userId;
    private String username;
    //private Set<SweetOrderDTO> sweetOrders;
   // private List<SweetItemDTO> sweetItems;
//	private CartDTO cart;
    
    public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public CustomerDTO(Long userId, String username) {
		super();
		this.userId = userId;
		this.username = username;
	}

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
/*	public Set<SweetOrderDTO> getSweetOrders() {
		return sweetOrders;
	}
	public void setSweetOrders(Set<SweetOrderDTO> sweetOrders) {
		this.sweetOrders = sweetOrders;
	}
	/*public List<SweetItemDTO> getSweetItems() {
		return sweetItems;
	}
	public void setSweetItems(List<SweetItemDTO> sweetItems) {
		this.sweetItems = sweetItems;
	}
	public CartDTO getCart() {
		return cart;
	}
	public void setCart(CartDTO cart) {
		this.cart = cart;
	}
*/
	@Override
	public String toString() {
		return "CustomerDTO [userId=" + userId + ", username=" + username + "]";
				
	}

	
}
