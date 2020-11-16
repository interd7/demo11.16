package com.gengdan.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/9/22 09:31
 */
@Controller
@Api(value = "计算器", tags = "计算器API")
public class CalculatorController {

    @ApiOperation(value = "首页", notes = "首页")
    @GetMapping("index")
    String index(){
        return "calculator";
    }

    @GetMapping("submitAction")
    String submitAction(@RequestParam("first") String first,
                        @RequestParam("second") String second,
                        @RequestParam("operator") String operator, Model model){
        int result=0;
        int intFirst=Integer.parseInt(first);
        int intSecond=Integer.parseInt(second);
        if(operator.equals("+")){
            result=intFirst+intSecond;
        }else if(operator.equals("-")){
            result=intFirst-intSecond;
        }else if(operator.equals("*")){
            result=intFirst*intSecond;
        }else if(operator.equals("/")){
            result=intFirst/intSecond;
        }else{

        }
        model.addAttribute("result",result);
        return "result";
    }
}
