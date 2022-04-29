package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController)applicationContext.getBean("i18nController") ;
		System.out.println(i18nController.sayHello()+"\n");

		MyController myController = (MyController)applicationContext.getBean("myController");
		System.out.println(myController.sayHello()+"\n");

		System.out.println("------Property------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting()+"\n");

		System.out.println("------Setter------");
		SetterInjectedController setterInjectedController = (SetterInjectedController)applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting()+"\n");

		System.out.println("------Constructor------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting()+"\n");

		System.out.println("------Math Sample------");

		MathController mathController =(MathController)applicationContext.getBean("mathController");
		mathController.add(21,32);
 	}

}
