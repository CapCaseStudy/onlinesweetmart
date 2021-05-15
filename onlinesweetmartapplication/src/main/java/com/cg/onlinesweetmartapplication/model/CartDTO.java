package com.cg.onlinesweetmartapplication.model;

import java.util.List;

public class CartDTO {

	private double grandTotal;
	private List<ProductDTO> listProduct;
	private int cartId;	
	private int productCount;
	private double total;
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public List<ProductDTO> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<ProductDTO> listProduct) {
		this.listProduct = listProduct;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public CartDTO(double grandTotal, List<ProductDTO> listProduct, int cartId, int productCount, double total) {
		super();
		this.grandTotal = grandTotal;
		this.listProduct = listProduct;
		this.cartId = cartId;
		this.productCount = productCount;
		this.total = total;
	}

	
}
