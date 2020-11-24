package com.gengdan.demo.service;

import com.gengdan.demo.entity.Stu;
import java.util.List;
/**
 * @author inter.d
 */
public interface StudentService {
    List<Stu> findAllStudent();

    List<Stu> findAllStudentForRedis(int pageSize,int pageNumber);

}
