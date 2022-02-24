package com.example.citest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String sayHey(){
        /*
          chedd.c.d,vd<';das
          ldvml;dmsl;d;l,dvs
          ldksvmlmlkdvmslmv
         */
        return "Hello Guys!!!!!";
    }

    @GetMapping("bye")
    public String sayBye(){
        return "Bye!!!!!";
    }
}
