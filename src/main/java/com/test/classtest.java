package com.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * classtest
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
@EnableAspectJAutoProxy
public class classtest {

    ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");


//    ApplicationContext a = null;
    @Autowired
    servlettest wahaha;

    @Test
    public void test01() {
//        t_user t_user = (t_user) a.getBean("account01");
//        System.out.println(t_user);
        System.out.println(wahaha);
    }

    @Test
    public void test02() throws SQLException {
        DataSource ds = a.getBean(DataSource.class);
        System.out.println(ds.getConnection());
    }

    @Test
    public void test03() {
        Object bean = a.getBean("replyMapper");
        Object bean2 = a.getBean("replyMapper");
        System.out.println(bean == bean2);
    }

    @Test
    public void test04() {
        servlettest test = a.getBean(servlettest.class);
        test.test();
    }

    @Test
    public void test05() {
        classtest2 w = a.getBean(classtest2.class);
        w.test1();

    }

}
