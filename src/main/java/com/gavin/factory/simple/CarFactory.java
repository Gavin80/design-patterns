package com.gavin.factory.simple;

public class CarFactory {

    public Car createCar(String type) {
        if ("vw".equals(type)) {
            return new VW();
        } else if ("bmw".equals(type)) {
            return new BMW();
        } else {
            return null;
        }
    }
}
