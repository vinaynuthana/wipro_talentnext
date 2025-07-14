package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Ford extends Vehicle{
	
	public String getModelName() {
		return "Ford";
	}
	
	public String getRegistrationNumber() {
		return "kalva1234";
	}
	
	public String getOwnerName() {
		return "Sukumar";
	}
	public int getSpeed() {
		return 140;
	}
	
	public void tempControl() {
		System.out.println("provides facility to control the air conditioning device which is available in the car");
	}
	
}