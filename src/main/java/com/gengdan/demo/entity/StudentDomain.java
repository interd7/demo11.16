package com.gengdan.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author inter.d on 2020/11/24 8:55 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDomain {
    private String name;
    private Integer age;
}
