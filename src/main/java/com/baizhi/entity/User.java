package com.baizhi.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String zhenName;
    private String age;
    private String salary;
    private String userName;
    private String sex;
    private String password;

    public User(Integer id, String zhenName, String age, String salary, String userName, String sex, String password) {

        this.id = id;
        this.zhenName = zhenName;
        this.age = age;
        this.salary = salary;
        this.userName = userName;
        this.sex = sex;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", zhenName='" + zhenName + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZhenName() {
        return zhenName;
    }

    public void setZhenName(String zhenName) {
        this.zhenName = zhenName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
