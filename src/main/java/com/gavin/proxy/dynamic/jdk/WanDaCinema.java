package com.gavin.proxy.dynamic.jdk;

public class WanDaCinema implements Cinema {
    @Override
    public void movie() {
        System.out.println("万达电影院放电影。。。");
    }

    @Override
    public void movie(String name) {
        System.out.println("万达电影院放电影: "+ name +"。。。");
    }
}
