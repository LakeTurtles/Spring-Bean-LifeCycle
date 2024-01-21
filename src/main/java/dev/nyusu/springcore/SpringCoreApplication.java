package dev.nyusu.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import dev.nyusu.springcore.Controller.MainController;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class, args);

		MainController controller = ctx.getBean(MainController.class);

		System.out.println("In the Main Method");

		System.out.println(controller.sayHello());

		System.out.println("nonsa");
	}

}
