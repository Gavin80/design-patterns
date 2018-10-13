package com.gavin.state;

public class StopState extends LiftState {

    @Override
    protected void open() {
        this.context.setLiftState(Context.OPEN_STATE);
        this.context.getLiftState().open();
    }

    @Override
    protected void close() {
        this.context.setLiftState(Context.CLOSE_STATE);
        this.context.getLiftState().close();
    }

    @Override
    protected void run() {
        this.context.setLiftState(Context.RUN_STATE);
        this.context.getLiftState().run();
    }

    @Override
    protected void stop() {
        System.out.println("lift stop...");
    }
}
