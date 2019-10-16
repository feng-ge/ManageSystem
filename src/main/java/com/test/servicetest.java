package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicetest {
    @Autowired
    private daotest daotest;
    public void reading(){
        System.out.println("1");
        daotest.save();
    }
}
