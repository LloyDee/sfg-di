package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/29/2022
 **/

@Service
public class SubSampleImpl implements IMathSample {
    @Override
    public int calcTwoNumbers(int num1, int num2) {
        int dif =num1-num2;
        System.out.println("The difference between "+num1+" and "+num2+" is "+dif);
        return dif;
    }
}
