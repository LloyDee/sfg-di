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
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public IGreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
