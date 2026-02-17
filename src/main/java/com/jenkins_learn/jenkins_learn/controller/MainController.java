package com.jenkins_learn.jenkins_learn.controller;

import com.example.demo.api.ProfilesApi;
import com.example.demo.model.BaseProfile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class MainController implements ProfilesApi {
    @GetMapping("/")
    public String hello() {
        return "<h1>Hello this is home page</h1>";
    }

    @GetMapping("/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name + " this is names greeting page";
    }

    @GetMapping("/jenkins")
    public String jenkins() {
        return "Jenkins testing!!";
    }

    @GetMapping("/health")
    public String health() {
        return "ok";
    }


    @Override
    public ResponseEntity<BaseProfile> profilesPost(BaseProfile baseProfile) {
        System.out.println(baseProfile);
        BaseProfile baseProfile1=new BaseProfile(UUID.randomUUID().toString(), "FamilyProfile");
        return new ResponseEntity<>(baseProfile1, HttpStatus.OK);
    }
}
