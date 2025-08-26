package com.jasper.juc.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final Callable<Integer> callable = () -> {
            Thread.sleep(2000);
            return 42;
        };
        final FutureTask<Integer> futureTask = new FutureTask<>(callable);
        final Thread thread = new Thread(futureTask);
        thread.start();

        futureTask.cancel(true);
        // System.out.println(futureTask.get());// 阻塞
        System.out.println(futureTask.isDone());
        System.out.println(futureTask.isCancelled());
    }
}
