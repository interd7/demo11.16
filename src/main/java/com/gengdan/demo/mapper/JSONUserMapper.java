package com.gengdan.demo.mapper;


import com.gengdan.demo.entity.HisUser;
import com.gengdan.demo.entity.JSONUser;
import com.gengdan.demo.entity.MyUser;
import com.gengdan.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
/**
 * Created by inter.d on 2020/11/5 7:15 下午
 */
@Mapper
@Component
public interface JSONUserMapper {
    JSONUser selectUserById(@Param("id")String id);
}
