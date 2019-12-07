package com.quellan.zlflovemm.controller.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Demo
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/18 13:34
 * @Version 1.0
 */

@RestController
@CrossOrigin(origins = "*")
public class Demo {

    @RequestMapping("/")
    public String demo(){
        return "hello world";
    }
}
