package com.example.DesignPatterns.FactoryMethodPattern.T02;

public class CarFactory {
    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
