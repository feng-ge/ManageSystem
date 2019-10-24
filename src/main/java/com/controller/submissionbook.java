package com.controller;

import com.bean.Classify;
import com.bean.ClassifyExample;
import com.bean.Essay;
import com.bean.EssayExample;
import com.dao.ClassifyMapper;
import com.dao.EssayMapper;
import com.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
public class submissionbook {

    @Autowired
    EssayMapper essayMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    ClassifyMapper classifyMapper;

    @RequestMapping("/uploadbook")
    public void uploadbook(Essay Essay, @RequestParam("uploadfile") MultipartFile file, HttpServletResponse response, HttpSession Session) throws IOException {
        Date Date = new Date();
        Essay.setcTime(Date);
        Essay.setPublish(Date);
        Essay.setWriterId((int) Session.getAttribute("userid"));
//        Essay.getEclassId();
        essayMapper.insertSelective(Essay);
        EssayExample EssayExample = new EssayExample();
        EssayExample.or().andEclassIdEqualTo(Essay.getEclassId());
//        essayMapper.countByExample(EssayExample);
        ClassifyExample ClassifyExample = new ClassifyExample();
        ClassifyExample.or().andCidEqualTo(Essay.getEclassId());
        Classify Classify = new Classify();
        Classify.setcNum((int) essayMapper.countByExample(EssayExample));
        classifyMapper.updateByExampleSelective(Classify, ClassifyExample);
        EssayExample.clear();
        EssayExample.or().andWriterIdEqualTo(Essay.getWriterId()).andEnameEqualTo(Essay.getEname());
        List<Essay> list = essayMapper.selectByExample(EssayExample);
        file.transferTo(new File("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\download\\" + list.get(0).getEid()));
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("<script language=javascript>alert('上传成功');window.location='/'</script>");


    }

}
