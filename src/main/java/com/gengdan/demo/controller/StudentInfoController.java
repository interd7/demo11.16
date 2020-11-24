package com.gengdan.demo.controller;

import com.gengdan.demo.entity.JSONPage;
import com.gengdan.demo.entity.Stu;
import com.gengdan.demo.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("student")
public class StudentInfoController {
    final StudentService studentService;

    public StudentInfoController(StudentService studentService) {
        this.studentService = studentService;
    }


    @RequestMapping(value = "myStudentInfo", method = RequestMethod.POST)
    public @ResponseBody
    PageInfo<Stu> myStudentInfo(@RequestBody JSONPage pageInfo) {
        long startTime = System.currentTimeMillis();
        List<Stu> all = studentService.findAllStudentForRedis(pageInfo.getPageSize(),
                pageInfo.getPageNumber());
        PageInfo<Stu> studentinfo = new PageInfo(all);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
        return studentinfo;
    }


    @GetMapping("ShowStudentInfo")
    String showPage() {
        System.out.println("showStudentInfo");

        return "showStudentInfoJSON";
    }

    @GetMapping("changePage")
    @ResponseBody
    public int changePage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return Integer.parseInt(request.getParameter("dataNum"));
    }


}
