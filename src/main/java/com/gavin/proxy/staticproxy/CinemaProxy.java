package com.gavin.proxy.staticproxy;

public class CinemaProxy implements Cinema {

    private Cinema cinema;

    public CinemaProxy(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void movie() {
        System.out.println("放广告。。。");
        cinema.movie();
    }
}
