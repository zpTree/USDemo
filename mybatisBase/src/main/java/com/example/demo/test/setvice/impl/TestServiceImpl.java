package com.example.demo.test.setvice.impl;

import com.example.demo.test.dao.TestMapper;
import com.example.demo.test.model.Test;
import com.example.demo.test.setvice.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Test getTestById(String id) {
        Test t = testMapper.getTestById(id);
        return t;
    }

}
