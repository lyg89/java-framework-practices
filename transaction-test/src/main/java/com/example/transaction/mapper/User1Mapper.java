package com.example.transaction.mapper;

import com.example.transaction.domain.User1;
import org.apache.ibatis.annotations.*;

@Mapper
public interface User1Mapper {

    @Select("SELECT * FROM user1 WHERE name = #{name}")
    User1 findByName(@Param("name") String name);

    @Insert("INSERT INTO user1(id, name) values(#{id},#{name})")
    void insertUser1(User1 user);

}
