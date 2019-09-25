package com.baizhi.test;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class userTest {
    @Test
    public void test1(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserService userService1 =(UserService) ac.getBean("userService");
        //userService1.modifyregister(new User(null,"徐震","18","10000","hahah","男","112233"));
       /* List<User> list = userService1.showAll();
        for (User user : list) {
            System.out.println(user);
        }*/
        UserDao userDao = (UserDao) ac.getBean("userDao");
        /*User user = userDao.selectByNameAndPass("hahah", "112233");
        System.out.println(user);*/
        User user = userDao.selectById(1);
        //System.out.println(user);

        userDao.updateUser(new User(1,"haha","0","10","啊震","男","112233"));

        System.out.println(user);

    }
}
