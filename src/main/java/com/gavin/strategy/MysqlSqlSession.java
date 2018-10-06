package com.gavin.strategy;

public class MysqlSqlSession extends SqlSession {
    public MysqlSqlSession() {
        this.queryBehavior = new MysqlQuery();
        this.updateBehavior = new MysqlUpdate();
    }
}
