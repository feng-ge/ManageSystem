package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class Login {


    @RequestMapping("/loginaccount")
    public String loginaccount(String username, String password, HttpServletResponse response) throws IOException {
//        System.out.println(username+password);
//        t_user已经获取到了用户注册的用户名账号密码
//        从数据库中拿出两个值和账号比较
//        与数据的作比较，错误则返回
        return "redirect:/";

    }

    @RequestMapping("/logincheck")
    public void logincheck(String username, String password, HttpServletResponse response) throws IOException {
        if (username.equals("test") && password.equals("test")) {
            response.getWriter().print(1);
        }else response.getWriter().print(0);

    }

}