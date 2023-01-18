package com.springcore.lifecycle;

public class Book {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		System.out.println("Setting price");
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside the init method");
	}
	
	public void destroy() {
		System.out.println("Inside the destroy method");
	}
	
	

}
