package com.sa.jenkins.JenkinApi.controller;

import com.sa.jenkins.JenkinApi.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    public String getHomePage(){
        return homeService.getHomePage();
    }
}
