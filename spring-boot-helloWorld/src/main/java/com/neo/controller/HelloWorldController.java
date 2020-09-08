package com.neo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${name:lxk-192.168.1.136:9300}")
    private String name;


    @RequestMapping("/hello")
    public String index() {
        return name;
    }
}