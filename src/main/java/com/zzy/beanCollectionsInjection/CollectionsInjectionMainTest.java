package com.zzy.beanCollectionsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsInjectionMainTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"config_BeanCollectionsInjection.xml"});
		CollectionsInjectionClazz collInjection = (CollectionsInjectionClazz) ctx.getBean("collectionsInjection");
		
		System.out.println(collInjection.getList());
		System.out.println(collInjection.getSet());
		System.out.println(collInjection.getMap());
		System.out.println(collInjection.getProps());
		

	}

}
