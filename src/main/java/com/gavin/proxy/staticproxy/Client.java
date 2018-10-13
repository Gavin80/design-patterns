package com.gavin.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        Cinema cinema = new WanDaCinema();
        CinemaProxy proxy = new CinemaProxy(cinema);

        proxy.movie();
    }
}
