package com.zzy.aop;

public class Logging {
	
	public void beforeAdvice() {
		System.out.println("before set up ... ");
	}
	
	public void afterAdvice() {
		System.out.println("after set up ...");
	}
	
	public void afterReturningAdvice(Object val) {
		System.out.println("after returning: " + val.toString());
	}
	
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("exception occured:	" + ex.toString());
	}

}
