package com.model;

import java.util.List;

public class Supplier {
	
	private int SupId;
	private String SupName;
	private long SupMob;
	private List<String> cities;
	
	public int getSupId() {
		return SupId;
	}
	public void setSupId(int supId) {
		SupId = supId;
	}
	public String getSupName() {
		return SupName;
	}
	public void setSupName(String supName) {
		SupName = supName;
	}
	public long getSupMob() {
		return SupMob;
	}
	public void setSupMob(long supMob) {
		SupMob = supMob;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	
	
	

}
