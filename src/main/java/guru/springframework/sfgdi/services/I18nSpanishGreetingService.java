package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/29/2022
 **/
@Profile("ES")
@Service ("i18nService")
public class I18nSpanishGreetingService implements IGreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo -ES";
    }
}
