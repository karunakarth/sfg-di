package com.spring.sfgdi.services;

public class GreetingServiceFactyory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactyory(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
