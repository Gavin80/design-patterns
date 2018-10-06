package com.gavin.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        Beverage mocha = new Mocha(houseBlend);
        Beverage whipWithMocha = new Whip(mocha);
        System.out.println(whipWithMocha.getDescription());
        System.out.println(whipWithMocha.cost());
    }
}
