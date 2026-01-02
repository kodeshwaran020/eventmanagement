package com.example.eventmanagement.service;

import com.example.eventmanagement.entity.User;
import com.example.eventmanagement.repository.Userrepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Userservice {

    private Userrepo urepo;
    public String adduser(List<User> u) {
        return urepo.saveAll(u) + " added successfully";

    }

    public List<User> getusers() {
        return urepo.findAll();
    }
}
