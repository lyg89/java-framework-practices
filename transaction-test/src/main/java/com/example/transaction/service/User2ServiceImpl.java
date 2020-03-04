package com.example.transaction.service;

import com.example.transaction.domain.User2;
import com.example.transaction.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liyaguang
 * @create: 2020-02-16 17:25
 **/
@Service
public class User2ServiceImpl {

    @Autowired
    User2Mapper user2Mapper;

    public void addUser2(User2 user) {
        user2Mapper.insertUser2(user);
    }
}
