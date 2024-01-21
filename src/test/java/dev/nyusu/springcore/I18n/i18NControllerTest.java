package dev.nyusu.springcore.I18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


//@ActiveProfiles("ES")
@SpringBootTest
class i18NControllerTest {

    @Autowired
    i18NController i18NController1;

    @Test
    void sayHello(){
        System.out.println(i18NController1.sayHello());
    }


}