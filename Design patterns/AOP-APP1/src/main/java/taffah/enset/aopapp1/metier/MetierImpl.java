package taffah.enset.aopapp1.metier;

import org.springframework.stereotype.Component;
import taffah.enset.aopapp1.aspects.Log;
import taffah.enset.aopapp1.aspects.SecuredByAspect;

@Component
public class MetierImpl implements IMetier{
    @Override
    @Log
    public void process() {
        System.out.println("Business processing ...");
    }
    @Override
    @SecuredByAspect(roles = {"ADMIN","USER"})
    public double compute() {
        double data=80;
        System.out.println("Business Computing and returning result ....");
        return data;
    }
}
