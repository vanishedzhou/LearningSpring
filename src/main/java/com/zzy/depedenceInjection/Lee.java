package com.zzy.depedenceInjection;

public class Lee {
	private Zhou zhou;
	
	public Lee() {
		System.out.println("in lee none parameter constructor method...");
	}
	
	public Lee(Zhou zhou) {
		System.out.println("in Lee constructor method...");
		this.zhou = zhou;
	}

	public void zhouTalking() {
		zhou.talking();
	}
	
	public Zhou getZhou(Zhou zhou) {
		return zhou;
	}
	public void setZhou(Zhou zhou) {
		this.zhou = zhou;
	}

}
