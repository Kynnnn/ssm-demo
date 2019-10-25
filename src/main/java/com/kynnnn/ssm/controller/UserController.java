package com.kynnnn.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.kynnnn.ssm.domain.User;
import com.kynnnn.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhudiwei
 * @description
 * @date 2019/10/25 16:45
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/queryUser")
    public String queryUser(@PathVariable("id") String id){
        User user = userService.queryUser(id);
        String userString = JSON.toJSONString(user);
        return userString;

    }

}