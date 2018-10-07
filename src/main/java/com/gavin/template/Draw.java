package com.gavin.template;

/**
 * 取款
 */
public class Draw extends BankTemplate {
    @Override
    protected void transact() {
        System.out.println("取款 。。。");
    }
}
