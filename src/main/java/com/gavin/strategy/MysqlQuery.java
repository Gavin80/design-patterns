package com.gavin.strategy;

public class MysqlQuery implements QueryBehavior {
    @Override
    public void query() {
        System.out.println("mysql query...");
    }
}
