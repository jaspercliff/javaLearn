package com.jasper.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Author jasper @Date 2024-11-14
 *
 * @version 1.0
 */
@Component
@Aspect
public class LogAspect {

    @Pointcut("@annotation(com.jasper.annotation.Log)")
    private void logPointCut(){}


    @Around(value = "logPointCut()")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
    }

}
