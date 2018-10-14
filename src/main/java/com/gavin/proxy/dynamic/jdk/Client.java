package com.gavin.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Cinema cinema = new WanDaCinema();
        CinemaHandler cinemaHandler = new CinemaHandler(cinema);

        Cinema proxy = (Cinema) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Cinema.class}, cinemaHandler);
        proxy.movie();
        proxy.movie("大话西游");
    }
}
