package com.gengdan.demo.service;

import com.gengdan.demo.entity.Account;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/10/27 09:10
 */
public interface AccountService {
    /**
     * 转钱接口的service层
     * @param outer
     * @param inner
     * @param money
     * @return 转钱是否成功
     */
    int transfer(int outer,int inner,Integer money);

    Account fineOneAccount(int id);
}
