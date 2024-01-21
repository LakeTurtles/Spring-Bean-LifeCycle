package dev.nyusu.springcore.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.nyusu.springcore.Services.greetingServiceImp;

@SpringBootTest
public class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController controller;

    // @BeforeEach
    // void setUp(){
    //     controller = new ConstructorInjectedController(new greetingServiceImp());
    // }

    @Test
    void testSayHello() {
        System.out.println(controller.sayHello());

    }
}
