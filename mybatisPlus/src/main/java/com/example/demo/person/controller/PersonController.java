package com.example.demo.person.controller;


import com.example.demo.person.entity.Person;
import com.example.demo.person.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZP
 * @since 2019-06-14
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @RequestMapping("getPerson")
    @ResponseBody
    public String getPerson(){
        Person p = personService.getById("1");
        System.out.print("getPerson");
        return p.toString();
    }

}
