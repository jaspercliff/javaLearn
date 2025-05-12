package com.jasper.collect.map;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        final HashMap<String, String> map = new HashMap<>();
        map.put("test","1");
        final String number = map.getOrDefault("test", "2");
        System.out.println("number = " + number);
        final String number1 = map.getOrDefault("test1", "2");
        System.out.println("number1 = " + number1);
    }
}
