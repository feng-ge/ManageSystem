package com.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 */
@Controller
@RequestMapping("/download")
public class downfile {
    @RequestMapping("/{eid}")
    public ResponseEntity<byte[]> downfile(@PathVariable int eid, HttpServletRequest request) throws IOException {

        ServletContext context = request.getServletContext();
        FileInputStream fis = new FileInputStream("F:\\杂\\我学尼玛的习\\期刊稿件管理系统\\fosu\\download\\"+eid);
//        context.getRealPath("/download/2");
        byte[] tmp = new byte[fis.available()];
        fis.read(tmp);
        fis.close();

        HttpHeaders HttpHeaders = new HttpHeaders();
        HttpHeaders.set("Content-Disposition","attachment;filename="+eid);
        new ResponseEntity<byte[]>(tmp,HttpHeaders, HttpStatus.OK);


        return new ResponseEntity<byte[]>(tmp,HttpHeaders, HttpStatus.OK);

    }
}
