package com.controller;

import com.bean.Classify;
import com.bean.Essay;
import com.bean.EssayExample;
import com.bean.User;
import com.dao.ClassifyMapper;
import com.dao.EssayMapper;
import com.service.userimple;
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
import java.util.List;

/**
 *
 */

@Controller
public class useressay {

    @Autowired
    EssayMapper essayMapper;
    @Autowired
    userimple userimple;
    @Autowired
    ClassifyMapper classifyMapper;



    @RequestMapping("/useressay")
    public void useressay(HttpSession session, HttpServletResponse response) throws IOException {
        File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\src\\main\\webapp\\index.html");
        Document document = Jsoup.parse(html, "UTF-8");
        EssayExample EssayExample = new EssayExample();
        EssayExample.or().andIfpublishEqualTo(true).andWriterIdEqualTo((int)session.getAttribute("userid"));
        List<Essay> list = essayMapper.selectByExample(EssayExample);
        Classify Classify = null;
        User User = null;

        String text = "";
        for (int i = 0; i < list.size(); i++) {
            User = userimple.selectByPrimaryKey(list.get(i).getWriterId());
            Classify = classifyMapper.selectByPrimaryKey(list.get(i).getEclassId());
            text = text + "<div class=\"col-sm-4 text-center\">\n" +
                    "            <a href=\"/download/"+list.get(i).getEid()+"\">" + list.get(i).getEname() + "</a>\n" +
                    "        </div>\n" +
                    "        <div class=\"col-sm-2 text-center\">\n" +
                    "            <p>" + Classify.getCname() + "</p>\n" +
                    "        </div>\n" +
                    "        <div class=\"col-sm-3 text-center\">\n" +
                    "            <p>" + User.getUsername() + "</p>\n" +
                    "        </div>\n" +
                    "        <div class=\"col-sm-3 text-center\">\n" +
                    "            <p>"+list.get(i).getPublish()+"</p>\n" +
                    "        </div>";
        }


        Elements div = document.select("#show");
        div.html(text);


        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(document);

    }
}
