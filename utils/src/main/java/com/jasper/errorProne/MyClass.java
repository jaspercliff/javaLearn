package com.jasper.errorProne;

public class MyClass {
    public static void main(String[] args) {
        final boolean compare = compare("1", "1");
        System.out.println("compare = " + compare);
    }

    public static boolean compare(String a, String b) {
        return a == b; // Error Prone 会报错：使用 == 比较字符串
    }
}