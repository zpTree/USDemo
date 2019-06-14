package com.example.demo.test.service.impl;

import com.example.demo.test.dao.TestRepository;
import com.example.demo.test.model.Test;
import com.example.demo.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    public Test getTest(){
        testRepository.findById(1);
        return null;
    }

}
