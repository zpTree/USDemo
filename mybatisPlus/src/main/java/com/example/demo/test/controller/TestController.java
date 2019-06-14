package com.example.demo.test.controller;

import com.example.demo.test.mapper.UserMapper;
import com.example.demo.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("h1")
    @ResponseBody
    public String sayH1(){
        System.out.print("h1");

        List<User> list = userMapper.selectList(null);

        return "h1";
    }

    @RequestMapping("h2")
    @ResponseBody
    public String sayH2(){
        System.out.print("h2");
        return "h2";
    }
}