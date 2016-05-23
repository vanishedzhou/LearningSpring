package com.zzy.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config_jdbc.xml");
		StudentJdbcTemplate sjt = ctx.getBean("sjt", StudentJdbcTemplate.class);
		
		//create student record
//		sjt.create("zzy", 23);
//		sjt.create("lee", 25);
		
		//query for student record
//		Student stu = sjt.queryById(1);
		
		//update student record
//		sjt.update(1, "zhou", 18);
		
		//delete student record
//		sjt.deleteById(1);
		
		//query with SP
		sjt.queryWithSP(3);
		
	}

}
