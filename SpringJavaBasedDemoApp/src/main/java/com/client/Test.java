package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);//for java based implementation "AnnotationBased"
		
		
		                                 Student s= (Student) ac.getBean("s");
		                                 System.out.println(s.getRollno());
		                                 System.out.println(s.getName());

	}

}
