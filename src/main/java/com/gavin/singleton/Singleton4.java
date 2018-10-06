package com.gavin.singleton;

/**
 * 双重检查
 * 优点：线程安全；延迟加载；效率较高。
 * private static volatile Singleton4 INSTANCE; 必须加 volatile 关键字
 * 假设两个线程A, B同时调用 getInstance
 * 同时判断 INSTANCE 为null， 进入第2步，A获取锁，依次执行3，4，然后释放锁
 * 线程B获取锁，但如果 INSTANCE 未被 volatile 修饰则，到第3步时 INSTANCE 并没有及时从A中拿到最新值，则又会调用第4步
 * 导致实例不是唯一的，所以需要用 volatile 关键字的内存可见性特性。
 */
public class Singleton4 {
    private static volatile Singleton4 INSTANCE;
    private Singleton4() {}

    public static Singleton4 getInstance() {
        if (INSTANCE == null) { // 1
            synchronized (Singleton4.class) { // 2
                if (INSTANCE == null) { // 3
                    System.out.println("============  new instance =============");
                    INSTANCE = new Singleton4(); // 4
                }
            }
        }
        return INSTANCE;
    }
}
