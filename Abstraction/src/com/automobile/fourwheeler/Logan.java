package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{
	
	public String getModelName() {
		return "Lumbergin";
	}
	
	public String getRegistrationNumber() {
		return "Nuth1234";
	}
	
	public String getOwnerName() {
		return "Vinay";
	}
	public int getSpeed() {
		return 120;
	}
	
	public void gps() {
		System.out.println("Provides facility to control the gps device");
	}
	
	
}