package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello java");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionconfig.xml");

		Emp emp = (Emp) context.getBean("emp1");
		System.out.println("Name: " + emp.getName());
		System.out.println("PhoneNum: " + emp.getPhones());
		System.out.println("Address: " + emp.getAddress());
		System.out.println("Course: " + emp.getCourse());
	}

}
