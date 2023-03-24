package com.model;

import java.util.List;
import java.util.Map;

public class Product {
	
	private int ProductId;
	private String ProductName;
	private long ProductPrice;
	private List<Dealer> ld;
	private Map<Supplier, Integer> Ms;
	
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public long getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(long productPrice) {
		ProductPrice = productPrice;
	}
	public List<Dealer> getLd() {
		return ld;
	}
	public void setLd(List<Dealer> ld) {
		this.ld = ld;
	}
	public Map<Supplier, Integer> getMs() {
		return Ms;
	}
	public void setMs(Map<Supplier, Integer> ms) {
		Ms = ms;
	}
	}
