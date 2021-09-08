package com.provider.service;

import com.api.service.UserService;
import com.api.pojo.User;
import com.provider.mapper.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService(loadbalance = "roundrobin")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        System.out.println("UserService 实现类中：注册用户");
        userMapper.insert(user);
    }

    @Override
    public User getUserById(Long id) {
        System.out.println("UserService 实现类中：根据id查询用户");
        return userMapper.selectById(id);
    }
}
