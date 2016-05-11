package com.zzy.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zzy.springtest.Product;

public class MainTest_BeanPostProcessor {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"config_BeanPostProcessor.xml"});
		Product prod = ctx.getBean("product", Product.class);
		prod.selloutProduct();
		System.out.println(prod.getName());
		ctx.registerShutdownHook();

	}
}
