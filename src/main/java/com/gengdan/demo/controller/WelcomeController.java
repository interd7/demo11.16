package com.gengdan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjirong
 * @version 1.0
 * @package edu.gengdan.mydemo.Controller
 * @file WelcomeController.java
 * @description
 * @time 2020/9/7 22:39
 */
@Controller
public class WelcomeController {

    @RequestMapping("/myspring")
    public String index(Model model){
        model.addAttribute("message","我是施嘉伟，学号是180809335");
        return "index";
    }

}
