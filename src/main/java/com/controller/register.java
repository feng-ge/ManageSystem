package com.controller;

import com.bean.t_user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 *
 */
@Controller
public class register {

    //从数据库中取出所有的用户名和邮箱
    @ModelAttribute
    public void getinfo(Map<String, Object> map) {
//        取出数据库的值，放到map中
//        map.put("account",account);
    }

    //  注册,成功就跳到登录,失败就跳回注册
    @RequestMapping("/registeraccount")
    public String registeraccount(@ModelAttribute("account") t_user t_user) {
//        System.out.println(t_user.getEmail());
//        t_user已经获取到了用户注册的账号密码
        return "redirect:/";
    }

    @RequestMapping("/registercheckemail")
    public void registercheckemail(String email, HttpServletResponse response) throws IOException {
//        拿到了Email，和数据作比较
        if ("test".equals(email)) {
            response.getWriter().print(1);
        } else response.getWriter().print(0);
    }

    @RequestMapping("/registercheckusername")
    public void registercheckusername(String username, HttpServletResponse response) throws IOException {
//        拿到了username，和数据的作比较就行了。
        if ("test".equals(username)) {
            response.getWriter().print(1);
        } else response.getWriter().print(0);
    }

}
