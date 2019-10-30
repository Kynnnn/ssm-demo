package com.kynnnn.ssm.service.impl;

import com.kynnnn.ssm.dao.IUserDao;
import com.kynnnn.ssm.domain.User;
import com.kynnnn.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhudiwei
 * @description
 * @date 2019/10/25 16:46
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao  userDao;

    @Override
    public User queryUser(long userId) {
        return userDao.queryUser(userId);
    }

    @Override
    public int addUser(User user) {
        return 0;
    }
}