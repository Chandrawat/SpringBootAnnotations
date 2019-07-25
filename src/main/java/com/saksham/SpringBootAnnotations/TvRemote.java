package com.saksham.SpringBootAnnotations;


public class TvRemote {
	public TV tv;

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public void performAction() {
		tv.turnOn();
		tv.channelChange();
	}

}
