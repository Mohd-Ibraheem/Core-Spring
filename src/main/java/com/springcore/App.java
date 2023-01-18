package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("first bean object");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		Student student = (Student) context.getBean("student01");
		
		System.out.println("second bean object");
		Student student01 = (Student) context.getBean("student02");
		
		System.out.println(student);
		System.out.println(student01);
	}
}
