package com.jasper.lombokDemo.annotations;

import com.jasper.lombokDemo.pojo.ImmutablePerson;
import com.jasper.lombokDemo.pojo.Test;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-02
 * @description
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Test test = Test.builder().age(1).firstName("jasper").lastName("cliff").email("test@qq.com").build();
        System.out.println("Animal = " + test);
        Test.TestBuilder builder = test.toBuilder();
        System.out.println("builder = " + builder);
        Test test1 =builder.phone("1234567890").build();
        System.out.println("test1 = " + test1);


        ImmutablePerson build = ImmutablePerson.personBuilder().age(1).firstName("jasper").lastName("cliff").email("test@qq.com").create();
        System.out.println("build = " + build);
        System.out.println("build.getPhone() = " + build.getPhone());

    }
}
