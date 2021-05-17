package com.cg.onlinesweetmartapplication.service;

import java.util.List;

import com.cg.onlinesweetmartapplication.exceptions.CartNotFoundException;
import com.cg.onlinesweetmartapplication.model.CartDTO;

public interface CartService {
	public CartDTO addCart(CartDTO Cart);
	public CartDTO updateCart(CartDTO Cart) throws CartNotFoundException;
	public CartDTO cancelCart(int CartId) throws CartNotFoundException;
	public List<CartDTO> showAllCarts();
	public List<CartDTO> showAllCarts(int cartdId);

}
