package dev.nyusu.springcore.Services;

import org.springframework.stereotype.Service;

@Service
public class greetingServiceImp implements greetingsService {

    @Override
    public String sayGreeting() {
        
        return "Greetins from the Greetings Service";
    }

    
    
}
