package com.controller;

import com.bean.Classify;
import com.bean.ClassifyExample;
import com.service.classifytypeimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *
 */
@Controller
public class classifytype {

    @Autowired
    classifytypeimple classifytypeimple;

    @RequestMapping("/classifytype")
    public void classifytype(HttpServletResponse Response) throws IOException {
        ClassifyExample ClassifyExample = new ClassifyExample();
        List<Classify> list = classifytypeimple.selectByExample(ClassifyExample);
        String html = "<option selected>选择稿件类型...</option>";
        for (int i = 0; i < list.size(); i++) {
            html = html + "<option value=\"" + list.get(i).getCid() + "\">" + list.get(i).getCname() + "</option>\n";
        }
        Response.setContentType("text/html;charset=UTF-8");
        Response.getWriter().print(html);

    }
}
