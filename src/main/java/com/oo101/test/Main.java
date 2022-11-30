package com.oo101.test;

import com.oo101.*;

public class Main {
    public static void main(String[] args) {
        Car coolCar = new Car("Cool Car", new GasolineEngine());
//        System.out.println(coolCar.speedUp());
        Truck bigTruck = new Truck("Big Truck", 10);
//        System.out.println(bigTruck.speedUp());

        Driver driver1 = new Driver(coolCar);
        Driver driver2 = new Driver(bigTruck);

        System.out.println(driver1.speedUp());
        System.out.println(driver2.speedUp());

        Driver driver3 = new Driver(new Car("Cool Car (Electirc)", new ElectricEngine()));
        System.out.println(driver3.speedUp());
    }
}
