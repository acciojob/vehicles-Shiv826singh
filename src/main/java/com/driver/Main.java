package com.driver;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("MyCar", true);
        car.drive();

        F1 f1 = new F1("Ferrari", true);
        f1.drive();
        f1.race();
    }
}
