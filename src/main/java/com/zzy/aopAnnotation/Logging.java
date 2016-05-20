package com.zzy.aopAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	
	@Pointcut("execution(* com.zzy.aopAnnotation.*.*(..))")
	public void selectAll(){}
	
	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("before set up ... ");
	}
	
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("after set up ...");
	}
	
	@AfterReturning(pointcut="selectAll()", returning="val")
	public void afterReturningAdvice(Object val) {
		System.out.println("after returning: " + val.toString());
	}
	
	@AfterThrowing(pointcut="selectAll()", throwing="ex")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("exception occured:	" + ex.toString());
	}

}
