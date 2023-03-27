package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration // it contains one or more than one bean definations

public class AppConfig {
	
	@Bean  // just know the container it is object is created and then return
	public Student s() //Student is an return type it means class type  // bydefault method name is bean is thats why "s"
	                   // method ke andar bean banaya
	{
	Student s=new Student();
	s.setRollno(1);
	s.setName("sneha");
	return  s;
	}
	

}
