package com.jasper.reflect;

import com.jasper.pojo.Person;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ReflectDemo {
    public static void main(String[] args) {
        Person jasper = new Person("jasper", 15, null);
        Person cliff = new Person("cliff", 15, null);
        ArrayList<Person> people = new ArrayList<>();
        people.add(jasper);
        people.add(cliff);
        Class<? extends ArrayList> aClass = people.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }
}
//serialVersionUID
//DEFAULT_CAPACITY
//EMPTY_ELEMENTDATA
//DEFAULTCAPACITY_EMPTY_ELEMENTDATA
//elementData
//size
