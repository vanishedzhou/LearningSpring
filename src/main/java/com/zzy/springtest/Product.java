package com.zzy.springtest;

public class Product {
	private String name;
	private String price;
	private int nums;
	
	public void init() {
		System.out.println("initializing bean...");
	}
	
	public void destroy() {
		System.out.println("destroying bean...");
	}
	
	public Product() {
	}

	public Product(String name, String price, int nums) {
		this.name = name;
		this.price = price;
		this.nums = nums;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	
	public void selloutProduct() {
		System.out.println("product selled out...");
	}
	

}
