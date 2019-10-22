package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
public class Login {


    @RequestMapping("/loginaccount")
    public String loginaccount(String username, String password, HttpSession session, HttpServletResponse response) throws IOException {
//        System.out.println(username+password);
//        t_user已经获取到了用户注册的用户名账号密码
//        从数据库中拿出两个值和账号比较
//        与数据的作比较，错误则返回
//        Cookie cookie = new Cookie("username",username);
//        cookie.setMaxAge(24*3600*14);
//        cookie.setPath("/");
//        response.addCookie(cookie);
        session.setAttribute("user_session", username);
        session.setMaxInactiveInterval(2*3600);
        return "redirect:/";

    }

    @RequestMapping("/logincheck")
    public void logincheck(String username, String password, HttpServletResponse response) throws IOException {
        if (username.equals("test") && password.equals("test")) {
            response.getWriter().print(1);
        } else response.getWriter().print(0);

    }

}