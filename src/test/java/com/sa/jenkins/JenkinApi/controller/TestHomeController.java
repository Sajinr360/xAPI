package com.sa.jenkins.JenkinApi.controller;

import com.sa.jenkins.JenkinApi.service.HomeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestHomeController {

    @InjectMocks
    private HomeController homeController;

    @Mock
    private HomeService homeService;

    @Test
    public void testGetHomePage(){
        String value = "Home Page";
        Mockito.doReturn(value).when(homeService).getHomePage();
        String reponse = homeController.getHomePage();
        Assert.assertEquals(value, reponse);
    }

}
