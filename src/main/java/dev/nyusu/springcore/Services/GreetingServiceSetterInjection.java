package dev.nyusu.springcore.Services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements greetingsService{


    @Override
    public String sayGreeting() {
        return "ServiceSetterInjection from the setterGreetingBean Service";
    }
}
