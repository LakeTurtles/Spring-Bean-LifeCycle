package dev.nyusu.springcore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import dev.nyusu.springcore.Controller.MainController;

@SpringBootTest
class SpringCoreApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MainController mainController;

	@Test
	void testAutowireOfController(){
		System.out.println(mainController.sayHello());
	}

	@Test
	void testGetControllerFromCtx() {
		MainController controller =applicationContext.getBean(MainController.class);

		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
