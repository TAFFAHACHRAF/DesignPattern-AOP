package taffah.enset.aopapp1.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LockingAspect {

    @Around("@annotation(taffah.enset.aopapp1.aspects.Lock)")
    public Object lockMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Method locked: " + joinPoint.getSignature().toShortString());

        // Custom logic for locking (you can throw an exception, log, or perform other actions)
        // For example, return null to indicate that the method is locked
        return null;
    }

}
