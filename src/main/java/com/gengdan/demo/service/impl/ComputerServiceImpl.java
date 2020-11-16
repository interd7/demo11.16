package com.gengdan.demo.service.impl;

import com.gengdan.demo.service.ComputerService;
import org.springframework.stereotype.Service;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/9/29 11:19
 */
@Service
public class ComputerServiceImpl implements ComputerService {

    @Override
    public float add(float a, float b) {
        return a+b;
    }

    @Override
    public float minus(float a, float b) {
        return a-b;
    }

    @Override
    public float multiplication(float a, float b) {
        return a*b;
    }

    @Override
    public float division(float a, float b) {
        return a/b;
    }
}
