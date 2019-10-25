package com.kynnnn.ssm.service;

import com.kynnnn.ssm.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author zhudiwei
 * @description
 * @date 2019/10/25 16:45
 */
@Service
public interface IUserService {

    /**
     * 查询单个用户
     * @param userId
     * @return
     */
    User queryUser(String userId);

    /**
     * 添加一个用户
     * @param user
     * @return
     */
    int addUser(User user);
}
