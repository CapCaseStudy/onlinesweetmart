package com.cg.onlinesweetmartapplication.repository;


import java.util.List;


import com.cg.onlinesweetmartapplication.entity.Cart;
import com.cg.onlinesweetmartapplication.exceptions.CartNotFoundException;

public interface CartRepository {

	public Cart addCart(Cart Cart);
	public Cart updateCart(Cart Cart) throws CartNotFoundException;
	public Cart cancelCart(int CartId) throws CartNotFoundException;
	public List<Cart> showAllCarts();
	public List<Cart> showAllCarts(int cartdId);

}
