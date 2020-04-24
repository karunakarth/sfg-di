package com.spring.sfgdi.config;

import com.spring.sfgdi.services.GreetingRepository;
import com.spring.sfgdi.services.GreetingService;
import com.spring.sfgdi.services.GreetingServiceFactyory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactyory greetingServiceFactyory(GreetingRepository repository){
        return new GreetingServiceFactyory(repository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactyory greetingServiceFactyory){
        return greetingServiceFactyory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactyory greetingServiceFactyory){
        return greetingServiceFactyory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactyory greetingServiceFactyory){
        return greetingServiceFactyory.createGreetingService("en");
    }
}
