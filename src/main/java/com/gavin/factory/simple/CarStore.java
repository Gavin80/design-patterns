package com.gavin.factory.simple;

public class CarStore {
    private CarFactory carFactory;

    public CarStore(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public void orderCar() {
        Car car = carFactory.createCar("bmw");
        car.driver();
    }

    public static void main(String[] args) {
        CarStore carStore = new CarStore(new CarFactory());
        carStore.orderCar();
    }
}
