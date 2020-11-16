//package com.gengdan.demo.textmybatis;
//
//import com.gengdan.demo.entity.HisUser;
//import com.gengdan.demo.entity.MyUser;
//import com.gengdan.demo.entity.User;
//import com.gengdan.demo.mapper.UserMapper;
//import org.junit.Assert;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.HashMap;
//import java.util.List;
//
///**
// * @author ShiJiaWei
// * @version 1.0
// * @date 2020/10/13 08:59
// */
//@SpringBootTest
//public class TextMybatisDemo01 {
//
//    @Autowired
//    UserMapper userMapper;
//
//    @Test
//    void textSelectUserByUsernameAndPassword(){
//        String userName="lisi";
//        String password="123456";
//        List<User> userList=userMapper.selectUserByUserNameAndPassWord(userName,password);
//        Assertions.assertEquals(1,userList.size());
//    }
//
//
//    @Test
//    void insertOneUser(){
//        String myName="sjw";
//        String myPassword="123456";
//        String myRealName="帅";
//        MyUser myUser=new MyUser();
//        myUser.setMyName(myName);
//        myUser.setMyPassword(myPassword);
//        myUser.setMyRealName(myRealName);
//        int isInsert=userMapper.insertOneUser(myUser);
//        Assertions.assertEquals(1,isInsert);
//    }
//
//    @Test
//    void insertOneMapUser(){
//        String myName="sjw";
//        String myPassword="123456";
//        String myRealName="帅";
//        HashMap hashMap=new HashMap();
//        hashMap.put("key1",myName);
//        hashMap.put("key2",myPassword);
//        hashMap.put("key3",myRealName);
//        int isInsert=userMapper.insertOneMapUser(hashMap);
//        Assertions.assertEquals(1,isInsert);
//    }
//
//    @Test
//    void selectHisUserById(){
//        HisUser hisUser=userMapper.selectHisUserById(3);
//        Assertions.assertNotNull(hisUser);
//        Assertions.assertEquals("wangwu",hisUser.getHisUserName());
//        Assertions.assertEquals("654321",hisUser.getHisPassword());
//        Assertions.assertEquals("王五",hisUser.getHisRealName());
//    }
//
//    @Test
//    void textArray(){
//        String[] name1={"pig","dog","egg"};
//        String[] name2={"pig","dog","egg"};
//        Assertions.assertArrayEquals(name1,name2);
//    }
//
//}
