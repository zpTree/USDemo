package com.example.demo.test.dao;

import com.example.demo.test.model.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    Test getTestById(String id);
}

