package com.gengdan.demo.service;

import com.gengdan.demo.entity.JSONUser;

/**
 * Created by inter.d on 2020/11/5 7:14 下午
 * @author inter.d
 */
public interface JSONUserService {

    JSONUser selectUserById(String id);
}
