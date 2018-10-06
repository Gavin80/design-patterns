package com.gavin.decorator;

public class Decat extends Beverage {
    public Decat() {
        this.description = "Decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
