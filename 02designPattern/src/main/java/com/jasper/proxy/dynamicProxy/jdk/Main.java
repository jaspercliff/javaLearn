package com.jasper.proxy.dynamicProxy.jdk;

/**
 * @Author jasper @Date 2024-11-13
 *
 * @version 1.0
 */
public class Main {
    public static void main(String[] args){
         SmsService proxy = (SmsService)JdkProxyFactory.getProxy(new SmsServiceImpl());
        proxy.send("56789");
    }
}
