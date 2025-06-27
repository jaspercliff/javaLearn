package com.jasper.java8.functionInterface;

import com.jasper.pojo.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.forEach((s, integer) -> System.out.println(s + "-" + integer));

        BiConsumer<String, Integer> printName = (name, age) -> System.out.println("Name: " + name);
        BiConsumer<String, Integer> printAge = (name, age) -> System.out.println("Age: " + age);
        BiConsumer<String, Integer> printBoth = printName.andThen(printAge);
        printBoth.accept("Tom",28);

        Person p = new Person("John", 20);
        BiConsumer<Person, String> setName = Person::setName;
        BiConsumer<Person, Integer> setAge = Person::setAge;
        setName.accept(p, "Jane");
        setAge.accept(p, 25);
        System.out.println(p);
    }
}
