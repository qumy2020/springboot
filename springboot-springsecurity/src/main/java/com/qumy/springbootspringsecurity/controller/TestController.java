package com.qumy.springbootspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author qumy
 * @since 2022/6/10 10:42
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public String get(){
        return "/get";
    }

    @GetMapping("/exclude/get")
    public String excludeGet(){
        return "/exclude/get";
    }

}
