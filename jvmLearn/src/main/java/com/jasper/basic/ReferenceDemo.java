package com.jasper.basic;

import java.lang.ref.SoftReference;

/**
 * -Xmx20M -Xms20M -XX:+PrintGCDetails
 */
public class ReferenceDemo {
    public static void main(String[] args) {
        Object o = new Object();//强引用  默认引用类型 永远不会收拾
        System.gc();//建议JVM启动垃圾回收过程，但并不保证会立即执行垃圾回收;
        System.out.println(o); // 仍然存在

    }
}
