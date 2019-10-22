package com.controller;

import com.bean.essay;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 这个是测试文件，配合book_list.html使用
 *
 */
@Controller
public class book_list {

    @RequestMapping("/searchbook")
    public void searchtest(String name, essay essay, HttpServletResponse response) throws IOException {
        String html = "你查到的是个锤子";
        String addhtml = null;
        if (name.equals("test")) {
            html = "<p>查询的结果如下：</p>\n";
            for (int i = 1; i <= 3; i++) {
                addhtml = "<p>作品：</p>\n" +
                        "<p>作者：</p>\n" +
                        "<p>分类：</p>\n" +
                        "<p>发布日期：</p>\n";
                html = html + addhtml;
            }
            //while(rs.next()) 到时候用这个
        }
        response.getWriter().print(html);

    }

}
