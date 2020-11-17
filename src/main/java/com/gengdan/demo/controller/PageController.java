package com.gengdan.demo.controller;

import com.gengdan.demo.entity.JSONPage;
import com.gengdan.demo.entity.User;
import com.gengdan.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by inter.d on 2020/11/10 8:49 上午
 * @author inter.d
 */
@org.springframework.stereotype.Controller
@RequestMapping("user")
public class PageController {
    final UserService userService;
    public PageController(UserService userService){this.userService = userService;}
    @RequestMapping( value = "myCurrentPage1",method = RequestMethod.GET)
    public String myCurrentPage1(@RequestParam(defaultValue = "4", value = "pageSize") int pageSize,
                                 @RequestParam(defaultValue = "1", value = "pageNumber") int pageNumber,
                                 Model model){
        PageHelper.startPage(pageNumber,pageSize);
        List<User> userList = userService.findAllUser();
        PageInfo<User> pageInfo = new PageInfo(userList);
        model.addAttribute("pageInfo",pageInfo);
        return "showUserPageInfo";
    }
//    @RequestMapping(value = "myCurrentPage0",method = RequestMethod.POST)
//    public @ResponseBody
//    PageInfo<User> myCurrentPage0(@RequestBody JSONPage pageInfo){
//        PageHelper.startPage(pageInfo.getPageNumber(),
//                pageInfo.getPageSize());
//        List<User> all = userService.findAllUser();
//        PageInfo<User> info = new PageInfo(all);
//        return info;
//    }

    @GetMapping("ShowUserPageInfoJSON")
    String showPage(){
        System.out.println("showPage");
        return "showUserPageInfoJSON";
    }

    @RequestMapping( value = "pageRedis",method = RequestMethod.GET)
    public String pageRedis(@RequestParam(defaultValue = "4", value = "pageSize") int pageSize,
                                 @RequestParam(defaultValue = "1", value = "pageNumber") int pageNumber,
                                 Model model){
        List<User> userList = userService.findAllUserForRedis(pageSize,pageNumber);
        PageInfo<User> pageInfo = new PageInfo(userList);
        model.addAttribute("pageInfo",pageInfo);
        return "showUserPageInfo";
    }
}
