package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @Project sfg-di
 * @Author loyd_ on 4/29/2022
 **/

@Service
public class AddSampleImpl implements IMathSample{

    @Override
    public int calcTwoNumbers(int n1, int n2) {
        int sum = Integer.sum(n1,n2);
        System.out.println("The sum of "+n1+" and "+n2+" is "+sum);
        return Integer.sum(n1,n2);
    }
}
