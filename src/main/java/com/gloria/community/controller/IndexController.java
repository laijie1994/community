package com.gloria.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author jeremy.lai
 * @Date 2019/7/9 4:46 PM
 * @Version 1.0
 **/

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
