package com.gengdan.demo.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

  private Integer id;
  private String userName;
  private String passWord;
  private String realName;

  public User( Integer id,String userName, String passWord, String realName) {
    this.id = id;
    this.userName = userName;
    this.passWord = passWord;
    this.realName = realName;

  }
}
