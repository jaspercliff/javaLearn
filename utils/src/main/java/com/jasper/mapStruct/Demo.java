package com.jasper.mapStruct;

import com.jasper.mapStruct.convert.PersonMapper;
import com.jasper.pojo.Person;
import com.jasper.pojo.PersonDTO;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-30
 */
public class Demo {
    public static void main(String[] args) {
        Person jasper = new Person("jasper", 20, Arrays.asList("smoke","swim"));

        PersonDTO personDTO = PersonMapper.INSTANCE.toPersonDTO(jasper);
        System.out.println("personDTO = " + personDTO);
    }
}
