package com.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class servlettest {
    @Autowired
    private servicetest servicetest;
    public void test(){
        System.out.println("0");
        servicetest.reading();
    }
}
