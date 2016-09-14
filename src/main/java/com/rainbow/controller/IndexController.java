package com.rainbow.controller;

import com.rainbow.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rainbow on 2016/9/14.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/tt")
    public String index() {
        logger.info("进入到index方法");
        return "index";
    }
}
