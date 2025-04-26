package com.jenkins_learn.jenkins_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String hello() {
        return "<h1>Hello this is home page</h1>";
    }

    @GetMapping("/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name ;
    }
}
