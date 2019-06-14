package com.example.demo.test.controller;

import com.example.demo.test.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.test.model.User;

/**
 * author : ZP
 */
@Controller
@RequestMapping("/t")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("getTest")
    @ResponseBody
    public String getTest(){

        User u = new User();
        u.setId(new Long(1));
        u.setUserName("aa");

        userRepository.save(u);
        System.out.print("h1");
        return  u.toString();
    }

}
