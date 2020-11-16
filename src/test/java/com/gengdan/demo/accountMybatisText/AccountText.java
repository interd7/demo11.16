package com.gengdan.demo.accountMybatisText;

import com.gengdan.demo.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author duanyimai
 * @version 1.0
 * @date 2020/10/27 09:55
 */
@SpringBootTest
public class AccountText {

    @Autowired
    private AccountService accountService;

    @Test
    void Text1(){
        int isTrue=accountService.transfer(2,1,5000);
        Assertions.assertEquals(isTrue,1);
    }
}
