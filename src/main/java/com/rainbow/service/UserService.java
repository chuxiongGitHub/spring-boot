package com.rainbow.service;

import com.rainbow.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by rainbow on 2016/9/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */

public interface UserService {

    public List<User> findAllUser();

    public void save(User user);

    public void delete(long userId);


}
