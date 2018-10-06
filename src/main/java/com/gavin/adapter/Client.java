package com.gavin.adapter;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();

        Adapter adapter1 = new Adapter(adaptee);
        adapter1.handleRequest();;

        Adapter2 adapter2 = new Adapter2();
        adapter2.handleRequest();
    }
}
