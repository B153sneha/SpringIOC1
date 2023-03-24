package com.model;

public class Student {
	
	private int rollno;
	private String name;
	private String address;
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(address);
	}

}
