package com.gavin.strategy;

public class SqlSessionDemo {
    public static void main(String[] args) {
        QueryBehavior queryBehavior = new OracleQuery();
        UpdateBehavior updateBehavior = new OracleUpdate();

        SqlSession sqlSession = new MysqlSqlSession();
        sqlSession.performQuery();
        sqlSession.performUpdate();

        sqlSession.setQueryBehavior(queryBehavior);
        sqlSession.performQuery();
        sqlSession.performUpdate();
    }
}
