package com.jasper.basic.other;

public class SystemPropertyDemo2 {
    public static void main(String[] args) {
        final String property = System.getProperty("name", "default");
        System.out.println("property = " + property);
    }
}
