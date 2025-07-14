package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "KA01AB1234";
    }

    public String getOwnerName() {
        return "Ravi Kumar";
    }

    public int getSpeed() {
        return 60;
    }

    public void radio() {
        System.out.println("Radio is ON in Hero bike.");
    }
}
