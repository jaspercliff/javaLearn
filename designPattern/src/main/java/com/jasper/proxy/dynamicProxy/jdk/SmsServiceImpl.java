package com.jasper.proxy.dynamicProxy.jdk;

/**
 * @Author jasper @Date 2024-11-13
 *
 * @version 1.0
 */
public class SmsServiceImpl implements SmsService {

  @Override
  public String send(String message) {
    System.out.println("smsService send message is" + message);
    return message;
  }

}
