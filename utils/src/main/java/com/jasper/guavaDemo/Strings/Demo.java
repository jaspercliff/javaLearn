package com.jasper.guavaDemo.Strings;


import com.google.common.base.Strings;
@SuppressWarnings("ConstantConditions")
public class Demo {
    public static void main(String[] args) {
        String  a = " ";
//        不包含空字符串
        final boolean nullOrEmpty = Strings.isNullOrEmpty(a);
        System.out.println("nullOrEmpty = " + nullOrEmpty);
    }
}
