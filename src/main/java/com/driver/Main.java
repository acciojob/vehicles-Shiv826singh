package com.driver;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();

        Car car = new Car();
        car.start();
        car.drive();
        car.stop();

        F1 f1 = new F1();
        f1.start();
        f1.drive();
        f1.race();
        f1.stop();
    }
}
