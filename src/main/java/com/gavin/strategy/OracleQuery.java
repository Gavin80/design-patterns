package com.gavin.strategy;

public class OracleQuery implements QueryBehavior {
    @Override
    public void query() {
        System.out.println("oracle query...");
    }
}
