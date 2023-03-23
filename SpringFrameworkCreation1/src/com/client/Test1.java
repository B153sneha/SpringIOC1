package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;

public class Test1 {

	public static void main(String[] args) {
	
	ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
	Student s=a.getBean("s1",Student.class);
	
	Student s1=(Student)a.getBean("s1");
	s1.display();
	
	

	Resource rs=new ClassPathResource("bean.xml");
	BeanFactory beFactory=new XmlBeanFactory(rs);
	Student stu1=(Student)beFactory.getBean("s1");
	stu1.display();
	}
}