package com.provider.mapper;

import com.api.pojo.User;

/**
 * 模拟数据库访问
 */
public interface UserMapper {
    void insert(User user);
    User selectById(Long id);
}