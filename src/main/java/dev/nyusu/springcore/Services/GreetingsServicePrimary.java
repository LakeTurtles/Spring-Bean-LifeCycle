package dev.nyusu.springcore.Services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingsServicePrimary implements greetingsService{


    @Override
    public String sayGreeting() {


        return "Greetings from Primary Service";

    }
}
