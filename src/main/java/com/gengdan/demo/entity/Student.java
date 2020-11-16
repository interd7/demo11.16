package com.gengdan.demo.entity;

import lombok.Data;

/**
 * Created by inter.d on 2020/10/27 11:31 上午
 * @author inter.d
 */
@Data
public class Student {
    private Integer id;
    private String userName;
    private String userClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

//    public String getHome() {
//        return home;
//    }
//
//    public void setHome(String home) {
//        this.home = home;
//    }

    public HomeInfo getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(HomeInfo homeInfo) {
        this.homeInfo = homeInfo;
    }

    private String major;
//    private String home;
    private HomeInfo homeInfo;

//    public Student(Integer id, String userName, String userClass, String major, String home) {
//        this.id = id;
//        this.userName = userName;
//        this.userClass = userClass;
//        this.major = major;
//        this.home = home;
//    }
}