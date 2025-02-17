package com.Test.jenkins_Test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomePage {


    @RequestMapping("/home")
    public String home() {
        return "Welcome to Jenkins Test Application!";
    }

    @RequestMapping("")
    public String home1() {
        return "Welcome to Jenkins Test Application!";
    }
}
