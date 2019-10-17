package com.Utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 */
@Aspect
@Component
public class beforelogin {
    @Before("execution(public String com.controller.Login.loginaccount(..))")
    public void checklogin() {

    }
}
