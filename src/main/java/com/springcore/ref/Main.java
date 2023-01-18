package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		A tem=(A) context.getBean("aref");
		System.out.println(tem.getId());
		System.out.println(tem.getName());
		System.out.println(tem.getAddress());
		
		System.out.println(tem.getObj());
	}

}
