package com.springcore.ref;

public class A {
	private int id;
	private String name;
	private String address;

	private B obj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public B getObj() {
		return obj;
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

	public A(int id, String name, String address, B obj) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.obj = obj;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", address=" + address + ", obj=" + obj + "]";
	}
	

}
