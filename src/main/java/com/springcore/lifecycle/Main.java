package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
		Book b=(Book) context.getBean("book");
		System.out.println(b);
		//registring shutdwonhook
		context.registerShutdownHook();
	}

}
