package com.gavin.decorator;

/**
 * 饮料
 */
public abstract class Beverage {
    String description = "Unknow beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
