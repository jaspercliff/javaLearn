package com.jasper.caffeine.population;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import com.jasper.pojo.Person;

import java.util.concurrent.TimeUnit;

public class Loading {
public static void main(String[] args) {
        int num = 10_000;
    final LoadingCache<Object, Person> loadingCache = Caffeine.newBuilder().
             expireAfterWrite(10, TimeUnit.MINUTES)
            .maximumSize(num).build(key -> repositoryGetById((long) key));

    // 第一次加载会触发load
    final Person person = loadingCache.get(2);
    // 第二次直接获取缓存
    final Person person1 = loadingCache.get(2);
}

    public static Person repositoryGetById(long key) {
        System.out.println("正在创建 person 对象：" + key);
        // 这里可以是复杂计算或数据库读取
        return new Person(2,"jasper");
    }
}
