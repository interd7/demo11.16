package com.gengdan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author inter.d
 * @version 1.0
 * @date 2020/9/8 10:01
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/helloWorld", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello Spring");
        return "index";
    }
}
