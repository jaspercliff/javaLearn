package com.jasper.lombokDemo.pojo;

import lombok.Builder;
import lombok.ToString;
import lombok.Value;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-02
 * @description
 */
@Builder(toBuilder = true, builderClassName = "ImmutablePersonBuilder",builderMethodName = "personBuilder",
        buildMethodName = "create")
@ToString
@Value
public class ImmutablePerson {
        String firstName;
        String lastName;
        int age;
        String email;
        @Builder.Default
        String phone = "not provided";
}
