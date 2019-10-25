package com.controller;

import com.bean.Power;
import com.bean.PowerExample;
import com.bean.User;
import com.bean.UserExample;
import com.service.powerimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 *
 */
@Controller
public class register {

    @Autowired
    com.service.userimple userimple;
    @Autowired
    powerimple powerimple;


    //  注册成功就保存数据库然后跳到首页
    @RequestMapping("/registeraccount")
    public String registeraccount(User User) {
        Date date = new Date();
        User.setcTime(date);
        UserExample UserExample = new UserExample();
        UserExample.or().andIdIsNotNull();
        userimple.insertSelective(User);
        PowerExample PowerExample = new PowerExample();
        PowerExample.or().andPIdEqualTo(1);
        Power power = new Power();
        power.setpNum((int) userimple.countByExample(UserExample));
        powerimple.updateByExampleSelective(power, PowerExample);
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
