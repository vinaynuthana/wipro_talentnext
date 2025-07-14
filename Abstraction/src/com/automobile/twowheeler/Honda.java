package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
    public String getModelName() {
        return "Honda City";
    }

    public String getRegistrationNumber() {
        return "KA05CD6789";
    }

    public String getOwnerName() {
        return "Priya Sharma";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON in Honda car.");
    }
}
