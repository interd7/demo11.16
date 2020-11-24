package com.gengdan.demo.controller;

import com.gengdan.demo.entity.JSONPage;
import com.gengdan.demo.entity.Stu;
import com.gengdan.demo.entity.Student;
import com.gengdan.demo.entity.User;
import com.gengdan.demo.service.StudentService;
import com.gengdan.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.List;
/**
 * description:
 *@param: [pageInfo]
 *@return: java.util.List<com.gengdan.demo.entity.Stu>
 *@author YimaiDuan
 *@date 2020/11/24
 */
@Controller
@RequestMapping("student")
@Slf4j
public class LoggingController {
    final StudentService studentService;

    public LoggingController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "myCurrentPage3", method = RequestMethod.POST)
    public @ResponseBody
    List<Stu> myCurrentPage3(@RequestBody JSONPage pageInfo){
        log.trace("level is trace");
        log.debug("level is debug");
        log.info("level is info");
        log.warn("level is warn");
        log.error("level is error");
        return studentService.findAllStudentForRedis(pageInfo.getPageNumber(),pageInfo.getPageSize());

    }
}
