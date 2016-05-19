package com.zzy.beanAutowire;

public class Room {
	private String name;
	private Desk myDesk;

	public Room(Desk myDesk) {
		System.out.println("in Room constructor 1");
		this.myDesk = myDesk;
	}

	public Room() {
		System.out.println("in Room constructor...");
	}

	public Room(String name, Desk myDesk) {
		System.out.println("in Room constructor 2");
		this.name = name;
		this.myDesk = myDesk;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Desk getMyDesk() {
		return myDesk;
	}
	public void setMyDesk(Desk desk) {
		this.myDesk = desk;
	}
	
	public void useDeskPlaceObject() {
		myDesk.placeObject("book-thelittleprince");
	}
	
}
