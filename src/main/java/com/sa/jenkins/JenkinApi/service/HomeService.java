package com.sa.jenkins.JenkinApi.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getHomePage() {
        return "Home Page";
    }

}
