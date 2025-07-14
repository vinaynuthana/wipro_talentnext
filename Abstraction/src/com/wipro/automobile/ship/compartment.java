package com.wipro.automobile.ship;

public class compartment {
     double height;
     double width;
     double breadth;

    public compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void displayDetails() {
        System.out.println("Ship Compartment Dimensions:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
    }
}
