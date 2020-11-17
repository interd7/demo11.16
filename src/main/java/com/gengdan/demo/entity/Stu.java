package com.gengdan.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author inter.d
 */
@Data
public class Stu implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String home;
    private String major;

}
