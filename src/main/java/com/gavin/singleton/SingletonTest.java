package com.gavin.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + Singleton4.getInstance());
            }
        }, "thread1").start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + Singleton4.getInstance());
            }
        }, "thread2").start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + Singleton4.getInstance());
            }
        }, "thread3").start();
    }
}
