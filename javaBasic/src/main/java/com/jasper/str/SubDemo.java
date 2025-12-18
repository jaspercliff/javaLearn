package com.jasper.str;

public class SubDemo {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";

// 判断字符串长度是否超过12
        if (str.length() > 12) {
            // 截取后12位
            str = str.substring(str.length() - 12);
        }

        System.out.println(str);

    }
}
