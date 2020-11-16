package com.gengdan.demo.textmybatis;

import com.gengdan.demo.entity.User;
import com.gengdan.demo.mapper.UserMapper;
import io.swagger.models.auth.In;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
public class TextMybatisDemo04 {
    @Autowired
    UserMapper userMapper;

    @Test
    void selectByUserForeachListDynamicText01(){
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        List<User> userList=userMapper.selectByUserForeachListDynamic(list);
        Assertions.assertEquals(2,userList.size());

    }

    @Test
    void selectByUserForeachListDynamicText02(){
        Integer[] list=new Integer[]{1,2};
        List<User> userList=userMapper.selectByUserForeachArrayDynamic(list);
        Assertions.assertEquals(2,userList.size());

    }

    @Test
    void selectByUserForeachListDynamicText03(){
        Set<Integer> set=new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        List<User> userList=userMapper.selectByUserForeachSetDynamic(set);
        Assertions.assertEquals(3,userList.size());

    }
}
