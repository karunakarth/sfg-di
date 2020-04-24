package com.spring.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Primary I HelloWorld";
    }
}
