package com.jasper.juc.atom.basic;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanDemo {
    public static void main(String[] args) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);

        final boolean b = atomicBoolean.compareAndSet(true, false);
        System.out.println("b = " + b);
    }
}
