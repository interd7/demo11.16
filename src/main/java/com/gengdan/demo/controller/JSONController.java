package com.gengdan.demo.controller;

import com.gengdan.demo.entity.HomeInfo;
import com.gengdan.demo.entity.Student;
import com.gengdan.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inter.d on 2020/10/27 10:58 上午
 *
 * @author inter.d
 */
@Controller
@RequestMapping("user")
public class JSONController {

    @RequestMapping(value = "returnJSONType1", method = RequestMethod.GET)
    public @ResponseBody
    User returnJSONType1() {
        User oneUser = new User(1, "lss", "000629", "小李");
        return oneUser;
    }

    @RequestMapping(value = "returnJSONType2", method = RequestMethod.GET)
    public @ResponseBody
    List<User> returnJSONType2() {
        User oneUser1 = new User(1, "pig", "123456", "我是我");
        User oneUser2 = new User(1, "student", "654321", "我是你");
        List<User> userList = new ArrayList<>();
        userList.add(oneUser1);
        userList.add(oneUser2);
        return userList;
    }

    //    @RequestMapping(value = "returnJSONType3" ,method = RequestMethod.GET)
//    public @ResponseBody
//    List<Student> returnJSONType3(){
//        Student oneStudent1 = new Student(180809329,"dym","182","cs","beijing");
//        Student oneStudent2 = new Student(180809335,"sjw","182","cs","zhejiang");
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(oneStudent1);
//        studentList.add(oneStudent2);
//        return studentList;
//    }
    @RequestMapping(value = "returnJSONType4", method = RequestMethod.GET)
    public @ResponseBody
    List<Student> returnJSONType4() {
        HomeInfo homeInfo1 = new HomeInfo("山东", "济南", "和平路");
        HomeInfo homeInfo2 = new HomeInfo("北京", "北京", "教子胡同");
        HomeInfo homeInfo3 = new HomeInfo("北京", "北京", "牛富路");
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        student1.setHomeInfo(homeInfo1);
        student1.setId(180809323);
        student1.setMajor("计科");
        student1.setUserName("张三");
        student1.setUserClass("计科18-1班");
        student2.setUserClass("计科18-2班");
        student2.setId(180809000);
        student2.setHomeInfo(homeInfo2);
        student2.setMajor("数媒");
        student2.setUserName("李四");
        student2.setUserClass("数媒18-1班");
        student2.setId(180808123);
        student3.setHomeInfo(homeInfo3);
        student3.setMajor("电子");
        student3.setUserName("王五");
        student3.setUserClass("电子18-1班");
        student3.setId(180808321);

        return students;
    }
}
