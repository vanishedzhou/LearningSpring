package com.zzy.aop;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHi() {
		System.out.println("hi, May Day.");
		return "lee";
	}
	
	public void throwoutException(IllegalArgumentException iae) {
		System.out.println("exception occured: " + iae.toString());
	}
	
}
