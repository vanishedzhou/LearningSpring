package com.zzy.aopAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"config_aopAnnotation.xml"});
		Student stu =  ctx.getBean("student", Student.class);
		
		stu.getName();
		stu.throwoutException(new IllegalArgumentException());
//		stu.sayHi();
	}

}
