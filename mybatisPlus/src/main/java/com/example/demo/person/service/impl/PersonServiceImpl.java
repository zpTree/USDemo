package com.example.demo.person.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.person.entity.Person;
import com.example.demo.person.mapper.PersonMapper;
import com.example.demo.person.service.IPersonService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZP
 * @since 2019-06-14
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
