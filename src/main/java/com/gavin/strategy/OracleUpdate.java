package com.gavin.strategy;

public class OracleUpdate implements UpdateBehavior {
    @Override
    public void update() {
        System.out.println("oracle update...");
    }
}
