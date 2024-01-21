package dev.nyusu.springcore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import dev.nyusu.springcore.Services.greetingsService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    greetingsService greetingsService1;

    public String sayHello() {
        return greetingsService1.sayGreeting();
    }
    
}
