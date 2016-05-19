package com.zzy.beanAnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private int age;
	@Autowired
	@Qualifier("addr02")
	private Address addr;
	
	public Student() {
		System.out.println("in Student no param constructor.");
	}
//	@Autowired
	public Student(Address addr) {
		super();
		this.addr = addr;
	}
	public Address getAddr() {
		return addr;
	}
//	@Autowired
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printAddr() {
		addr.printAddr();
	}
	

}
