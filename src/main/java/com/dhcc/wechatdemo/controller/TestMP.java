package com.dhcc.wechatdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 小程序登录调试
 * @author: Liu Denghui
 * @time: 2020/1/6 17:05
 */
@RestController
public class TestMP {
    private Logger logger= LoggerFactory.getLogger(TestMP.class);

    @RequestMapping("/login")
    public boolean login(String name, String pwd){
        logger.info("开始验证");
        if (name.equals("123") && pwd.equals("123")){
            logger.info("验证成功");
            return true;
        }
        logger.error("验证失败");
        return false;
    }
}
