package com.jasper.java8.optional;

import com.jasper.pojo.User;

import java.util.Optional;

public class Demo1 {
    public static void main(String[] args) {
        Optional<User> optional = Optional.ofNullable(getUserById(1));
        optional.ifPresent(System.out::println);
    }

    private static User getUserById(Integer id) {
        return null;
    }
}
