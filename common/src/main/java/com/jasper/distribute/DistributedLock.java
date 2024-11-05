package com.jasper.distribute;

import lombok.NonNull;

public interface DistributedLock {
    boolean tryLock(@NonNull String key,String value,Integer timeOut);
    void unlock(@NonNull String key,String value);
}
