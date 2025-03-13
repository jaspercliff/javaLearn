package com.jasper.juc.atom.basic;

public class SharedCounter {
    private int count = 0;

    public  void increment() {
        count++;
    }

    public  int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count is: " + counter.getCount());
    }
}