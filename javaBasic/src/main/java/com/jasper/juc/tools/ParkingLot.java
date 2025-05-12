package com.jasper.juc.tools;

import java.util.concurrent.Semaphore;

public class ParkingLot {
    private final Semaphore semaphore;

    public ParkingLot(int slots) {
        semaphore = new Semaphore(slots);
    }

    public void park(String car) {
        try {
            System.out.println(car + " 尝试停车");
            semaphore.acquire();
            System.out.println(car + " 成功停车");
            Thread.sleep(1000); // 假设停车时长
            semaphore.release();
            System.out.println(car + " 离开停车位");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5); // 假设有5个停车位

        for (int i = 1; i <= 10; i++) {
            final String car = "Car " + i;
            new Thread(() -> parkingLot.park(car)).start();
        }
    }
}