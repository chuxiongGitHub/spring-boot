package com.rainbow.mapper;

import com.rainbow.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * Created by rainbow on 2016/9/14.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAllUser();

    @Insert("insert into user(name,age) values(#{name},#{age})")
    int insert(User user);
    @Delete("delete from user where id=#{id}")
    int delete(long userId);
}
