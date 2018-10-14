package com.gavin.proxy.dynamic.cglib;


public class Client {
    public static void main(String[] args) {
        WanDaCinema cinema = new WanDaCinema();
        CinemaCglib cinemaCglib = new CinemaCglib();
        WanDaCinema proxy = (WanDaCinema) cinemaCglib.getInstance(cinema);
        proxy.movie();
        proxy.movie("可可西里");
        proxy.finalMethod();
    }
}
