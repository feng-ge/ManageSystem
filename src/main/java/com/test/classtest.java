package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * classtest
 */

public class classtest {
    public static void main(String[] args) {
        ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
        // a.getBean(account.class);

    }

}