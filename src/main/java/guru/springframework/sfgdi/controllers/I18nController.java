package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/29/2022
 **/

@Controller
public class I18nController {
    private final IGreetingService greetingService;

    @Autowired
    public I18nController(@Qualifier("i18nService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
