package com.jasper.proxy.dynamicProxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @Author jasper @Date 2024-11-13
 *
 * @version 1.0
 */
public class JdkProxyFactory {
    public static Object getProxy(SmsService proxyObject){
        return Proxy.newProxyInstance(
                proxyObject.getClass().getClassLoader(), //目标类的类加载器
                proxyObject.getClass().getInterfaces(),//proxyObject需要实现的接口
                new SmsInvocationHandler(proxyObject) //代理对象自定义的invocationHandler
        );
    }
}
