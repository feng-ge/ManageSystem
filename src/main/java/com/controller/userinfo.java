package com.controller;

import com.bean.User;
import com.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 */
@Controller
public class userinfo {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/changeusername")
    public void changeusername(HttpSession session, HttpServletResponse response) throws IOException {
        User User = userMapper.selectByPrimaryKey((int) session.getAttribute("userid"));
        response.getWriter().print(User.getUsername());
    }

    @RequestMapping("/changeemail")
    public void changeemail(HttpSession session, HttpServletResponse response) throws IOException {
        User User = userMapper.selectByPrimaryKey((int) session.getAttribute("userid"));
        response.getWriter().print(User.getEmail());
    }

    @RequestMapping("/changepassword")
    public void changepassword(HttpSession session, HttpServletResponse response) throws IOException {
        User User = userMapper.selectByPrimaryKey((int) session.getAttribute("userid"));
        response.getWriter().print(User.getPassword());
    }

    @RequestMapping("/changephone")
    public void changephone(HttpSession session, HttpServletResponse response) throws IOException {
        User User = userMapper.selectByPrimaryKey((int) session.getAttribute("userid"));
        response.getWriter().print(User.getPhone());
    }

    @RequestMapping("/changeintroduce")
    public void changeintroduce(HttpSession session, HttpServletResponse response) throws IOException {
        User User = userMapper.selectByPrimaryKey((int) session.getAttribute("userid"));
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(User.getEducation());
    }


    @RequestMapping("/changeuserinfo")
    public void changeuserinfo(User User, HttpSession session,HttpServletResponse response) throws IOException {

        User.setId((int) session.getAttribute("userid"));

        userMapper.updateByPrimaryKeySelective(User);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("<script   language=javascript>alert('修改成功！');window.location='/personal'</script>");

    }
}
