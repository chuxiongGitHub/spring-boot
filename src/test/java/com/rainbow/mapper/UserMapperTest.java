package com.rainbow.mapper;

import com.rainbow.ServerApplication;
import com.rainbow.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rainbow on 2016/9/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ServerApplication.class)
@WebAppConfiguration
@Transactional
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testFindAllUser() throws Exception {
        List<User> list=userMapper.findAllUser();
        for (User user:list){
            System.out.println("姓名是："+user.getName());
        }
    }
    @Test
    @Rollback
    public void testInsert() throws Exception {

        User user=new User();
        user.setName("张三");
        user.setAge(22);
        userMapper.insert(user);

    }
}