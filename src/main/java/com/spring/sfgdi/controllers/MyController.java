package com.spring.sfgdi.controllers;

import com.spring.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;
import org.w3c.dom.ls.LSOutput;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
