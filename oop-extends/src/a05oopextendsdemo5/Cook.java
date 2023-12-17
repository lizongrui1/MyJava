package a05oopextendsdemo5;

import java.security.spec.RSAOtherPrimeInfo;

public class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }
}
