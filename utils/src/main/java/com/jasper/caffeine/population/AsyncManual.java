package com.jasper.caffeine.population;

import com.github.benmanes.caffeine.cache.AsyncCache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AsyncManual {
    public static void main(String[] args) {
        final AsyncCache<Object,  Object> cache = Caffeine.newBuilder()
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .maximumSize(100).buildAsync();
            cache.put("1", CompletableFuture.completedFuture("jasper"));
        final CompletableFuture<@NonNull Object> key1 = cache.getIfPresent("1");
        System.out.println("key1 = " + key1.join());
    }
}
