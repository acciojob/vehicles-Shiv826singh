package com.driver;

public class F1 extends Car {
    private int speed;
    private int direction;

    public F1(String name, boolean isManual) {
        // Arbitrary values for wheels, doors, gears, type, seats
        super(name, 4, 2, 6, isManual, "F1", 1);
        this.speed = 0;
        this.direction = 0;
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
        } else {
            // ensure the vehicle state is updated when speed becomes zero
            changeSpeed(0, getCurrentDirection());
        }
    }

    public int getCurrentSpeed() {
        return this.speed;
    }

    @Override
    public int getCurrentDirection() {
        return this.direction;
    }

    public void changeSpeed(int speed, int direction) {
        this.speed = speed;
        this.direction = direction;
        // keep Vehicle's internal state in sync
        super.move(speed, direction);
        System.out.println("changeSpeed method called - The speed is changed to: " + speed + ", and the direction is changed to: " + direction + " degrees");
    }

    public void changeGear(int gear) {
        super.changeGear(gear);
    }

    public int getCurrentGear() {
        return super.getGear();
    }

    @Override
    public void steer(int angle) {
        // update local direction and propagate to parent
        this.direction += angle;
        super.steer(angle);
    }
}
