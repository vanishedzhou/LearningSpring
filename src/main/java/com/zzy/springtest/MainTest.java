package com.zzy.springtest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"config1.xml"});
		Product prod = ctx.getBean("product", Product.class);
		prod.selloutProduct();
		System.out.println(prod.getName());
		
		prod.setName("changed name");
		
		Product prodAno = ctx.getBean("product", Product.class);
		System.out.println(prodAno.getName());


	}
	
	public static void useXmlBeanFactory() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("config1.xml"));
	}

}
