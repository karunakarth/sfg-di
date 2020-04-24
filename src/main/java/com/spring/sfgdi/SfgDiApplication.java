package com.spring.sfgdi;

import com.spring.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.sfgdi.services","com.spring"})
public class SfgDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SfgDiApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println(".................Property Injector");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println("Property I "+propertyInjectedController.getGreeting());

		System.out.println(".................Setter Injector");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println("Setter I "+setterInjectedController.getGreeting());

		System.out.println(".................Constructor Injector");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println("Constructor I "+constructorInjectedController.getGreeting());

		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		PetController petController = (PetController)ctx.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());
	}

}
