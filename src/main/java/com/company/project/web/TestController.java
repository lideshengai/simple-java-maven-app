package com.company.project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Lides
 * @Date: 2019/9/19 23:03
 */
@Controller
public class TestController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
