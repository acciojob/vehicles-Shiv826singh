package com.driver;

public class Car extends Vehicle {
    private String name;
    private boolean isManual;
    private int gear;

    public Car(String name, boolean isManual) {
        super(name);
        this.name = name;
        this.isManual = isManual;
        this.gear = 0; // Initialize gear
    }

    public boolean isManual() {
        return isManual;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void drive() {
        System.out.println("Car is driving");
    }
}
