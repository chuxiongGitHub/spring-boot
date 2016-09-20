package com.rainbow.controller;

import com.rainbow.entity.User;
import com.rainbow.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by rainbow on 2016/9/18.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    public String getUser(Model model) {
        List<User> list = userService.findAllUser();
        model.addAttribute("user", list);
        return "user/userList";
    }

    @RequestMapping(value = "/form")
    public String form() {
        logger.info("新增用户");
        return "user/form";
    }
    /**
     * 新增用户
     */
    @RequestMapping(value = "/save")
    public String save(User user){

      userService.save(user);
        return "redirect:/user/getUser";
    }

    /**
     * 删除用户
     */
    @RequestMapping(value = "/delete?userId={userId}")
    public String delete(@Param("userId") long userId){
        logger.info("删除数据。。");
        userService.delete(userId);
        return "redirect:/user/getUser";
    }
}
