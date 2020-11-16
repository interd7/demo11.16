package com.gengdan.demo.mapper;

import com.gengdan.demo.entity.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by inter.d on 2020/11/10 2:53 下午
 * @author inter.d
 */
@Mapper
@Component
public interface StudentMapper {
    List<Stu> findAllStudent();

}
