package com.deni.gunawan.springsociallogingoogle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/hello")
public class HelloGoogleOauth {

    @GetMapping
    public String helloGoogle(){
        return "Hello Google ";

    }

    @GetMapping("/login")
    public String accesGranted(){
       return  "login berhasil, selamat ";
    }

}
