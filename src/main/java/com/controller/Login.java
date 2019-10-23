package com.controller;

import com.bean.User;
import com.bean.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@Controller
public class Login {
    @Autowired
    com.service.userimple userimple;


    @RequestMapping("/loginaccount")
    public String loginaccount(String username, String autoLogin, HttpSession session, HttpServletResponse response) throws IOException {
//        System.out.println(username+password);
//        User已经获取到了用户注册的用户名账号密码
//        从数据库中拿出两个值和账号比较
//        与数据的作比较，错误则返回
        UserExample UserExample = new UserExample();
        UserExample.or().andEmailEqualTo(username);
        List<User> list = userimple.selectByExample(UserExample);
        User User = list.get(0);
//        System.out.println(autoLogin);
        if (autoLogin.equals("1,0")) {
            Cookie cookie = new Cookie("username", User.getUsername());
            cookie.setMaxAge(24 * 3600 * 14);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
        session.setAttribute("username_session", User.getUsername());
//        System.out.println(User.getUsername());
        session.setMaxInactiveInterval(2 * 3600);
        return "redirect:/";

    }

    @RequestMapping("/logincheck")
    public void logincheck(String username, String password, HttpServletResponse response) throws IOException {
        UserExample UserExample = new UserExample();
        UserExample.or().andEmailEqualTo(username).andPasswordEqualTo(password);
        List<User> list = userimple.selectByExample(UserExample);
        if (list.size() == 1) {
            response.getWriter().print(0);
        } else response.getWriter().print(1);

    }

}