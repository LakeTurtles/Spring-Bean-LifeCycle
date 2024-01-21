package dev.nyusu.springcore.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dev.nyusu.springcore.Services.greetingsService;

@Controller
public class ConstructorInjectedController {

    private final greetingsService greetingsService2;

    public ConstructorInjectedController(@Qualifier("greetingServiceImp") greetingsService greetingsService2) {
        this.greetingsService2 = greetingsService2;
    }

    public String sayHello(){
        return greetingsService2.sayGreeting();
    }
    
}
