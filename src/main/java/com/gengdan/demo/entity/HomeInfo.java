package com.gengdan.demo.entity;

import lombok.Data;

/**
 * Created by inter.d on 2020/10/27 11:40 上午
 * @author inter.d
 */
@Data
public class HomeInfo {
    private String province;
    private String city;
    private String street;
    public HomeInfo(String province, String city, String street) {
        this.province=province;
        this.city=city;
        this.street=street;
    }
}
