package com.driver;

public class F1 extends Car {
    private int currentSpeed;
    private String currentDirection;

    public F1(String name, boolean isManual) {
        super(name, isManual);
        this.currentSpeed = 0;
        this.currentDirection = "Straight";
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    // Optional: methods to update speed and direction
    public void accelerate(int speed) {
        this.currentSpeed += speed;
    }

    public void turn(String direction) {
        this.currentDirection = direction;
    }
}
