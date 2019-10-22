package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */


@Controller
public class index {

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
    public String aboutus(HttpServletRequest request) {
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


}
