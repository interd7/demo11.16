package com.gengdan.demo.service.impl;

import com.gengdan.demo.entity.Stu;
import com.gengdan.demo.mapper.StudentMapper;
import com.gengdan.demo.service.StudentService;
import com.github.pagehelper.PageHelper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author inter.d
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

    @Override
    @Cacheable(value = "stu",key="'stu_'+#pageSize+#pageNumber")
    public List<Stu> findAllStudentForRedis(int pageSize, int pageNumber) {
        PageHelper.startPage(pageSize,pageNumber);
        return studentMapper.findAllStudent();
    }

}
