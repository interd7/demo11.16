package com.gengdan.demo.controller;

import com.gengdan.demo.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author inter.d
 * @version 1.0
 * @date 2020/9/22 09:31
 */
@Controller
@RequestMapping("computer")
public class ComputerController {

    @Autowired
    ComputerService computerService;

    @GetMapping("index")
    String index(){
        return "calculator";
    }

    @GetMapping("submitAction")
    String submitAction(@RequestParam("first") String first,
                        @RequestParam("second") String second,
                        @RequestParam("operator") String operator, Model model){
        float result=0;
        float intFirst=Float.parseFloat(first);
        float intSecond=Float.parseFloat(second);
        if(operator.equals("+")){
            result=computerService.add(intFirst,intSecond);
        }else if(operator.equals("-")){
            result=computerService.minus(intFirst,intSecond);
        }else if(operator.equals("*")){
            result=computerService.multiplication(intFirst,intSecond);
        }else if(operator.equals("/")){
            result=computerService.division(intFirst,intSecond);
        }else{

        }
        model.addAttribute("result",result);
        return "result";
    }
}
