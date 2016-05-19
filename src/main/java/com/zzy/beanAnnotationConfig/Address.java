package com.zzy.beanAnnotationConfig;

public class Address {
	private String addr;
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void printAddr() {
		System.out.println("the addr is : " + addr);
	}

}
