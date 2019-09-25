package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    public User selectByNameAndPass(@Param("userName") String userName, @Param("password") String password);
    public void insertUser(User user);
    public void deleteById(Integer id);
    public void updateUser(User user);
    public List<User>selectAll();
    public User selectById(Integer id);
}
