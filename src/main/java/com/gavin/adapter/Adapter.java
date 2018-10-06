package com.gavin.adapter;

/**
 * 对象适配器， 采用组合的方式
 * 也可以继承 Adaptee 来实现类适配器，但Java是单继承，如果想在一个适配器内适配多个内则无法实现
 * （如：MAC的USB to HDMI转接头）
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        System.out.println("adapter ...");
        adaptee.request();
    }
}
