package com.oo101;

public class Car extends Vehicle{
    public Car(String name, Engine engine){
        super(name, engine.getSpeed());
    }
}
