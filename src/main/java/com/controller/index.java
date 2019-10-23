package com.controller;

import com.bean.User;
import com.bean.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 *
 */


@Controller
public class index {
    @Autowired
    com.service.userimple userimple;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/process")
    public String process() {
        return "process";
    }

    @RequestMapping("/submission")
    public String submission() {
        return "submission";
    }

    @RequestMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }

    @RequestMapping("/contactus")
    public String contactus() {
        return "contactus";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/personal")
    public String personal() {
        return "personal";
    }

    @RequestMapping("/searchsession")
    public void searchsession(HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean re = true;
        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession();
        UserExample UserExample = new UserExample();
        String username = (String) session.getAttribute("username_session");
        if (username != null) {
            response.getWriter().print(username);
        } else {

            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    UserExample.or().andUsernameEqualTo(cookie.getValue());
                    List<User> list = userimple.selectByExample(UserExample);
                    if (list.size() >= 1) {
                        re = false;
                        session.setAttribute("username_session", cookie.getValue());
                        response.getWriter().print(cookie.getValue());
                    }
                }
            }
            if (re)
                response.getWriter().print(0);
        }
//        System.out.println(username);
    }

//        System.out.println(username);


    @RequestMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        Cookie cookie = new Cookie("username", null);
        cookie.setPath("/");
        response.addCookie(cookie);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("<script   language=javascript>alert('你已退出');window.location.reload();window.location='/';</script>");
//        return "redirect:/";
    }


}
