package dev.nyusu.springcore.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.nyusu.springcore.Services.greetingServiceImp;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SetterInjectedControllerTest {

@Autowired
    SetterInjectedController setterInjectedController;

    // @BeforeEach
    // void setUp(){
    //     setterInjectedController = new SetterInjectedController();
    //     setterInjectedController.setGreetingService(new greetingServiceImp());
    // }

    @Test
    void testSayHello() {

        System.out.println(setterInjectedController.sayHello());

        assertEquals("ServiceSetterInjection from the setterGreetingBean Service", setterInjectedController.sayHello());

    }

    @Test
    void testSetGreetingService() {

    }
}
