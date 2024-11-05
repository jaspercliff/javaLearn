package com.jasper.distribute;

import lombok.NonNull;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-11-01
 */
public class DatabaseDistributedLock implements DistributedLock{
    @Override
    public boolean tryLock(@NonNull String key, String value, Integer timeOut) {
        return false;
    }

    @Override
    public void unlock(@NonNull String key, String value) {

    }
}
