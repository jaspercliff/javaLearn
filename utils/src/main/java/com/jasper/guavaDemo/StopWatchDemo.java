package com.jasper.guavaDemo;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @Author jasper
 * @Date 2024-08-20
 * @version 1.0
 * @description stopwatch learn
 */
public class StopWatchDemo {
    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println("stopwatch = " + stopwatch);
        for (int i = 0; i < 10000; i++) {
            Math.random();
        }
        System.out.println("stopwatch.isRunning() = " + stopwatch.isRunning());
        stopwatch.stop();
        System.out.println("after stop stopwatch.isRunning() = " + stopwatch.isRunning());
        long elapsed = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("elapsed = " + elapsed+"ms");

        System.out.println("elapsed = " + elapsed);

        System.out.println("stopwatch = " + stopwatch);
        Stopwatch reset = stopwatch.reset();
        System.out.println("reset = " + reset);
    }
}
