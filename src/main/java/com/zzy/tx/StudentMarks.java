package com.zzy.tx;

public class StudentMarks {
	private int id;
	private String name;
	private int age;
	
	private int sid;
	private int marks;
	private int year;
	
	public int getSid() {
		return sid;
	}
	public int getMarks() {
		return marks;
	}
	public int getYear() {
		return year;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "student record : id=" + id + 
				" name=" + name + " age=" + age +
				" sid=" + sid + " marks=" + marks + 
				" year=" + year;
	}
	

}
