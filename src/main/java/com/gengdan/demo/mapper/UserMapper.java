package com.gengdan.demo.mapper;


import com.gengdan.demo.entity.HisUser;
import com.gengdan.demo.entity.MyUser;
import com.gengdan.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Mapper
@Component
public interface UserMapper {

    User selectUserById(@Param("id") int id);

    List<User> selectUserByUserNameAndPassWord(@Param("userName") String userName,
                                               @Param("password") String password);

    int insertOneUser(MyUser myUser);

    int insertOneMapUser(HashMap hashMap);

    HisUser selectHisUserById(@Param("id") int id);

    List<User> selectByUserDynamic(User user);

    List<User> selectByUserChooseDynamic(User user);

    List<User> selectByUserForeachListDynamic(List<Integer> idList);

    List<User> selectByUserForeachArrayDynamic(Integer[] idArray);

    List<User> selectByUserForeachSetDynamic(Set<Integer> idSet);

    List<User> selectByUserByUserName(@Param("userName") String userName);

    List<User> findAllUser();
}
