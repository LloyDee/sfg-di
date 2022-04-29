package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/29/2022
 **/
@Service
@Primary
public class PrimaryGreeting implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! From PRIMARY BEAN";
    }
}
