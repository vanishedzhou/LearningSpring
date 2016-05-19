package com.zzy.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"config_aop.xml"});
		Student stu =  ctx.getBean("stu", Student.class);
		
		stu.getName();
//		stu.throwoutException(new IllegalArgumentException());
		stu.sayHi();
	}

}
