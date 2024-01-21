package dev.nyusu.springcore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dev.nyusu.springcore.Services.greetingsService;


@Controller
public class SetterInjectedController {



    private greetingsService greetingsService2;
    @Autowired
    @Qualifier("setterGreetingBean")
    public void setGreetingService( greetingsService greetingsService3) {

        System.out.println("Red Bull Flutag");
        this.greetingsService2 = greetingsService3;
    }
    

    public String sayHello(){
        return greetingsService2.sayGreeting();
    }
}
