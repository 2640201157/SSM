package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
@Controller   //创建action的实现类对象
@Scope(value = "prototype")   //因为struts2是多例的  所以 这里要设置  每次都创建对象
public class UserAction extends ActionSupport {
    //spring注入
    @Autowired
    private UserService userService;
    //前台接收
    private User user;
    //后台到前台
    private List<User> list;
    private User user1;

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    //登录
    public  String login(){

       user1 = userService.login(user.getUserName(), user.getPassword());
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("user1",user1);
        if (user1.getUserName().equals(user.getUserName())){

            return "success";
        }else {
            return "error";
        }

    }

    //注册
    public String register(){
        userService.modifyregister(user);
        return "success";
    }
    //添加
    public String addUser(){
        userService.modifyregister(user);
        return "success";
    }

    //修改
    public String updateUser(){

        userService.modifyupdateUser(user);
        return "success";
    }
    //修改
    public String toUpdate(){
       // HttpServletRequest request = ServletActionContext.getRequest();
        user = userService.selectById(this.user.getId());
        //System.out.println(user+"************");
        return "success";
    }
    //展示所有
    public String showAll(){
        list = userService.showAll();
      //  System.out.println(list+"-----------------");
        return "success";
    }
    //根据用户id查一个
    public String selectById(){
        userService.selectById(user.getId());
        return "success";
    }
    //根据id删除一个用户
    public String deleteById(){
        userService.modifydeleteById(user.getId());
        return "success";
    }
    /*写完action就要在spring文件中配置*/
}
