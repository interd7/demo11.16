package com.gengdan.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Stu implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String home;
    private String major;

}
