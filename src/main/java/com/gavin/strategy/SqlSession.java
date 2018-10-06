package com.gavin.strategy;

public abstract class SqlSession {
    protected QueryBehavior queryBehavior;
    protected UpdateBehavior updateBehavior;

    public SqlSession(){}

    public SqlSession(QueryBehavior queryBehavior, UpdateBehavior updateBehavior) {
        this.queryBehavior = queryBehavior;
        this.updateBehavior = updateBehavior;
    }

    public void performQuery() {
        queryBehavior.query();
    }

    public void performUpdate() {
        updateBehavior.update();
    }

    public void setQueryBehavior(QueryBehavior queryBehavior) {
        this.queryBehavior = queryBehavior;
    }

    public void setUpdateBehavior(UpdateBehavior updateBehavior) {
        this.updateBehavior = updateBehavior;
    }
}
