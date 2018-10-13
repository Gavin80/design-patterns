package com.gavin.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CinemaHandler implements InvocationHandler{

    private Cinema cinema;

    public CinemaHandler(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用方法：" + method.getName() + ", 参数：" + Arrays.toString(args));
        method.invoke(cinema, args);
        // 返回 invoke 调用后的返回值
        return null;
    }
}
