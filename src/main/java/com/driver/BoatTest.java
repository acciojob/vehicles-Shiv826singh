package com.driver;

public class BoatTest {
    public static void main(String[] args) {
        Boat boat = new Boat("Sea Explorer", 20);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }
}
