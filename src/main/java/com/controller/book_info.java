package com.controller;

import com.bean.essay;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 *
 */

class bookinfo {
    File html = new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\client\\src\\main\\webapp\\book_info.html");
    Document document = Jsoup.parse(html, "UTF-8");

    bookinfo() throws IOException {
    }
}

@Controller
@RequestMapping("/book")
public class book_info {


    @RequestMapping("/{book_id}")
    public void book(@PathVariable String book_id, essay essay, HttpServletResponse response) throws IOException {
        bookinfo book = new bookinfo();
//        System.out.println(book_id);
//        这里拿到了稿件的id，进入数据库按照id查询全部信息
//        System.out.println(document);
//        上面的document已经拿到了写好的静态页面
        Elements div = book.document.select("#show");
//        在页面找到div的id为show的，然后修改html，让它显示为该作品的信息
        div.html("<p>作品：<a href=\"/book/1\" >test</a></p>\n" +
                "    <p>作者：</p>\n" +
                "    <p>分类：</p>\n" +
                "    <p>发布日期：</p>");

        response.setContentType("text/html;charset=utf-8");

        response.getWriter().print(book.document);


    }
}
