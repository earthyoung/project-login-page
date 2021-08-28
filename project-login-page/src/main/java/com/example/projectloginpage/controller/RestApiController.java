package com.example.projectloginpage.controller;

import com.example.projectloginpage.model.User;
import com.example.projectloginpage.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @Autowired
    private final Service service;

    public RestApiController(Service service){
        this.service = service;
    }

    @GetMapping("/get/{id}/{password}")
    public boolean get(@PathVariable Long id, @PathVariable String password){
        return service.check(id, password);
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
        boolean result = !(service.check(user.getId(), user.getPassword()));
        if(result==true) return user;
        return null;
    }

}
