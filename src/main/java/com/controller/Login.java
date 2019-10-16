package com.controller;

import com.bean.t_user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
public class Login {


    @ModelAttribute
    public void getinfo(Map<String,Object> map){
//        取出数据库的值和注册信息比较
//        map.put("account",account);
    }

    @RequestMapping("/loginaccount")
    public String loginaccount(@ModelAttribute("account")t_user t_user) {
//        System.out.println(t_user.getEmail());
//        t_user已经获取到了用户注册的用户名账号密码
//        与数据的作比较，错误则返回
        return "login";
//        return "register";
    }

}