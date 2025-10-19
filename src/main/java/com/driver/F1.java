package com.driver;

public class F1 extends Car {
    private int speed;
    private String direction;

    public F1(String name, boolean isManual) {
        super(name, isManual);
        this.speed = 0;
        this.direction = "Straight";
    }

    public void drive() {
        System.out.println("F1 car is driving");
    }

    public void race() {
        System.out.println("F1 car is racing");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void move(int speed, String direction) {
        this.speed = speed;
        this.direction = direction;
    }
}
