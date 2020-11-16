package com.gengdan.demo.entity;

import lombok.Data;

/**
 * @author duanyimai
 * @version 1.0
 * @date 2020/10/13 09:58
 */

@Data
public class MyUser {
    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyPassword() {
        return myPassword;
    }

    public void setMyPassword(String myPassword) {
        this.myPassword = myPassword;
    }

    public String getMyRealName() {
        return myRealName;
    }

    public void setMyRealName(String myRealName) {
        this.myRealName = myRealName;
    }

    private String myName;
    private String myPassword;
    private String myRealName;
}
