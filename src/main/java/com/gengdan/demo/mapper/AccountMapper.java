package com.gengdan.demo.mapper;

import com.gengdan.demo.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/10/27 08:54
 */
@Mapper
@Component
public interface AccountMapper {

    int moveIn(@Param("myId") int id, @Param("myMoney") double money);

    int moveOut(@Param("myId") int id, @Param("myMoney") double money);

    Account fineOneAccount(@Param("myId") int id);

}
