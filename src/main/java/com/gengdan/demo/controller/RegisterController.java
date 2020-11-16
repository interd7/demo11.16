package com.gengdan.demo.controller;

import com.gengdan.demo.entity.User;
import com.gengdan.demo.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/9/15 09:00
 */

@Controller
@Api(value = "用户注册", tags = "用户注册API")
public class RegisterController {

    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "showRegisterForm", method = RequestMethod.GET)
    public String showOneForm() {
        return "register";
    }

    @GetMapping("registerAction")
    public String loginAction(@RequestParam("username") String userName,
                       @RequestParam("password") String userPassword, Model model){
        int isExist=userService.isSelectUserNameExist(userName);
        if(isExist==1){
            return "registerError";
        }
        userService.insertOneUser(userName,userPassword);
        return "registerSuccess";
    }

}
