package com.controller;

import com.bean.Essay;
import com.bean.Reply;
import com.bean.ReplyExample;
import com.dao.EssayMapper;
import com.dao.ReplyMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 *
 */

@Controller
@RequestMapping("/checkbook")
public class procheckbook {

    @Autowired
    ReplyMapper replyMapper;
    @Autowired
    EssayMapper essayMapper;

    @RequestMapping("/{eid}")
    public void procheckbook(@PathVariable int eid, HttpServletResponse response) throws IOException {
//        ReplyExample ReplyExample = new ReplyExample();
//        ReplyExample.or().andEIdEqualTo(eid);
//        replyMapper.selectByExample(ReplyExample);

        Essay Essay = essayMapper.selectByPrimaryKey(eid);
        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\procheckbook.html");
        Document document = Jsoup.parse(html, "UTF-8");
        Elements bookid = document.select("#eidinput");
        bookid.html("<div class=\"input-group-prepend\">\n" +
                "            <span class=\"input-group-text\" id=\"eid\">稿件编号</span>\n" +
                "        </div>\n" +
                "        <input type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\"\n" +
                "               aria-describedby=\"inputGroup-sizing-default\" name=\"eId\" readonly=\"readonly\" value=\"" + String.valueOf(Essay.getEid()) + "\" >");

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(document);

    }

    @RequestMapping("/checkbookdone")
    public void checkbookdone(Reply Reply, HttpSession session,HttpServletResponse response) throws IOException {

        Date Date = new Date();
        Reply.setUpdateTime(Date);
        Reply.setCreateTime(Date);
        Reply.setProId((int) session.getAttribute("userid"));
        Essay Essay = essayMapper.selectByPrimaryKey(Reply.geteId());
        Reply.setUserId(Essay.getWriterId());

        replyMapper.insert(Reply);

        ReplyExample ReplyExample = new ReplyExample();
        ReplyExample.or().andEIdEqualTo(Reply.geteId());
        List<Reply> list = replyMapper.selectByExample(ReplyExample);
        if (list.size()>=3)
        {
            com.bean.Essay essay = new Essay();
            essay.setEid(Reply.geteId());
            essay.setCanpublish(true);
            essayMapper.updateByPrimaryKeySelective(essay);
        }
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("<script   language=javascript>alert('评分成功');window.location.reload();window.location='/';</script>");


    }


}
