package com.test;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *
 */
@Aspect
@Component
public class Utilstest {
    @Before("execution(public void com.test.classtest2.test1())")
    public void logstart(){
        System.out.println("start");
    }
    @After("execution(public void com.test.classtest2.test1())")
    public void logreturn(){
        System.out.println("return");

    }
    @AfterThrowing("execution(public void com.test.classtest2.test1())")
    public void logexcption(){
        System.out.println("exception");

    }
    @AfterReturning("execution(public void com.test.classtest2.test1())")
    public void logend(){
        System.out.println("end");

    }

}
