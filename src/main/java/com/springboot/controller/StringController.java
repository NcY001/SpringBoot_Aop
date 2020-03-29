package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aop")
public class StringController {
    @GetMapping("/string")
    public String returnString(String name){
        return "hello"+name;
    }
}
