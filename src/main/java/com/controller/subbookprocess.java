package com.controller;

import com.bean.*;
import com.dao.ClassifyMapper;
import com.dao.EssayMapper;
import com.dao.ReplyMapper;
import com.dao.UserMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("/book")
public class subbookprocess {
    @Autowired
    EssayMapper essayMapper;
    @Autowired
    ClassifyMapper classifyMapper;
    @Autowired
    ReplyMapper replyMapper;
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/{eid}")
    public void subbookprocess(@PathVariable int eid, HttpServletResponse response) throws IOException {
        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\subbookprocess.html");
        Document document = Jsoup.parse(html, "UTF-8");
        String messageinfo = "";
        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        Essay essay = essayMapper.selectByPrimaryKey(eid);
        ClassifyExample ClassifyExample = new ClassifyExample();
        ClassifyExample.or().andCidEqualTo(essay.getEclassId());
        List<Classify> list = classifyMapper.selectByExample(ClassifyExample);
        ReplyExample ReplyExample = new ReplyExample();
        ReplyExample.or().andEIdEqualTo(eid);
        List<Reply> replyList = replyMapper.selectByExample(ReplyExample);


        Elements div = document.select("#bookinfo");
        div.html("<hr class=\"my-4\">\n" +
                "<h4 class=\"text-center\">你的投稿信息</h4>\n" +
                "<p class=\"text-center\">稿件名称:" + essay.getEname() + "</p>\n" +
                "<p class=\"text-center\">稿件分类:" + list.get(0).getCname() + "</p>\n" +
                "<p class=\"text-center\">稿件简介:" + essay.geteIntroduce() + "</p>\n" +
                "<hr class=\"my-4\">\n" +
                "<h4 class=\"text-center\">评稿员留言</h4>");
        Elements message = document.select("#message");
        for (int i = 0; i < replyList.size(); i++) {

            User User = userMapper.selectByPrimaryKey(replyList.get(i).getProId());

            messageinfo = messageinfo + "<h4>评稿员:" + User.getUsername() + "</h4>\n" +
                    "        <h4>评稿时间:" + replyList.get(i).getCreateTime() + "</h4>\n" +
                    "        <h4>分数:" + replyList.get(i).getScore() + "</h4>\n" +
                    "        <p>留言：" + replyList.get(i).getMessage() + "</p>\n" +
                    "        <hr class=\"my-4\">";
        }

        message.html(messageinfo);
        int a = replyList.size();
        essay.setModified(a);
        essayMapper.updateByPrimaryKeySelective(essay);

        if (a >= 3) {
            a = 3;
            essay.setCanpublish(true);
            essayMapper.updateByPrimaryKeySelective(essay);
            Elements alertmessage = document.select("#alertmessage");
            alertmessage.html("专家审稿已经完成，等待管理员发布");
        }
        Elements process = document.select("#process");
        process.html("<div class=\"progress-bar progress-bar-striped\" role=\"progressbar\" style=\"width: " + numberFormat.format(0.25 * a) + "\" aria-valuenow=\"10\"\n" +
                "             aria-valuemin=\"0\" aria-valuemax=\"100\">" + numberFormat.format(0.25 * a) + "\n" +
                "        </div>");


        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(document);
    }
}
