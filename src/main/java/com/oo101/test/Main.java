package com.oo101.test;

import com.oo101.Car;
import com.oo101.Driver;
import com.oo101.Truck;

public class Main {
    public static void main(String[] args) {
        Car coolCar = new Car("Cool Car", 30);
//        System.out.println(coolCar.speedUp());
        Truck bigTruck = new Truck("Big Truck", 10);
//        System.out.println(bigTruck.speedUp());

        Driver driver1 = new Driver(coolCar);
        Driver driver2 = new Driver(bigTruck);

        System.out.println(driver1.speedUp());
        System.out.println(driver2.speedUp());
    }
}
