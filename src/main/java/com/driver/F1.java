package com.driver;

public class F1 extends Car {
    private int speed;
    private String direction;

    public F1(String name, boolean isManual) {
        // Arbitrary values for wheels, doors, gears, type, seats
        super(name, 4, 2, 6, isManual, "F1", 1);
        this.speed = 0;
        this.direction = "Straight";
    }

    public void accelerate(int rate) {
        int newSpeed = this.speed + rate;

        if (newSpeed == 0) {
            changeGear(1);
        } else if (newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        this.speed = newSpeed;

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }

    public int getCurrentSpeed() {
        return this.speed;
    }

    public String getCurrentDirection() {
        return this.direction;
    }

    public void changeSpeed(int speed, String direction) {
        this.speed = speed;
        this.direction = direction;
        System.out.println("changeSpeed method called - The speed is changed to: " + speed + ", and the direction is changed to: " + direction);
    }

    public void changeGear(int gear) {
        super.changeGear(gear);
    }

    public int getCurrentGear() {
        return super.getGear();
    }

    public void steer(int angle) {
        this.direction = "Steered " + angle + " degrees";
    }
}
