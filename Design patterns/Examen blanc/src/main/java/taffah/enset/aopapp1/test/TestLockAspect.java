package taffah.enset.aopapp1.test;

import taffah.enset.aopapp1.aspects.Lock;

public class TestLockAspect {
    public static void main(String[] args) {
        testLockAspect();
    }
    @Lock
    public static void testLockAspect(){
        System.out.println("Its locked method");
    }
}
