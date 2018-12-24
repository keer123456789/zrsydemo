package com.sjcl.zrsy_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/test")
    public String get(){
        return "hello world!!";
    }

    @PostMapping("/add")
    public void add(@RequestBody String a ){
        System.out.println(a);

    }

}
