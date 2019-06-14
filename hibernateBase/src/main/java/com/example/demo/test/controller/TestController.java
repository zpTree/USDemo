package com.example.demo.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author : ZP
 */
@Controller
@RequestMapping("/t")
public class TestController {

    @RequestMapping("getTest")
    @ResponseBody
    public String getTest(){

        System.out.print("h1");
        return  "";
    }

}
