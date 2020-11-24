package com.gengdan.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author inter.d on 2020/11/24 11:06 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Major {
    String majorId;
    String majorTitle;
    List<NewStudent> newStudentList;
}
