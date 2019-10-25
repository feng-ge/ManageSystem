package com.controller;

import com.bean.*;
import com.dao.ClassifyMapper;
import com.dao.EssayMapper;
import com.dao.UserMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 */

@Controller
public class prologin {

    @Autowired
    UserMapper userMapper;
    @Autowired
    EssayMapper essayMapper;
    @Autowired
    ClassifyMapper classifyMapper;

    @RequestMapping("/prologins")
    public String prologins() {
        return "prologin";
    }


    @RequestMapping("/prologin")
    public void prologin(String username, String password, HttpServletResponse response) throws IOException {
        UserExample UserExample = new UserExample();
        UserExample.or().andPTypeEqualTo(2).andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> list = userMapper.selectByExample(UserExample);
        if (list.size() == 1) {
            response.getWriter().print(0);
        } else response.getWriter().print(1);

    }

    @RequestMapping("/prologinaccount")
    public String prologinaccount(String username, String autoLogin, HttpServletResponse response, HttpSession session) {
//        System.out.println(username+password);
//        User已经获取到了用户注册的用户名账号密码
//        从数据库中拿出两个值和账号比较
//        与数据的作比较，错误则返回
        UserExample UserExample = new UserExample();
        UserExample.or().andEmailEqualTo(username);
        List<User> list = userMapper.selectByExample(UserExample);
        User User = list.get(0);
//        System.out.println(autoLogin);
        if (autoLogin.equals("1,0")) {
            Cookie cookie1 = new Cookie("username", User.getUsername());
            Cookie cookie2 = new Cookie("userid", String.valueOf(User.getId()));
            cookie1.setMaxAge(24 * 3600 * 14);
            cookie1.setPath("/");
            cookie2.setMaxAge(24 * 3600 * 14);
            cookie2.setPath("/");
            response.addCookie(cookie1);
            response.addCookie(cookie2);
        }
        session.setAttribute("username_session", User.getUsername());
        session.setAttribute("userid", User.getId());
//        System.out.println(User.getUsername());
        session.setMaxInactiveInterval(2 * 3600);
        return "redirect:/procheckbook";
    }

    @RequestMapping("/procheckbook")
    public void procheckbook(HttpServletResponse response) throws IOException {
        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\proindex.html");
        Document document = Jsoup.parse(html, "UTF-8");
        EssayExample EssayExample = new EssayExample();
        EssayExample.or().andIfpublishEqualTo(false).andCanpublishEqualTo(false);
        List<Essay> list = essayMapper.selectByExample(EssayExample);
        Classify Classify = null;
        User User = null;

        String text = "";
        for (int i = 0; i < list.size(); i++) {
            User = userMapper.selectByPrimaryKey(list.get(i).getWriterId());
            Classify = classifyMapper.selectByPrimaryKey(list.get(i).getEclassId());
            text = text + "<div class=\"col-sm-4 text-center\">\n" +
                    "            <a href=\"/download/" + list.get(i).getEid() + "\">" + list.get(i).getEname() + "</a>\n" +
                    "        </div>\n" +
                    "        <div class=\"col-sm-2 text-center\">\n" +
                    "            <p>" + Classify.getCname() + "</p>\n" +
                    "        </div>\n" +
                    "        <div class=\"col-sm-3 text-center\">\n" +
                    "            <p>" + User.getUsername() + "</p>\n" +
                    "        </div>\n" +
                    "        <div class=\"col-sm-3 text-center\">\n" +
                    "            <p>" + list.get(i).getPublish() + "</p>\n" +
                    "        </div>" +
                    "        <div class=\"col-sm-offset-9 col-sm-3 text-center\">\n" +
                    "            <a class=\"btn btn-default col-sm-4\" href=\"/checkbook/"+list.get(i).getEid()+"\" role=\"button\">评分</a>\n" +
                    "        </div>";
        }


        Elements div = document.select("#show");
        div.html(text);


        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(document);

    }


}
