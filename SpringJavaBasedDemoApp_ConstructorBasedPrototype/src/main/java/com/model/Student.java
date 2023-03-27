package com.model;

public class Student {
	
	private int rollno;
	private String name;

	public Student(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
		
		System.out.println("Constructor call");
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}