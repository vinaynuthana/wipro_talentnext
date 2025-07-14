package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        Hero heroBike = new Hero();
        System.out.println("Hero Bike:");
        System.out.println("Model: " + heroBike.getModelName());
        System.out.println("Reg No: " + heroBike.getRegistrationNumber());
        System.out.println("Owner: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed() + " km/h");
        heroBike.radio();

        System.out.println();

        Honda hondaCar = new Honda();
        System.out.println("Honda Car:");
        System.out.println("Model: " + hondaCar.getModelName());
        System.out.println("Reg No: " + hondaCar.getRegistrationNumber());
        System.out.println("Owner: " + hondaCar.getOwnerName());
        System.out.println("Speed: " + hondaCar.getSpeed() + " km/h");
        hondaCar.cdplayer();
    }
}
