package com.springcore.ci;

public class Person {
	
	private int personId;
	private String personName;
	private Address address;
	
	Person(int personId,String personName,Address address){
		this.personId=personId;
		this.personName=personName;
		this.address=address;
		
	}

	@Override
	public String toString() {
		
		return this.personId+":"+this.personName+"{"+this.address+"}";
	}
	

}
