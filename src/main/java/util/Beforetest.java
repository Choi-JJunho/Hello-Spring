package util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Beforetest {

    @Before("execution(* service.*Servce.*(..))")
    public void before(JoinPoint joinPoint) {
        joinPoint.getSignature();
    }
}
