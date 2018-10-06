package com.gavin.singleton;

/**
 * 饿汉式（静态代码块）
 * 这种方式与 Singleton2 的方式其实类似，只不过将类实例化的过程放在了静态代码块中，
 * 也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;
    static {
        INSTANCE = new Singleton2();
    }
    private Singleton2() {}

    public Singleton2 getInstance() {
        return INSTANCE;
    }
}
