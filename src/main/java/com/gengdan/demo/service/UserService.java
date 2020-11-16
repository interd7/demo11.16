package com.gengdan.demo.service;

import com.gengdan.demo.entity.MyUser;
import com.gengdan.demo.entity.User;

import java.util.HashMap;
import java.util.List;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/10/6 10:35
 */
public interface UserService {
    User selectUserById(int id);

    int isSelectUserNameExist(String userName);

    int insertOneUser(String userName,String password);

    List<User> findAllUser();
}
