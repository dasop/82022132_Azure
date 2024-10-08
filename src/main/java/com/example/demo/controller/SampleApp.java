package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleApp{

    @GetMapping("82022132.ce-aa.kubepia.net/api/v1/user")
    public String getId(){
        String idNo = "82022132";
        return idNo;
    }

}