package com.rainbow.controller.restful;

import com.rainbow.dto.JsonResult;
import com.rainbow.entity.User;
import com.rainbow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rainbow on 2016/9/19.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@RestController
@RequestMapping(value = "/user")
public class UserInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userInfo")
    public JsonResult<User> userInfo() {

        JsonResult<User> result;
        try {
            List<User> list = userService.findAllUser();
            result = new JsonResult<User>(true, list.toString());
        } catch (Exception e) {
            result = new JsonResult<User>(false, "返回失败");
        }
        return result;
    }
}
