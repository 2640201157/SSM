package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    //私有userDao   在spring文件中注入到userserviceImpl中
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User login(String userName, String password) {
        User user = userDao.selectByNameAndPass(userName, password);
        return user;
    }

    @Override
    public void modifyregister(User user) {
        userDao.insertUser(user);
        System.out.println(user);
    }

    @Override
    public void modifyupdateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<User> showAll() {
        List<User> list = userDao.selectAll();
        return list;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User selectById(Integer id) {
        User user = userDao.selectById(id);
        return user;
    }

    @Override
    public void modifydeleteById(Integer id) {
        userDao.deleteById(id);
    }
    /*写完service层 就应该去配置spring文件    配置事务*/
}
