package com.api.service;

import com.api.pojo.User;

/**
 * 用户服务接口
 */
public interface UserService {
    void register(User user);
    User getUserById(Long id);
}