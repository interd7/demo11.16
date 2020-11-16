package com.gengdan.demo.service.impl;

import com.gengdan.demo.entity.JSONUser;
import com.gengdan.demo.mapper.JSONUserMapper;
import com.gengdan.demo.service.JSONUserService;
import org.springframework.stereotype.Service;

/**
 * Created by inter.d on 2020/11/5 7:14 下午
 */
@Service
public class JSONUserServiceImpl implements JSONUserService {

    private final JSONUserMapper jsonUserMapper;


    public JSONUserServiceImpl(JSONUserMapper jsonUserMapper){
        this.jsonUserMapper = jsonUserMapper;
    }

    @Override
    public JSONUser selectUserById(String id) {
        return jsonUserMapper.selectUserById(id);
    }

}
