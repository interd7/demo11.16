package com.gengdan.demo.entity;

/**
 * Created by inter.d on 2020/11/3 9:15 上午
 * @author inter.d
 */
public class JSONUser {
    private String username;
    private String password;
    private String id;
    private String realname;

    public JSONUser(String username, String password, String id, String realname){
        this.username = username;
        this.password = password;
        this.id = id;
        this.realname = realname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

}
