package com.gavin.state;

public class OpenState extends LiftState {

    @Override
    protected void open() {
        System.out.println("lift open...");
    }

    @Override
    protected void close() {
        this.context.setLiftState(Context.CLOSE_STATE);
        this.context.getLiftState().close();
    }

    @Override
    protected void run() {
    }

    @Override
    protected void stop() {
    }


}
