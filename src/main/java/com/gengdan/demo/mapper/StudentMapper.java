package com.gengdan.demo.mapper;

import com.gengdan.demo.entity.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface StudentMapper {
    List<Stu> findAllStudent();

}
