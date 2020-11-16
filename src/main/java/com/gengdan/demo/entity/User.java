package com.gengdan.demo.entity;


import lombok.Data;

/**
 * @author inter.d
 */
@Data
public class User {

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
