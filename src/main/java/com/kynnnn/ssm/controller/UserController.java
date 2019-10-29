package com.kynnnn.ssm.controller;


import com.alibaba.fastjson.JSON;
import com.kynnnn.ssm.domain.User;
import com.kynnnn.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author zhudiwei
 * @description
 * @date 2019/10/25 16:45
 */
@RestController
@RequestMapping(value = "/user", produces = {"application/json;", "text/html;charset=utf-8"})
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public String queryUser(@PathVariable("id") long id) {
        User user = userService.queryUser(id);
        String userString = JSON.toJSONString(user);
        return userString;
    }

}