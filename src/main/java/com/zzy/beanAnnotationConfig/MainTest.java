package com.zzy.beanAnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"config_BeanAnnotationConfig.xml"});
		Student stu =  ctx.getBean("student", Student.class);
		
		System.out.println("student name: " + stu.getName());
		System.out.println("student age: " + stu.getAge());
		
		stu.printAddr();
		
	}

}
