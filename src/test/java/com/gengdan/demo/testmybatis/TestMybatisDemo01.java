package com.gengdan.demo.testmybatis;

import com.gengdan.demo.entity.Major;
import com.gengdan.demo.mapper.MajorMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author inter.d on 2020/11/24 11:22 上午
 */
@SpringBootTest
public class TestMybatisDemo01 {
    @Autowired
    MajorMapper majorMapper;
    @Test
    void testSelectOneMajorById(){
        String id = "1";
        Major major = majorMapper.selectOneMajor(id);
        int studentSum = major.getNewStudentList().size();
        Assertions.assertEquals(2,studentSum);
    }
}
