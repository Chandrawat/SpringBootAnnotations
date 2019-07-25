package com.saksham.SpringBootAnnotations;

public class TV {
	
	public TV() {
		System.out.println("TV recieved a signal");
	}
	
	public void  turnOn() {
		System.out.println("TV is turned ON");
	}

	public void channelChange() {
		System.out.println("Channel has changed");
	}

}
