package com.gavin.singleton;

/**
 * 懒汉式（线程不安全）
 * 优点：在需要时才加载，且线程安全
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 *      而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
 * 应用场景：如果 getInstance 的性能对应用程序不是很关键
 */
public class Singleton3 {
    private static Singleton3 INSTANCE;
    private Singleton3() {}

    public synchronized static Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
