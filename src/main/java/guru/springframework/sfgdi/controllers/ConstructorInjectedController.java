package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/28/2022
 **/

@Controller
public class ConstructorInjectedController {
    private final IGreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
