package com.example.transaction.mapper;

import com.example.transaction.domain.User2;
import org.apache.ibatis.annotations.*;

@Mapper
public interface User2Mapper {

    @Select("SELECT * FROM user2 WHERE name = #{name}")
    User2 findByName(@Param("name") String name);

    @Insert("INSERT INTO user2(id, name) values(#{id},#{name})")
    @SelectKey(statement = "call identity()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insertUser2(User2 user);

}
