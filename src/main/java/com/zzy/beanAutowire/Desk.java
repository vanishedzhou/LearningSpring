package com.zzy.beanAutowire;

import org.springframework.beans.factory.annotation.Required;

public class Desk {
	private String name;
	public Desk() {
		System.out.println("in Desk constructor...");
	}
	
	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public void placeObject(String objectName) {
		System.out.println("placing the object:" + objectName);
	}

}
