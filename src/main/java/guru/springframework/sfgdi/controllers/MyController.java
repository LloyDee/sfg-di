package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/28/2022
 **/
@Controller
public class MyController {
private final IGreetingService greetingService;

    public MyController( IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
