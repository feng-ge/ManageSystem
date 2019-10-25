package com.controller;

import com.bean.User;
import com.bean.UserExample;
import com.service.userimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 *
 */
@Controller
public class userpage {
    @Autowired
    userimple userimple;

    @RequestMapping("/usertag")
    public void usertag(HttpSession session, HttpServletResponse response) throws IOException {
        String username = (String) session.getAttribute("username_session");
        UserExample UserExample = new UserExample();
        UserExample.or().andUsernameEqualTo(username);
        List<User> list = userimple.selectByExample(UserExample);
        User User = list.get(0);
        response.getWriter().print(User.getpType());


    }
}
