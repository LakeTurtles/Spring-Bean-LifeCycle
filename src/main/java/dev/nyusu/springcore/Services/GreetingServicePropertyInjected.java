package dev.nyusu.springcore.Services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements greetingsService{


    @Override
    public String sayGreeting() {
        return "Friends don't let friends do property injection!";
    }
}
