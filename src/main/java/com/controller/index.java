package com.controller;

import com.bean.*;
import com.dao.ClassifyMapper;
import com.dao.EssayMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 */


@Controller
public class index {
    @Autowired
    com.service.userimple userimple;
    @Autowired
    EssayMapper essayMapper;
    @Autowired
    ClassifyMapper classifyMapper;



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

    @RequestMapping("/submissionbook")
    public String Submissionbook() {
        return "Submissionbook";
    }

    @RequestMapping("/changeuserinfourl")
    public String changeuserinfourl() {
        return "userinfo";
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
                if (cookie.getName().equals("userid")) {
                    session.setAttribute("userid", cookie.getValue());
                }
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

    @RequestMapping("/personbooknum")
    public void personbooknum(HttpSession session, HttpServletResponse response) throws IOException {
        EssayExample EssayExample = new EssayExample();
        EssayExample.or().andWriterIdEqualTo((int) session.getAttribute("userid"));
        List<Essay> list = essayMapper.selectByExample(EssayExample);
        response.getWriter().print(list.size());
    }

    @RequestMapping("/personcommitbooknum")
    public void personcommitbooknum(HttpSession session, HttpServletResponse response) throws IOException {
        EssayExample EssayExample = new EssayExample();
        EssayExample.or().andWriterIdEqualTo((int) session.getAttribute("userid")).andIfpublishEqualTo(true);
        List<Essay> list = essayMapper.selectByExample(EssayExample);
        response.getWriter().print(list.size());

    }

//    @RequestMapping("/s")
//    public void searchresult(String searchname,HttpServletResponse response) throws IOException {
//        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\index.html");
//        Document document = Jsoup.parse(html, "UTF-8");
//        EssayExample EssayExample = new EssayExample();
//        EssayExample.or().andIfpublishEqualTo(true).andEnameLike("%"+searchname+"%");
//        List<Essay> list = essayMapper.selectByExample(EssayExample);
//        Classify Classify = null;
//        User User = null;
//
//        String text = "";
//        for (int i = 0; i < list.size(); i++) {
//            User = userimple.selectByPrimaryKey(list.get(i).getWriterId());
//            Classify = classifyMapper.selectByPrimaryKey(list.get(i).getEclassId());
//            text = text + "<div class=\"col-sm-4 text-center\">\n" +
//                    "            <a href=\"/download/"+list.get(i).getEid()+"\">" + list.get(i).getEname() + "</a>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-2 text-center\">\n" +
//                    "            <p>" + Classify.getCname() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>" + User.getUsername() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>"+list.get(i).getPublish()+"</p>\n" +
//                    "        </div>";
//        }
//
//
//        Elements div = document.select("#show");
//        div.html(text);
//
//
//        response.setContentType("text/html;charset=utf-8");
//        response.getWriter().print(document);
//
//    }
//
//    @RequestMapping("/s1")
//    public void searchresult1(HttpServletResponse response) throws IOException {
//        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\index.html");
//        Document document = Jsoup.parse(html, "UTF-8");
//        EssayExample EssayExample = new EssayExample();
//        EssayExample.or().andIfpublishEqualTo(true).andEclassIdEqualTo(1);
//        List<Essay> list = essayMapper.selectByExample(EssayExample);
//        Classify Classify = null;
//        User User = null;
//
//        String text = "";
//        for (int i = 0; i < list.size(); i++) {
//            User = userimple.selectByPrimaryKey(list.get(i).getWriterId());
//            Classify = classifyMapper.selectByPrimaryKey(list.get(i).getEclassId());
//            text = text + "<div class=\"col-sm-4 text-center\">\n" +
//                    "            <a href=\"/download/"+list.get(i).getEid()+"\">" + list.get(i).getEname() + "</a>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-2 text-center\">\n" +
//                    "            <p>" + Classify.getCname() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>" + User.getUsername() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>"+list.get(i).getPublish()+"</p>\n" +
//                    "        </div>";
//        }
//
//
//        Elements div = document.select("#show");
//        div.html(text);
//
//
//        response.setContentType("text/html;charset=utf-8");
//        response.getWriter().print(document);
//
//    }
//
//
//    @RequestMapping("/s2")
//    public void searchresult2(HttpServletResponse response) throws IOException {
//        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\index.html");
//        Document document = Jsoup.parse(html, "UTF-8");
//        EssayExample EssayExample = new EssayExample();
//        EssayExample.or().andIfpublishEqualTo(true).andEclassIdEqualTo(2);
//        List<Essay> list = essayMapper.selectByExample(EssayExample);
//        Classify Classify = null;
//        User User = null;
//
//        String text = "";
//        for (int i = 0; i < list.size(); i++) {
//            User = userimple.selectByPrimaryKey(list.get(i).getWriterId());
//            Classify = classifyMapper.selectByPrimaryKey(list.get(i).getEclassId());
//            text = text + "<div class=\"col-sm-4 text-center\">\n" +
//                    "            <a href=\"/download/"+list.get(i).getEid()+"\">" + list.get(i).getEname() + "</a>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-2 text-center\">\n" +
//                    "            <p>" + Classify.getCname() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>" + User.getUsername() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>"+list.get(i).getPublish()+"</p>\n" +
//                    "        </div>";
//        }
//
//
//        Elements div = document.select("#show");
//        div.html(text);
//
//
//        response.setContentType("text/html;charset=utf-8");
//        response.getWriter().print(document);
//
//    }
//
//    @RequestMapping("/s3")
//    public void searchresult3(HttpServletResponse response) throws IOException {
//        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\index.html");
//        Document document = Jsoup.parse(html, "UTF-8");
//        EssayExample EssayExample = new EssayExample();
//        EssayExample.or().andIfpublishEqualTo(true).andEclassIdEqualTo(3);
//        List<Essay> list = essayMapper.selectByExample(EssayExample);
//        Classify Classify = null;
//        User User = null;
//
//        String text = "";
//        for (int i = 0; i < list.size(); i++) {
//            User = userimple.selectByPrimaryKey(list.get(i).getWriterId());
//            Classify = classifyMapper.selectByPrimaryKey(list.get(i).getEclassId());
//            text = text + "<div class=\"col-sm-4 text-center\">\n" +
//                    "            <a href=\"/download/"+list.get(i).getEid()+"\">" + list.get(i).getEname() + "</a>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-2 text-center\">\n" +
//                    "            <p>" + Classify.getCname() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>" + User.getUsername() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>"+list.get(i).getPublish()+"</p>\n" +
//                    "        </div>";
//        }
//
//
//        Elements div = document.select("#show");
//        div.html(text);
//
//
//        response.setContentType("text/html;charset=utf-8");
//        response.getWriter().print(document);
//
//    }
//
//    @RequestMapping("/s4")
//    public void searchresult4(HttpServletResponse response) throws IOException {
//        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\index.html");
//        Document document = Jsoup.parse(html, "UTF-8");
//        EssayExample EssayExample = new EssayExample();
//        EssayExample.or().andIfpublishEqualTo(true).andEclassIdEqualTo(4);
//        List<Essay> list = essayMapper.selectByExample(EssayExample);
//        Classify Classify = null;
//        User User = null;
//
//        String text = "";
//        for (int i = 0; i < list.size(); i++) {
//            User = userimple.selectByPrimaryKey(list.get(i).getWriterId());
//            Classify = classifyMapper.selectByPrimaryKey(list.get(i).getEclassId());
//            text = text + "<div class=\"col-sm-4 text-center\">\n" +
//                    "            <a href=\"/download/"+list.get(i).getEid()+"\">" + list.get(i).getEname() + "</a>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-2 text-center\">\n" +
//                    "            <p>" + Classify.getCname() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>" + User.getUsername() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>"+list.get(i).getPublish()+"</p>\n" +
//                    "        </div>";
//        }
//
//
//        Elements div = document.select("#show");
//        div.html(text);
//
//
//        response.setContentType("text/html;charset=utf-8");
//        response.getWriter().print(document);
//
//    }
//
//
//    @RequestMapping("/s5")
//    public void searchresult5(HttpServletResponse response) throws IOException {
//        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\index.html");
//        Document document = Jsoup.parse(html, "UTF-8");
//        EssayExample EssayExample = new EssayExample();
//        EssayExample.or().andIfpublishEqualTo(true).andEclassIdEqualTo(5);
//        List<Essay> list = essayMapper.selectByExample(EssayExample);
//        Classify Classify = null;
//        User User = null;
//
//        String text = "";
//        for (int i = 0; i < list.size(); i++) {
//            User = userimple.selectByPrimaryKey(list.get(i).getWriterId());
//            Classify = classifyMapper.selectByPrimaryKey(list.get(i).getEclassId());
//            text = text + "<div class=\"col-sm-4 text-center\">\n" +
//                    "            <a href=\"/download/"+list.get(i).getEid()+"\">" + list.get(i).getEname() + "</a>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-2 text-center\">\n" +
//                    "            <p>" + Classify.getCname() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>" + User.getUsername() + "</p>\n" +
//                    "        </div>\n" +
//                    "        <div class=\"col-sm-3 text-center\">\n" +
//                    "            <p>"+list.get(i).getPublish()+"</p>\n" +
//                    "        </div>";
//        }
//
//
//        Elements div = document.select("#show");
//        div.html(text);
//
//
//        response.setContentType("text/html;charset=utf-8");
//        response.getWriter().print(document);
//
//    }





}
