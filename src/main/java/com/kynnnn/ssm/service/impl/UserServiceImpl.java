package com.kynnnn.ssm.service.impl;

import com.kynnnn.ssm.domain.User;
import com.kynnnn.ssm.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author zhudiwei
 * @description
 * @date 2019/10/25 16:46
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public User queryUser(long userId) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }
}