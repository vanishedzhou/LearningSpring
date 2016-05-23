package com.zzy.depedenceInjection;

import org.springframework.context.ApplicationContext;

import com.zzy.utils.MainUtils;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ctx = MainUtils.getApplicationContext("config_DI_constructorInjection.xml");
//		ApplicationContext ctx = MainUtils.getApplicationContext("config_DI_setterInjection.xml");
//		ApplicationContext ctx = MainUtils.getApplicationContext("config_DI_innerBean.xml");
		Lee lee = ctx.getBean("lee", Lee.class);
		lee.zhouTalking();
	}

}
