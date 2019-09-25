package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //登录
    public User login(String userName,String password);
    //注册
    public void modifyregister(User user);
    //修改
    public void modifyupdateUser(User user);
    //展示所有
    public List<User> showAll();
    //根据用户id查一个
    public User selectById(Integer id);
    //根据id删除一个用户
    public void modifydeleteById(Integer id);
}
