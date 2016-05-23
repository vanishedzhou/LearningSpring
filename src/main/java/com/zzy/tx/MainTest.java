package com.zzy.tx;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config_tx.xml");
		StudentDao sjt = ctx.getBean("sjt", StudentDao.class);
		
		//create student record
//		sjt.create("txTest1", 16, 2010);
//		sjt.create("txTest2", 15, 2011);
//		sjt.create("txTest3", 14, 2012);
		sjt.create("txTest5", 100, 1888);
//		sjt.create("ZhouZY", 23, 2016);
//		sjt.create("lee", 25);
		
		//query for student record
//		Student stu = sjt.queryById(1);
		
		//update student record
//		sjt.update(1, "zhou", 18);
		
		//delete student record
//		sjt.deleteById(1);
		
//		List<StudentMarks> list = sjt.listAllStudentMarks();
//		for(StudentMarks sm : list) {
//			System.out.println(sm);
//		}
		
	}

}
