package com.cloud.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<User> {

    User findByName(@Param("name") String name);

    List<User> selectAll();

    void update(User user);

    void add(User user);

    void deleteByName(String name);
}
