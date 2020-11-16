package com.gengdan.demo.entity;

import lombok.Data;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/10/13 10:58
 */
@Data
public class HisUser {
    private long hisId;
    private String hisUserName;
    private String hisPassword;
    private String hisRealName;
}
