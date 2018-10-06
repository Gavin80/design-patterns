package com.gavin.adapter;

/**
 * 类适配器
 * 通过继承 Adaptee 来实现类适配器，但Java是单继承，如果想在一个适配器内适配多个内则无法实现
 */
public class Adapter2 extends Adaptee implements Target{
    @Override
    public void handleRequest() {
        System.out.println("adapter2 ...");
        super.request();
    }
}
