package com.example.transaction.service;

import com.example.transaction.domain.User1;
import com.example.transaction.mapper.User1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: liyaguang
 * @create: 2020-02-16 17:26
 **/
@Service
public class FacadeServiceImpl {

    @Autowired
    User1ServiceImpl user1Service;

    @Autowired
    User2ServiceImpl user2Service;

    @Autowired
    User1Mapper user1Mapper;

    @Transactional(rollbackFor = Exception.class)
    public void insertUsers(User1 user1) {
        this.addUser1(user1);
    }

    public void addUser1(User1 user) {
        user1Mapper.insertUser1(user);
        throw new RuntimeException("test ex");
    }
}
