package com.gavin.proxy.dynamic.cglib;


public class WanDaCinema {
    public void movie() {
        System.out.println("万达电影院放电影。。。");
    }

    public void movie(String name) {
        System.out.println("万达电影院放电影: "+ name +"。。。");
    }

    public final void finalMethod() {
        System.out.println("cglib不能代理final方法");
    }
}
