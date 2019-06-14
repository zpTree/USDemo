package com.example.demo.test.controller;

import com.example.demo.test.model.Test;
import com.example.demo.test.setvice.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    public TestService testService;

    @RequestMapping("h1")
    @ResponseBody
    public String sayH1(){
        System.out.print("h1");
        Test t = testService.getTestById("1");
        return t.toString();
    }

    @RequestMapping("h2")
    @ResponseBody
    public String sayH2(){
        System.out.print("h2");
        return "h2";
    }
}
