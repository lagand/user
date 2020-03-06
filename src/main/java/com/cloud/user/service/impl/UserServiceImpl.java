package com.cloud.user.service.impl;

import com.cloud.user.dao.UserDao;
import com.cloud.user.pojo.User;
import com.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void add(User user) {

    }

    @Override
    public void deleteByName(String name) {

    }
}
