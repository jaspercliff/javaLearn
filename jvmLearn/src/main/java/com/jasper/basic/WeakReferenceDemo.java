package com.jasper.basic;

import java.lang.ref.WeakReference;

public class WeakReferenceDemo {
    public static void main(String[] args) {
        WeakReference<byte[]> weakRef = new WeakReference<>(new byte[10 * 1024 * 1024]); // 10MB
        System.gc();
        System.out.println(weakRef.get() != null); //只要发生gc 就会被回收
    }
}
