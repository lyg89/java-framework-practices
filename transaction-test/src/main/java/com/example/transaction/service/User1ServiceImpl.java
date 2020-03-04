package com.example.transaction.service;

import com.example.transaction.domain.User1;
import com.example.transaction.mapper.User1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liyaguang
 * @create: 2020-02-16 17:23
 **/
@Service
public class User1ServiceImpl {

    @Autowired
    User1Mapper user1Mapper;

    public void addUser1(User1 user) {
        user1Mapper.insertUser1(user);
        throw new RuntimeException("test ex");
    }
}
