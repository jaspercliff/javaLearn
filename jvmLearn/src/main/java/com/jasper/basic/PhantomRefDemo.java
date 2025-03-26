package com.jasper.basic;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * 对象被回收后会进入 ReferenceQueue，用于检测对象是否被回收，适用于 管理
 * DirectMemory（NIO）等资源回收。
 */
public class PhantomRefDemo {
    public static void main(String[] args) {
        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        PhantomReference<Object> phantomRef = new PhantomReference<>(new Object(), queue);
        System.gc();
        System.out.println(phantomRef.get()); // 永远返回 null
        System.out.println(queue.poll() != null); // 判断对象是否被回收
    }
}
