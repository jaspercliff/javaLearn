package com.jasper.juc.future;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                return 42;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("submit complete");

//        阻塞获取
        Integer i = future.get();
        System.out.println("i = " + i);
        executorService.shutdown();
    }
}
