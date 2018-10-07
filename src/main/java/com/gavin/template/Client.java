package com.gavin.template;

public class Client {
    public static void main(String[] args) {
        BankTemplate template = new Draw();
        template.process();

        BankTemplate template1 = new BankTemplate() {
            @Override
            protected void transact() {
                System.out.println("存款 。。。");
            }
        };
        template1.process();
    }
}
