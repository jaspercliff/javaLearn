package com.jasper.juc.tools;

import java.util.concurrent.CountDownLatch;

/**
 * countdownLatch 不涉及锁的的获取释放等，通过内部的计数器等待其他的线程先完成
 * wait 是object的方法，必须和synchronized一起使用 涉及锁的获取和释放
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 3;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {
            new Thread(new Worker(i,countDownLatch)).start();
        }
        countDownLatch.await();
        System.out.println("主线程finished");
    }


    static class Worker implements Runnable{
        private int id;
        private CountDownLatch latch;

        public Worker(int id, CountDownLatch latch) {
            this.id = id;
            this.latch = latch;
        }
        @Override
        public void run() {
            try {
                Thread.sleep((long) (Math.random() * 1000));
                System.out.println("thread id:" + id + " finished");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                latch.countDown();
            }
        }
    }

}
