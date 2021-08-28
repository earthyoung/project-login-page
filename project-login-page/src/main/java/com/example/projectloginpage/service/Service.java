package com.example.projectloginpage.service;

import com.example.projectloginpage.controller.RestApiController;
import com.example.projectloginpage.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.View;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private final Repository repository;

    public Service(Repository repository){
        this.repository = repository;
    }

    public boolean check(Long id, String password){
        return checkId(id) && checkPassword(password);
    }

    private boolean checkId(Long id){
        return repository.checkId(id);
    }

    private boolean checkPassword(String password){
        return repository.checkPassword(password);
    }

}
