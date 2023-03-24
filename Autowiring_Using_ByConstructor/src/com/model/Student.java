package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int rollno;
	private String name;
	@Autowired
	
	private Address addr;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
     public Student(Address addr) {
		System.out.println("Constructor based");
		this.addr=addr;
	}
	public Address getaddr() {
		return addr;
	}
	
	public void setAddr(Address addr)
	{
		this.addr=addr;
	}
	
}
