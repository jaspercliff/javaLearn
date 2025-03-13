package com.jasper.factory;

import java.text.NumberFormat;

public class NumberFormatDemo {
    public static void main(String[] args) {
        // 获取默认的数字格式化对象
        NumberFormat nf = NumberFormat.getInstance();
        double number = 12345.6789;
        System.out.println("Default format: " + nf.format(number));

        // 获取百分比格式化对象
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println("Percent format: " + percentFormat.format(0.1234));
    }
}
