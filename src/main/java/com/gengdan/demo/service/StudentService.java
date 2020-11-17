package com.gengdan.demo.service;

import com.gengdan.demo.entity.Stu;
import java.util.List;
public interface StudentService {
    List<Stu> findAllStudent();

    List<Stu> findAllStudentForRedis(int pageNumber,int pageSize);

}
