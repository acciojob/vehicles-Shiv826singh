

package com.driver;

public class Car extends Vehicle {
    private String name;
    private boolean isManual;

    public Car(String name, boolean isManual) {
        this.name = name;
        this.isManual = isManual;
    }

    public String getName() {
        return name;
    }

    public boolean isManual() {
        return isManual;
    }
    public void drive() {
    System.out.println("Driving " + name + (isManual ? " manually." : " automatically."));
}
}
