package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/28/2022
 **/
@Service
public class PropertyGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Property";
    }
}
