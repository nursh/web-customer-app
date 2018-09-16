package com.nursh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {

    private Logger logger =
        Logger.getLogger(this.getClass().getName());

    @Pointcut("execution(* com.nursh.controller.*.*(..))")
    public void forControllerPackage() {}

    @Pointcut("execution(* com.nursh.service.*.*(..))")
    public void forServicePackage() {}

    @Pointcut("execution(* com.nursh.dao.*.*(..))")
    public void forDAOPackage() {}

    @Pointcut("forControllerPackage() || forDAOPackage() || forServicePackage()")
    public void forAppFlow() {}

    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().toShortString();
        logger.info("@Before method name: " + method);

        Object[] args = joinPoint.getArgs();
        for(Object arg : args) {
            logger.info("\n " + arg);
        }
    }

}
