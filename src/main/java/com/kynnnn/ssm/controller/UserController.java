package com.kynnnn.ssm.controller;


import com.alibaba.fastjson.JSON;
import com.kynnnn.ssm.domain.ResponseVO;
import com.kynnnn.ssm.domain.User;
import com.kynnnn.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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

    /**
     * @param id
     * @return
     */
    @RequestMapping("/showUser/{id}")
    public String queryUser(@PathVariable("id") long id) {
        User user = userService.queryUser(id);
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode("01");
        responseVO.setResponse(user);
        responseVO.setResult("success");
        String response = JSON.toJSONString(responseVO);
        return response;
    }

    /**
     * 添加用户
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@RequestBody User user) {
        int i = userService.addUser(user);
        ResponseVO responseVO = new ResponseVO();
        String response = null;
        if (i > 0) {
            responseVO.setCode("01");
            responseVO.setResult("success");
            response = JSON.toJSONString(responseVO);
        } else {
            responseVO.setCode("02");
            responseVO.setResult("fail");
            response = JSON.toJSONString(responseVO);
        }
        return response;
    }

}