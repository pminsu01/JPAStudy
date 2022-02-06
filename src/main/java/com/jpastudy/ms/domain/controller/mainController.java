package com.jpastudy.ms.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @GetMapping(value = "/timeout")
    public void issueTimeOut(){

    }

    @GetMapping(value = "/retrieveData")
    public void retrieveData(){

    }

}
