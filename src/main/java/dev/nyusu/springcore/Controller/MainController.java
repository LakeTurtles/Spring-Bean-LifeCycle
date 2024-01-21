package dev.nyusu.springcore.Controller;

import org.springframework.stereotype.Controller;

import dev.nyusu.springcore.Services.greetingServiceImp;
import dev.nyusu.springcore.Services.greetingsService;

@Controller
public class MainController {

    private final greetingsService greetingsService1;
    

    

    public MainController() {
        this.greetingsService1 = new greetingServiceImp();
    }



    


    public String sayHello(){
        
        return greetingsService1.sayGreeting();
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }


    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
    
}
