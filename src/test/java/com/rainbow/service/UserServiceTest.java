package com.rainbow.service;

import com.rainbow.ServerApplication;
import com.rainbow.entity.User;
import com.rainbow.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.jws.soap.SOAPBinding;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rainbow on 2016/9/19.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ServerApplication.class)
@WebAppConfiguration
public class UserServiceTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testFindAllUser() throws Exception {

        List<User> list=userMapper.findAllUser();
        for (User user:list){
            System.out.println("查询结果："+user.getName());
        }

    }
}