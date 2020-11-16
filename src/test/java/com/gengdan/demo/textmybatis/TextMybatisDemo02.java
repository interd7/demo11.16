//package com.gengdan.demo.textmybatis;
//
//import com.gengdan.demo.entity.User;
//import com.gengdan.demo.mapper.UserMapper;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
///**
// * @author ShiJiaWei
// * @version 1.0
// * @date 2020/10/20 08:54
// */
//@SpringBootTest
//public class TextMybatisDemo02 {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    void selectDynamicText1(){
//        User user=new User("","","",);
//        List<User> userList=userMapper.selectByUserDynamic(user);
//        Assertions.assertEquals(10,userList.size());
//    }
//
//    @Test
//    void selectDynamicText2(){
//        User user=new User("sjw","","",);
//        List<User> userList=userMapper.selectByUserDynamic(user);
//        Assertions.assertEquals(6,userList.size());
//    }
//
//    @Test
//    void selectDynamicText3(){
//        User user=new User("","123456","",);
//        List<User> userList=userMapper.selectByUserDynamic(user);
//        Assertions.assertEquals(8,userList.size());
//    }
//
//
//    @Test
//    void selectDynamicText4(){
//        User user=new User("","","帅",);
//        List<User> userList=userMapper.selectByUserDynamic(user);
//        Assertions.assertEquals(6,userList.size());
//    }
//
//    @Test
//    void selectDynamicText5(){
//        User user=new User("sjw","123456","");
//        List<User> userList=userMapper.selectByUserDynamic(user);
//        Assertions.assertEquals(6,userList.size());
//    }
//
//    @Test
//    void selectDynamicText6(){
//        User user=new User("sjw","","帅");
//        List<User> userList=userMapper.selectByUserDynamic(user);
//        Assertions.assertEquals(6,userList.size());
//    }
//
//    @Test
//    void selectDynamicText7(){
//        User user=new User("","123456","帅");
//        List<User> userList=userMapper.selectByUserDynamic(user);
//        Assertions.assertEquals(6,userList.size());
//    }
//
//    @Test
//    void selectDynamicText8(){
//        User user=new User("sjw","123456","帅");
//        List<User> userList=userMapper.selectByUserDynamic(user);
//        Assertions.assertEquals(6,userList.size());
//    }
//}
