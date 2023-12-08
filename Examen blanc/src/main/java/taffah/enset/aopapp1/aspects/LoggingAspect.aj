package taffah.enset.aopapp1.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    @Before("@annotation(Log)")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Logging before method execution: " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(value = "@annotation(Log)", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Logging after method execution: " + joinPoint.getSignature().toShortString());
    }

    @AfterThrowing(value = "@annotation(Log)", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println("Logging after method throws exception: " + joinPoint.getSignature().toShortString());
    }
}

