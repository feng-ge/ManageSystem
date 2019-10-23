package com.controller;

import com.bean.User;
import com.bean.UserExample;
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
    com.service.userimple userimple;


    //  注册成功就保存数据库然后跳到首页
    @RequestMapping("/registeraccount")
    public String registeraccount(User User) {
        Date date = new Date();
        User.setcTime(date);
        userimple.insertSelective(User);
        return "redirect:/";
    }

    //        拿到了Email，和数据作比较
    @RequestMapping("/registercheckemail")
    public void registercheckemail(String email, HttpServletResponse response) throws IOException {
        UserExample UserExample = new UserExample();
        UserExample.or().andEmailEqualTo(email);
        List<User> list = userimple.selectByExample(UserExample);
        if (list.size() == 1) {
            response.getWriter().print(1);
        } else response.getWriter().print(0);
    }

    @RequestMapping("/registercheckusername")
    public void registercheckusername(String username, HttpServletResponse response) throws IOException {
        UserExample UserExample = new UserExample();
        UserExample.or().andUsernameEqualTo(username);
        List<User> list = userimple.selectByExample(UserExample);
        if (list.size() == 1) {
            response.getWriter().print(1);
        } else response.getWriter().print(0);
    }

}
