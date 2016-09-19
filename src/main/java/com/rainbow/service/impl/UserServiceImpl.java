package com.rainbow.service.impl;

import com.rainbow.entity.User;
import com.rainbow.mapper.UserMapper;
import com.rainbow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rainbow on 2016/9/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {

        List<User> users = userMapper.findAllUser();

        return users;
    }

    @Override
    public void save(User user) {

        userMapper.insert(user);
    }
}
