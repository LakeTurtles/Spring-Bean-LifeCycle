package dev.nyusu.springcore.I18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import dev.nyusu.springcore.Services.greetingsService;

@Controller
public class i18NController {

    private final greetingsService greetingsService2;

    

    public i18NController(@Qualifier("i18NService") greetingsService greetingsService3) {
        this.greetingsService2 = greetingsService3;
    }



    public  String sayHello(){
        return greetingsService2.sayGreeting();
    }
}
