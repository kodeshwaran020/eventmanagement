package com.example.eventmanagement.controller;

import com.example.eventmanagement.Mano;
import com.example.eventmanagement.entity.User;
import com.example.eventmanagement.service.Userservice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Usercontroller {

    Userservice userservice;

    @GetMapping("/h")
    public String go() {
        return "hello";
    }

    @PostMapping("/adduser")
    public String adduser(@RequestBody List<User> u) {
        return userservice.adduser(u);

    }

    @GetMapping("/getusers")
    public List<User> getusers() {
        return userservice.getusers();
    }
}


