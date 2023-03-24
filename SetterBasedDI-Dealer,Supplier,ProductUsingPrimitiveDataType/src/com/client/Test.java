package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Dealer;
import com.model.Product;
import com.model.Supplier;
import com.model.Dealer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		Dealer d=ac.getBean("d", Dealer.class);
		
		System.out.println(d.getDealerId());
		System.out.println(d.getDelaerName());
		System.out.println(d.getDealerMobile());
		
		Supplier s=ac.getBean("s", Supplier.class);
		
		System.out.println(s.getSupId());
		System.out.println(s.getSupName());
		System.out.println(s.getSupMob());
		System.out.println(s.getCities());
		
		Product p=ac.getBean("p", Product.class);
		
		System.out.println(p.getProductId());
		System.out.println(p.getProductName());
		System.out.println(p.getProductPrice());
		System.out.println(p.getLd());
		System.out.println(p.getMs());
	}

}
