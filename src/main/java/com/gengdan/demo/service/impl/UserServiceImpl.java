package com.gengdan.demo.service.impl;

import com.gengdan.demo.entity.MyUser;
import com.gengdan.demo.entity.User;
import com.gengdan.demo.mapper.UserMapper;
import com.gengdan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author DuanYimai
 * @version 1.0
 * @date 2020/10/6 10:36
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectUserById(int id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public int isSelectUserNameExist(String userName) {
        List<User> isExist=userMapper.selectByUserByUserName(userName);
        if(isExist.isEmpty()){
            return 0;
        }
        return 1;
    }

    @Override
    public int insertOneUser(String userName, String password) {
        MyUser myUser=new MyUser();
        myUser.setMyName(userName);
        myUser.setMyPassword(password);
        int isInsert=userMapper.insertOneUser(myUser);
        return isInsert;
    }
    @Override
    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }
}
