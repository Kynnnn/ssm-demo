package com.kynnnn.ssm.dao;

import com.kynnnn.ssm.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author zhudiwei
 * @description
 * @date 2019/10/25 16:45
 */
public interface IUserDao {
    User queryUser(long userId);
}
