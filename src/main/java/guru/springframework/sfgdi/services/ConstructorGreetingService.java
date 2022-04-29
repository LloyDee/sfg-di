package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/28/2022
 **/
@Service
public class ConstructorGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
