package com.zzy.beanApplicationContextEventHandler;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"config_BeanApplicationContextEventHandler.xml"});
		Student stu = ctx.getBean("stu", Student.class);

		ctx.start();
		
		stu.sayHi();
		
		ctx.stop();
		
		ctx.close();
		
	}

}
