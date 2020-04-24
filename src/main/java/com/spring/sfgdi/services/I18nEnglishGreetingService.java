package com.spring.sfgdi.services;

import org.springframework.stereotype.Service;

//@Profile({"EN","default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "HelloWorld - EN";
    }
}
