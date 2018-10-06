package com.gavin.strategy;

public class MysqlUpdate implements UpdateBehavior {
    @Override
    public void update() {
        System.out.println("mysql update...");
    }
}
