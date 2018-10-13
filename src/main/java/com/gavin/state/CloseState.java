package com.gavin.state;

public class CloseState extends LiftState {

    @Override
    protected void open() {
        this.context.setLiftState(Context.OPEN_STATE);
        this.context.getLiftState().open();
    }

    @Override
    protected void close() {
        System.out.println("lift close ....");
    }

    @Override
    protected void run() {
        this.context.setLiftState(Context.RUN_STATE);
        this.context.getLiftState().run();
    }

    @Override
    protected void stop() {
        this.context.setLiftState(Context.STOP_STATE);
        this.context.getLiftState().stop();
    }
}
