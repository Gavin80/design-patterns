package com.gavin.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CinemaCglib implements MethodInterceptor {
    // 业务对象，代代理方法中进行真正的业务方法调用
    private Object target;

    // 相当于JDK动态代理中的绑定
    public Object getInstance(Object target) {
        this.target = target;
        // 创建加强器，用来创建代理类
        Enhancer enhancer = new Enhancer();
        // 为加强器指定要代理的业务类（为下面生成的代理类指定父类）
        enhancer.setSuperclass(this.target.getClass());
        // 设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);
        // 创建动态代理类
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("放广告。。。");
        // 调用业务类（父类中）的方法
        methodProxy.invokeSuper(o, objects);
        System.out.println("放幕后花絮。。。");
        return null;
    }
}
