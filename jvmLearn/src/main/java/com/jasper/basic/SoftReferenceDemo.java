package com.jasper.basic;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class SoftReferenceDemo {
    public static void main(String[] args) {
        SoftReference<byte[]> softRef = new SoftReference<>(new byte[10 * 1024 * 1024]); // 10MB
        System.gc();
        System.out.println(softRef.get() != null); // 可能仍然存在

        byte[] newAlloc = new byte[15 * 1024 * 1024]; // 内存不足，软引用被回收
        System.out.println(softRef.get() != null); // 可能被回收    堆空间足够大 不一定会回收


    }
}
