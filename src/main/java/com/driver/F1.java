package com.driver;

public class F1 extends Car {
    private int currentSpeed;
    private String currentDirection;

    public F1(String name, boolean isManual) {
        super(name, isManual);
        this.currentSpeed = 0;
        this.currentDirection = "Straight";
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public String getDirection() {
        return currentDirection;
    }

    public void setSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public void setDirection(String direction) {
        this.currentDirection = direction;
    }

    public void move(int speed, String direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
    }
}
