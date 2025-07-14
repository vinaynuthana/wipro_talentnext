package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class TestClass {
	public static void main(String[] args) {
		
		Logan logancar = new Logan();
		
		System.out.println("Logan:");
        System.out.println("Model: " + logancar.getModelName());
        System.out.println("Reg No: " + logancar.getRegistrationNumber());
        System.out.println("Owner: " + logancar.getOwnerName());
        System.out.println("Speed: " + logancar.getSpeed() + " km/h");
        logancar.gps();

        System.out.println();

        Ford ford = new Ford();
        System.out.println("Ford Car:");
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Reg No: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.getSpeed() + "C");
        ford.tempControl();
		
	}
}
