package com.jasper.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @Author jasper @Date 2024-11-15
 *
 * @version 1.0
 */
@Aspect
@Component
@Slf4j
public class TimeElapseAspect {

  @Pointcut("execution(* com.jasper.service.impl.*.*(..))")
  public void elapsedTime() {}

  @Around(value = "elapsedTime()")
  public Object elapsedTimeAdvice(@NotNull ProceedingJoinPoint joinPoint) throws Throwable {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
//    有返回值时需要return 不然最后不能执行方法
    Object proceed = joinPoint.proceed();
    stopWatch.stop();
    System.out.println("--------------------------------");
    log.info(
        "invoke method {} elapsed time {} ms",
        joinPoint.getSignature().getName(),
        stopWatch.getTotalTimeMillis());
    return proceed;
  }
}
