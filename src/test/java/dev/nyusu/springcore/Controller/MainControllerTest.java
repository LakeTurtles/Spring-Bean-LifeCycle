package dev.nyusu.springcore.Controller;

import org.junit.jupiter.api.Test;

public class MainControllerTest {
    @Test
    void testSayHello() {

        MainController controller = new MainController();

        System.out.println(controller.sayHello());

    }
}
