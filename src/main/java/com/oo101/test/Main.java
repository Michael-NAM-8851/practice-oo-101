package com.oo101.test;

import com.oo101.Car;

public class Main {
    public static void main(String[] args) {
        Car coolCar = new Car("Cool Car", 30);
        System.out.println(coolCar.speedUp());
    }
}
