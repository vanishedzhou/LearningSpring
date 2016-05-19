package com.zzy.beanAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"config_BeanAutowire.xml"});
		Room room =  ctx.getBean("room", Room.class);
		
		room.useDeskPlaceObject();
		System.out.println(room.getName());
		
		
	}

}
