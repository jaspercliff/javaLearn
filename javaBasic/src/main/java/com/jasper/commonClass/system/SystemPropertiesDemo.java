package com.jasper.commonClass.system;

public class SystemPropertiesDemo {
    public static void main(String[] args) {
        System.getProperties().forEach((k, v)
                -> System.out.println(k + " = " + v));
    }
}
