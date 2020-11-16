package com.gengdan.demo.service.impl;

import com.gengdan.demo.entity.Account;
import com.gengdan.demo.mapper.AccountMapper;
import com.gengdan.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author duanyimai
 * @version 1.0
 * @date 2020/10/27 09:54
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    @Transactional
    public int transfer(int outer, int inner, Integer money) {
        try{
            int isMoveInSuccess=accountMapper.moveIn(inner,money);
            int isMoveOutSuccess=accountMapper.moveOut(outer,money);
            if(isMoveInSuccess!=1 || isMoveOutSuccess!=1){
                throw new RuntimeException();
            }
        }catch (RuntimeException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
        return 1;
    }

    @Override
    public Account fineOneAccount(int id) {
        return null;
    }
}
