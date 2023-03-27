package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration

public class AppConfig {
	
	@Bean
	
	public Student s()
	{
		Student s=new Student(1, "sneha");
		return s;
	}
}
	
	