package com.gengdan.demo.mapper;

import com.gengdan.demo.entity.Major;
import com.gengdan.demo.entity.NewStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author inter.d on 2020/11/24 11:16 上午
 */
@Mapper
@Component
public interface MajorMapper {
    Major selectOneMajor(@Param("majorId") String majorId);
}
