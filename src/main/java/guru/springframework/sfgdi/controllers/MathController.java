package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.IMathSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/29/2022
 **/

@Component
public class MathController {
    private final IMathSample sample;

    @Autowired
    public MathController(@Qualifier("addSampleImpl") IMathSample sample) {
        this.sample = sample;
    }

    public int add(int n1, int n2) {
        return sample.calcTwoNumbers(n1, n2);
    }
}
