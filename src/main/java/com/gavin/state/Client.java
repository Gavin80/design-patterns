package com.gavin.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new OpenState());

        context.run(); // open 状态下 run 不会做任何操作
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
