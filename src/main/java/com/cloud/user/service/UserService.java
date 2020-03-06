package com.cloud.user.service;

import com.cloud.user.pojo.User;

import java.util.List;

public interface UserService {

    User findByName(String name);

    List<User> selectAll();

    void update(User user);

    void add(User user);

    void deleteByName(String name);
}
