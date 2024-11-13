package com.jasper.proxy.dynamicProxy.jdk;

import lombok.RequiredArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author jasper @Date 2024-11-13
 *
 * @version 1.0
 */
@RequiredArgsConstructor
public class SmsInvocationHandler implements InvocationHandler {

  /** 代理中的真实对象 */
  private final Object service;

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("before method" + method.getName());
    Object invoke = method.invoke(service, args);
    System.out.println("after method" + method.getName());
    return invoke;
  }
}
