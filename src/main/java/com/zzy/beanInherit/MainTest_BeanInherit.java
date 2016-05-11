package com.zzy.beanInherit;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zzy.springtest.Product;

public class MainTest_BeanInherit {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"config_BeanInherit.xml"});
		Product prod = ctx.getBean("product", Product.class);
		prod.selloutProduct();
		System.out.println(prod.getName());
		
		InheritProduct inheritProduct = ctx.getBean("inheritProduct", InheritProduct.class);
		System.out.println(inheritProduct.getName());
		System.out.println(inheritProduct.getPrice());
		System.out.println(inheritProduct.getInheritedAttr());

		
	}
}
