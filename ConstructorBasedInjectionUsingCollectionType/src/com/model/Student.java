package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private List<String> cities;
	private Set<Long> mobiles;
	private Map<String, Integer> countryCodes;
	public Student(List<String> cities, Set<Long> mobiles, Map<String, Integer> countryCodes) {
		super();
		this.cities = cities;
		this.mobiles = mobiles;
		this.countryCodes = countryCodes;
	}
	@Override
	public String toString() {
		return "Student [cities=" + cities + ", mobiles=" + mobiles + ", countryCodes=" + countryCodes + "]";
	}
	
	

}
