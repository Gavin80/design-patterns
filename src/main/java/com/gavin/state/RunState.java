package com.gavin.state;

public class RunState extends LiftState {

    @Override
    protected void open() {

    }

    @Override
    protected void close() {

    }

    @Override
    protected void run() {
        System.out.println("lift run...");
    }

    @Override
    protected void stop() {
        this.context.setLiftState(Context.STOP_STATE);
        this.context.getLiftState().stop();
    }
}
