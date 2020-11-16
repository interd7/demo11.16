package com.gengdan.demo.service.impl;

import com.gengdan.demo.entity.Stu;
import com.gengdan.demo.mapper.StudentMapper;
import com.gengdan.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * description:
 *@param:
 *@return:
 *@author YimaiDuan
 *@date 2020/11/10
 */
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;
    public StudentServiceImpl(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }
    @Override
    public List<Stu> findAllStudent(){
        return studentMapper.findAllStudent();
    }

}
