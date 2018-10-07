package com.gavin.template;

public abstract class BankTemplate {

    public final void process() {
        // 取号
        takeNumber();
        // 办理业务
        transact();
        // 服务评分
        evaluate();
    }

    private void evaluate() {
        System.out.println("服务评分 。。。");
    }

    protected abstract void transact();

    private void takeNumber() {
        System.out.println("取号 。。。");
    }

}
