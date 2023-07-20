package cn.qqcn.service.impl;

import cn.qqcn.dao.UserMapper;
import cn.qqcn.entity.User;
import cn.qqcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.getUser(user);
    }
}
