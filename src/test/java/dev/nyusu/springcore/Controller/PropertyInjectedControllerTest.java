package dev.nyusu.springcore.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import dev.nyusu.springcore.Services.greetingServiceImp;

@SpringBootTest
public class PropertyInjectedControllerTest {


    @Autowired
    PropertyInjectedController propertyInjectedController;

    // @BeforeEach
    // void setUp(){
    //     propertyInjectedController = new PropertyInjectedController();
    //     propertyInjectedController.greetingsService1 = new greetingServiceImp();
    // }


    @Test
    void testSayHello() {

        System.out.println(propertyInjectedController.sayHello());
    }
}
