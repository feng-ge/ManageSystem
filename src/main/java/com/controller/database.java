package com.controller;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 *
 */
public class database {

    static SqlSessionFactory factory = null;

    static {

        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession connect() {
        return factory.openSession();
    }
}
