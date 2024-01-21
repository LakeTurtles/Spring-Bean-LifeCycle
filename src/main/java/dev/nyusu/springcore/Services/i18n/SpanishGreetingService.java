package dev.nyusu.springcore.Services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import dev.nyusu.springcore.Services.greetingsService;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements greetingsService {

    @Override
    public String sayGreeting() {
       
        return "Hola desde el Servicio en Espanol";
    }


    
    
}
