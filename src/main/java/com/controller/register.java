package com.controller;

import com.bean.t_user;
import com.bean.t_userExample;
import com.service.userimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Controller
public class register {

    @Autowired
    userimpl userimpl;


    //  注册成功就保存数据库然后跳到首页
    @RequestMapping("/registeraccount")
    public String registeraccount(t_user t_user) {
        Date date = new Date();
        t_user.setcTime(date);
        userimpl.insertSelective(t_user);
        return "redirect:/";
    }

    //        拿到了Email，和数据作比较
    @RequestMapping("/registercheckemail")
    public void registercheckemail(String email, HttpServletResponse response) throws IOException {
        t_userExample t_userExample = new t_userExample();
        t_userExample.or().andEmailEqualTo(email);
        List<t_user> list = userimpl.selectByExample(t_userExample);
        if (list.size() >= 1) {
            response.getWriter().print(1);
        } else response.getWriter().print(0);
    }

    @RequestMapping("/registercheckusername")
    public void registercheckusername(String username, HttpServletResponse response) throws IOException {
        t_userExample t_userExample = new t_userExample();
        t_userExample.or().andUsernameEqualTo(username);
        List<t_user> list = userimpl.selectByExample(t_userExample);
        if (list.size() >= 1) {
            response.getWriter().print(1);
        } else response.getWriter().print(0);
    }

}
