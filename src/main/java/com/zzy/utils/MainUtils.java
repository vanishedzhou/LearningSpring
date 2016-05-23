package com.zzy.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUtils {
	
	public static ApplicationContext getApplicationContext(String configFileName) {
		return new ClassPathXmlApplicationContext(configFileName);
	}

	public static void main(String[] args) {
	}
	
	

}
