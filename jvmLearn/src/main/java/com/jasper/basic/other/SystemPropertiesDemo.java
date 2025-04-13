package com.jasper.basic.other;

public class SystemPropertiesDemo {
    public static void main(String[] args) {
        System.getProperties().forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
