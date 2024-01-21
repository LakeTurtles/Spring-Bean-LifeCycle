package dev.nyusu.springcore.Services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import dev.nyusu.springcore.Services.greetingsService;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements greetingsService {

    @Override
    public String sayGreeting() {
       
        return "Hello from the English Greeting Service";
    }

    
    
}
