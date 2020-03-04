package com.example.transaction.service;

import com.example.transaction.domain.User1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FacadeServiceImplTest {

    @Autowired
    FacadeServiceImpl facadeService;

    @Test
    void insertUsers() {
        User1 user1 = new User1();
        user1.setId(3);
        user1.setName("王五3");
        facadeService.insertUsers(user1);
    }
}